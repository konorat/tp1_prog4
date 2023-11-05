package Sort;

import Model.MusicInfo;

import java.io.IOException;
import java.util.List;

import static Service.WriteFile.writeFile;


public class HeapSort {
    private static int comp = 0;
    private static int swap = 0;

    public static int getComp() {
        return comp;
    }

    public static int getSwap() {
        return swap;
    }

    public List<MusicInfo> heapSort(List<MusicInfo> list, String atributo) throws IOException {
        int n = list.size();


        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(list, n, i, atributo);
        }


        for (int i = n - 1; i > 0; i--) {

            MusicInfo temp = list.get(0);
            list.set(0, list.get(i));
            list.set(i, temp);


            heapify(list, i, 0, atributo);
        }
    return list;
    }

    public static void heapify(List<MusicInfo> list, int n, int i, String atributo) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if(atributo == "nome"){
            if (left < n && list.get(left).getTrackName().compareTo(list.get(largest).getTrackName()) > 0) {
                comp++;
                largest = left;
            }

            if (right < n && list.get(right).getTrackName().compareTo(list.get(largest).getTrackName()) > 0) {
                comp++;
                largest = right;
            }

            if (largest != i) {
                MusicInfo temp = list.get(i);
                list.set(i, list.get(largest));
                list.set(largest, temp);
                swap++;

                heapify(list, n, largest, atributo);
            }
        }else if(atributo == "artista"){
            if (left < n && list.get(left).getArtistName().compareTo(list.get(largest).getArtistName()) > 0) {
                comp++;
                largest = left;
            }

            if (right < n && list.get(right).getArtistName().compareTo(list.get(largest).getArtistName()) > 0) {
                comp++;
                largest = right;
            }

            if (largest != i) {
                MusicInfo temp = list.get(i);
                list.set(i, list.get(largest));
                list.set(largest, temp);
                swap++;

                heapify(list, n, largest, atributo);
            }
        }
    }
}
