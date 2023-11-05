package Sort;

import Model.MusicInfo;

import java.io.IOException;
import java.util.List;

import static Service.WriteFile.writeFile;

public class SelectionSort {


    public static List<MusicInfo> selectionSort(List<MusicInfo> list, String atributo) throws IOException {
        int comp = 0;
        int swap = 0;

        for (int i = 0; i < (list.size() - 1); i++) {
            int indiceMenor = i;

            for (int j = i + 1; j < list.size(); j++) {
                comp++;
                if (atributo == "nome") {
                    if (list.get(j).getTrackName().compareTo(list.get(indiceMenor).getTrackName()) < 0) {
                        indiceMenor = j;
                    }
                } else if(atributo == "artista"){
                    if (list.get(j).getArtistName().compareTo(list.get(indiceMenor).getArtistName()) < 0) {
                        indiceMenor = j;
                    }
                }
            }

            MusicInfo temp = list.get(i);
            list.set(i, list.get(indiceMenor));
            list.set(indiceMenor, temp);
            swap++;
        }

        writeFile("Selection Sort considerando: " + atributo);
        writeFile("Comparações: " + comp);
        writeFile("Trocas: " + swap);
        return list;
    }

}
