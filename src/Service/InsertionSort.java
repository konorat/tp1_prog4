package Service;

import model.MusicInfo;

import java.util.List;

public class InsertionSort {

    public static List<MusicInfo> insertionSort (List<MusicInfo> list, String atributo){

        for (int i = 1; i < list.size(); i++) {
            MusicInfo mi = list.get(i);
            int j = i - 1;

            if(atributo == "nome"){
                while (j >= 0 && list.get(j).getTrackName().compareTo(mi.getTrackName()) > 0) {
                    list.set(j + 1, list.get(j));
                    j = j - 1;
                }
                list.set(j + 1, mi);
            } else if (atributo == "artista") {
                while (j >= 0 && list.get(j).getArtistName().compareTo(mi.getArtistName()) > 0) {
                    list.set(j + 1, list.get(j));
                    j = j - 1;
                }
                list.set(j + 1, mi);
            }
        }
        return list;
    }
}
