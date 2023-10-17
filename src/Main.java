import Service.CSVReader;
import model.MusicInfo;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static Service.InsertionSort.insertionSort;
import static Service.SelectionSort.selectionSort;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Hello world!");


        CSVReader csvReader = new CSVReader();
        csvReader.ReadCSV("C:\\Users\\aluno\\Desktop\\konorat\\archive\\spotify-2023.csv");
        List<MusicInfo> musicInfoList = csvReader.getMusicInfoList();

        boolean sair = true;

        while(sair) {
            System.out.println("======= Bem-vindo(a) ==========");
            System.out.println("===== Opções de ordenação =====");
            System.out.println("1 - Ordenar por nome da música utilizando seleção");
            System.out.println("2 - Ordenar por nome da música utilizando inserção");
            System.out.println("3 - Ordenar por nome do artista utilizando seleção");
            System.out.println("4 - Ordenar por nome do artista utilizando inserção");
            System.out.println("5 - Finalizar programa!");
            
            Scanner in = new Scanner(System.in);

            String op = in.nextLine();
            System.out.println(op);

            switch(op) {
                case "1":
                List<MusicInfo> list1 = new ArrayList<MusicInfo>(musicInfoList);
                List<MusicInfo> selectionTrack = selectionSort(list1, "nome");

                for (MusicInfo musicInfo : selectionTrack) {
                    System.out.println("Ordenação por Seleção Nome Música: " + musicInfo);
                }
                break;

                case "2":
                List<MusicInfo> list2 = new ArrayList<MusicInfo>(musicInfoList);
                List<MusicInfo> insertionTrack = insertionSort(list2, "nome");

                for (MusicInfo musicInfo : insertionTrack) {
                    System.out.println("Ordenação por Seleção Nome Música: " + musicInfo);
                }
                break;
            }
        }
        System.out.println("Fim!");


        //List<MusicInfo> selectionArtist = selectionSort(musicInfoList, "artista");

        // for (MusicInfo musicInfo : selectionArtist) {
        //     System.out.println("Ordenação por Seleção Artista: " + musicInfo);
        // }

        
        //List<MusicInfo> insertionArtist = insertionSort(musicInfoList, "artista");

        // for (MusicInfo musicInfo : insertionTrack) {
        //     System.out.println("Ordenação por Inserção Nome Música: " + musicInfo);
        // }

        // for (MusicInfo musicInfo : insertionArtist) {
        //      System.out.println("Ordenação por Inserção Artista: " + musicInfo);
        // }
    }
}