import Service.CSVReader;
import model.MusicInfo;

import java.io.FileNotFoundException;
import java.util.List;

import static Service.InsertionSort.insertionSort;
import static Service.SelectionSort.selectionSort;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Hello world!");


        CSVReader csvReader = new CSVReader();
        csvReader.ReadCSV("/home/matheus/Desktop/archive/spotify-2023.csv");
        List<MusicInfo> musicInfoList = csvReader.getMusicInfoList();


        // "nome" para ordenar por seleção pelo nome da música
        // "artista" para ordenar por seleção pelo nome do artista
        List<MusicInfo> selectionTrack = selectionSort(musicInfoList, "nome");
        List<MusicInfo> selectionArtist = selectionSort(musicInfoList, "artista");

        for (MusicInfo musicInfo : selectionTrack) {
            System.out.println("Ordenação por Seleção Nome Música: " + musicInfo);
        }

        for (MusicInfo musicInfo : selectionArtist) {
            System.out.println("Ordenação por Seleção Artista: " + musicInfo);
        }

        List<MusicInfo> inserctionTrack = insertionSort(musicInfoList, "nome");
        List<MusicInfo> inserctionArtist = insertionSort(musicInfoList, "artista");

        for (MusicInfo musicInfo : inserctionTrack) {
            System.out.println("Ordenação por Inserção Nome Música: " + musicInfo);
        }

        for (MusicInfo musicInfo : inserctionArtist) {
            System.out.println("Ordenação por Inserção Artista: " + musicInfo);
        }
    }
}