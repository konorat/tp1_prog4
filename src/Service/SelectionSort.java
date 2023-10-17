package Service;

import model.MusicInfo;

import java.util.List;

public class SelectionSort {


    public static List<MusicInfo> selectionSort(List<MusicInfo> list, String atributo) {
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
            // Trocar o elemento atual com o menor elemento encontrado
            MusicInfo temp = list.get(i);
            list.set(i, list.get(indiceMenor));
            list.set(indiceMenor, temp);
            swap++;
        }
        System.out.println("Comparações: " + comp);
        System.out.println("Trocas: " + swap);
        return list;
    }

}
