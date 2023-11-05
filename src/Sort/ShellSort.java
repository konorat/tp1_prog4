package Sort;

import Model.MusicInfo;

import java.io.IOException;
import java.util.List;

import static Service.WriteFile.writeFile;

public class ShellSort {
    private int comp = 0;
    private int swap = 0;

    public int getComp() {
        return comp;
    }

    public int getSwap() {
        return swap;
    }

    public List<MusicInfo> shellSort (List<MusicInfo> list, String atributo) throws IOException {
        int n = list.size();

        for (int gap = n / 2; gap > 0; gap /= 2) {

            for (int i = gap; i < n; i++) {
                MusicInfo mi = list.get(i);
                int j = i - gap;

                if (atributo.equals("nome")) {
                    List<MusicInfo> sublist = list.subList(0, i + 1); // Sublista de elementos a serem ordenados
                    InsertionSort.insertionSort(sublist, "nome");
                    comp += InsertionSort.getComp();
                    swap += InsertionSort.getSwap();
                } else if (atributo.equals("artista")) {
                    List<MusicInfo> sublist = list.subList(0, i + 1); // Sublista de elementos a serem ordenados
                    InsertionSort.insertionSort(sublist, "artista");
                    comp += InsertionSort.getComp();
                    swap += InsertionSort.getSwap();
                }
            }

        }

        return list;
    }
}
