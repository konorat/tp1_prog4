package Sort;

import Model.MusicInfo;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class MergeSort {

    private static int comp = 0;
    private static int swap = 0;

    public int getComp() {
        return comp;
    }

    public int getSwap() {
        return swap;
    }

    public List<MusicInfo> mergeSort(List<MusicInfo> list, String atributo) throws IOException {

        int n = list.size();

        if (n <= 1) {
            return list;
        }

        int meio = n / 2;
        List<MusicInfo> left = new LinkedList<>();
        List<MusicInfo> right = new LinkedList<>();


        for (int i = 0; i < meio; i++) {
            left.add(list.get(i));
        }

        for (int i = meio; i < n; i++) {
            right.add(list.get(i));
        }


        mergeSort(left, atributo);
        mergeSort(right, atributo);


        merge(list, left, right, atributo);

    return list;
    }

    public static void merge(List<MusicInfo> list, List<MusicInfo> left, List<MusicInfo> right, String atributo) {
        int nL = left.size();
        int nR = right.size();
        int i = 0, j = 0, k = 0;

        if(atributo == "nome"){
            while (i < nL && j < nR) {
                comp++;
                if (left.get(i).getTrackName().compareTo(right.get(j).getTrackName()) <= 0) {
                    list.set(k, left.get(i));
                    i++;
                } else {
                    list.set(k, right.get(j));
                    j++;
                }
                k++;
                swap++;
            }

            while (i < nL) {
                list.set(k, left.get(i));
                i++;
                k++;
                swap++;
            }

            while (j < nR) {
                list.set(k, right.get(j));
                j++;
                k++;
                swap++;
            }
        }else if(atributo == "artista" ){
            comp++;
            while (i < nL && j < nR) {
                if (left.get(i).getArtistName().compareTo(right.get(j).getArtistName()) <= 0) {
                    list.set(k, left.get(i));
                    i++;
                } else {
                    list.set(k, right.get(j));
                    j++;
                }
                k++;
                swap++;
            }

            while (i < nL) {
                list.set(k, left.get(i));
                i++;
                k++;
                swap++;
            }

            while (j < nR) {
                list.set(k, right.get(j));
                j++;
                k++;
                swap++;
            }
        }
    }
}
