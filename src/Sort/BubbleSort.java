package Sort;

import Model.MusicInfo;

import java.io.IOException;
import java.util.List;

import static Service.WriteFile.writeFile;

public class BubbleSort {

    public static List<MusicInfo> bubbleSort (List<MusicInfo> list, String atributo) throws IOException {

        int comp = 0;
        int swap = 0;
        boolean swapped = false;
        int n = list.size();

        for (int i = 0; i < n - 1; i++) {
            comp++;
            swapped = false;

            if (atributo == "nome") {
                for (int j = 0; j < n - i - 1; j++) {
                    MusicInfo mi = list.get(j);
                    MusicInfo mii = list.get(j + 1);
                    if (mi.getTrackName().compareTo(mii.getTrackName()) > 0) {

                        MusicInfo temp = mi;
                        list.set(j, mii);

                        list.set(j + 1, temp);

                        swapped = true;
                        swap++;
                    }
                }
            } else if (atributo == "artista") {
                for (int j = 0; j < n - i - 1; j++) {
                    MusicInfo mi = list.get(j);
                    MusicInfo mii = list.get(j + 1);
                    if (mi.getArtistName().compareTo(mii.getArtistName()) > 0) {

                        MusicInfo temp = mi;
                        list.set(j, mii);

                        list.set(j + 1, temp);

                        swapped = true;
                        swap++;
                    }
                }
            }

            if (!swapped) {
                break;
            }

        }
        writeFile("Bubble Sort considerando: " + atributo);
        writeFile("Comparações: " + comp);
        writeFile("Trocas: " + swap);
        return list;
    }
}
