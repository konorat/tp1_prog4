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
        csvReader.ReadCSV("/home/matheus/Desktop/archive/spotify-2023.csv");
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

            switch(op) {
                case "1":
                    List<MusicInfo> list1 = new ArrayList<MusicInfo>(musicInfoList);
                    long startTime = System.currentTimeMillis();
                    List<MusicInfo> selectionTrack = selectionSort(list1, "nome");
                    long endTime = System.currentTimeMillis();
                    long executionTime = endTime - startTime;
                    System.out.println(executionTime);

//                    for (MusicInfo musicInfo : selectionTrack) {
//                        System.out.println("Ordenação por Seleção Nome Música: " + musicInfo);
//                    }

                    break;

                case "2":
                    List<MusicInfo> list2 = new ArrayList<MusicInfo>(musicInfoList);
                    long startTime2 = System.currentTimeMillis();
                    List<MusicInfo> insertionTrack = insertionSort(list2, "nome");
                    long endTime2 = System.currentTimeMillis();
                    long executionTime2 = endTime2 - startTime2;
                    System.out.println(executionTime2);

//                    for (MusicInfo musicInfo : insertionTrack) {
//                        System.out.println("Ordenação por Inserção Nome Música: " + musicInfo);
//                    }
                    break;

                case "3":
                    List<MusicInfo> list3 = new ArrayList<MusicInfo>(musicInfoList);
                    long startTime3 = System.currentTimeMillis();
                    List<MusicInfo> selectionArtist = selectionSort(list3, "artista");
                    long endTime3 = System.currentTimeMillis();
                    long executionTime3 = endTime3 - startTime3;
                    System.out.println(executionTime3);

//                    for (MusicInfo musicInfo : selectionArtist) {
//                        System.out.println("Ordenação por Seleção Artista: " + musicInfo);
//                    }
                    break;

                case "4":
                    List<MusicInfo> list4 = new ArrayList<MusicInfo>(musicInfoList);
                    long startTime4 = System.currentTimeMillis();
                    List<MusicInfo> insertionArtist = insertionSort(list4, "artista");
                    long endTime4 = System.currentTimeMillis();
                    long executionTime4 = endTime4 - startTime4;
                    System.out.println(executionTime4);


//                     for (MusicInfo musicInfo : insertionArtist) {
//                          System.out.println("Ordenação por Inserção Artista: " + musicInfo);
//                     }
                    break;

                case "5":
                    sair = false;

                default:
                    System.out.println("Opção inválida!");
            }
        }
        System.out.println("Fim!");

    }
}