package Service;

import model.MusicInfo;

import java.sql.SQLOutput;
import java.util.List;

public class InsertionSort {

    public static List<MusicInfo> insertionSort (List<MusicInfo> list, String atributo){
        int comp = 0;
        int swap = 0;

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
        System.out.println("Comparações: " + comp);
        System.out.println("Trocas: " + swap);
        return list;
    }
}
