package Sort;

import Model.MusicInfo;

import java.io.IOException;
import java.util.List;

import static Service.WriteFile.writeFile;

public class QuickSort {
    private static int comp= 0;
    private static int swap = 0;

    public static int getComp() {
        return comp;
    }

    public static int getSwap() {
        return swap;
    }

    public static List<MusicInfo> quickSort (List<MusicInfo> list, String atributo, int left, int right) throws IOException {

        if (left < right) {
            int pivotIndex = partition(list, left, right, atributo);
            quickSort(list, atributo, left, pivotIndex - 1);
            quickSort(list, atributo,pivotIndex + 1, right);
        }

        return list;
    }

    public static int partition(List<MusicInfo> list, int left, int right, String atributo) {
        MusicInfo pivot = list.get(right);
        int i = left - 1;

        if(atributo == "nome"){
            for (int j = left; j < right; j++) {
                comp++;
                if (list.get(j).getTrackName().compareTo(pivot.getTrackName()) < 0) {
                    i++;
                    swap(list, i, j);
                }
            }
        } else if (atributo == "artista") {
            for (int j = left; j < right; j++) {
                comp++;
                if (list.get(j).getArtistName().compareTo(pivot.getArtistName()) < 0) {
                    i++;
                    swap(list, i, j);
                }
            }
        }

        swap(list, i + 1, right);
        swap++;
        return i + 1;
    }

    public static void swap(List<MusicInfo> list, int i, int j) {
        MusicInfo temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
        swap++;
    }

}
