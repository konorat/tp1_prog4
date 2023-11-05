package Sort;

import Model.MusicInfo;

import java.io.IOException;
import java.util.List;

public class InsertionSort {
    private static int comp = 0;
    private static int swap = 0;

    public static int getComp() {
        return comp;
    }

    public static int getSwap() {
        return swap;
    }

    public static List<MusicInfo> insertionSort (List<MusicInfo> list, String atributo) throws IOException {
//        int comp = 0;
//        int swap = 0;

        for (int i = 1; i < list.size(); i++) {
            MusicInfo mi = list.get(i);
            int j = i - 1;

            if(atributo == "nome"){
                while (j >= 0 && list.get(j).getTrackName().compareTo(mi.getTrackName()) > 0) {
                    list.set(j + 1, list.get(j));
                    j = j - 1;

                    comp++;
                    swap++;
                }
                list.set(j + 1, mi);
            } else if (atributo == "artista") {
                while (j >= 0 && list.get(j).getArtistName().compareTo(mi.getArtistName()) > 0) {
                    list.set(j + 1, list.get(j));
                    j = j - 1;

                    comp++;
                    swap++;
                }
                list.set(j + 1, mi);
            }
        }

        return list;
    }
}
