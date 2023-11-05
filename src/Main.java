import Service.CSVReader;
import Model.MusicInfo;
import Sort.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static Service.WriteFile.writeFile;
import static Sort.InsertionSort.insertionSort;
import static Sort.QuickSort.quickSort;
import static Sort.SelectionSort.selectionSort;
import static Sort.BubbleSort.bubbleSort;


public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello world!");


        CSVReader csvReader = new CSVReader();
        String currentDirectory = System.getProperty("user.dir");
        csvReader.ReadCSV(currentDirectory + "/spotify-2023.csv");
        List<MusicInfo> musicInfoList = csvReader.getMusicInfoList();

        boolean sair = true;


        while(sair) {
            System.out.println("======= Bem-vindo(a) ==========");
            System.out.println("===== Opções de ordenação =====");
            System.out.println("1 - Ordenar por nome da música utilizando seleção");
            System.out.println("2 - Ordenar por nome da música utilizando inserção");
            System.out.println("3 - Ordenar por nome do artista utilizando seleção");
            System.out.println("4 - Ordenar por nome do artista utilizando inserção");
            System.out.println("5 - Ordenar por nome do artista utilizando bubble sort");
            System.out.println("6 - Ordenar por nome da musica utilizando bubble sort");
            System.out.println("7 - Ordenar por nome da musica utilizando shell sort");
            System.out.println("8 - Ordenar por nome do artista utilizando shell sort");
            System.out.println("9 - Ordenar por nome da musica utilizando quick sort");
            System.out.println("10 - Ordenar por nome do artista utilizando quick sort");
            System.out.println("11 - Ordenar por nome da musica utilizando heap sort");
            System.out.println("12 - Ordenar por nome do artista utilizando heap sort");
            System.out.println("13 - Ordenar por nome da musica utilizando merge sort");
            System.out.println("14 - Ordenar por nome do artista utilizando merge sort");
            System.out.println("99 - Finalizar programa!");
            
            Scanner in = new Scanner(System.in);

            String op = in.nextLine();

            switch(op) {
                case "1":
                    List<MusicInfo> list1 = new ArrayList<MusicInfo>(musicInfoList);
                    long startTime = System.currentTimeMillis();
                    List<MusicInfo> selectionTrack = selectionSort(list1, "nome");
                    long endTime = System.currentTimeMillis();
                    long executionTime = endTime - startTime;
                    writeFile("Tempo de execução: " + executionTime);
                    writeFile("Complexidade: melhor caso: O(n^2) | pior caso: O(n^2)");
                    writeFile(" ");

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
                    writeFile("Inserction Sort considerando: nome");
                    writeFile("Comparações: " + InsertionSort.getComp());
                    writeFile("Trocas: " + InsertionSort.getSwap());
                    writeFile("Tempo de execução: " + executionTime2);
                    writeFile("Complexidade: melhor caso: O(n) | pior caso: O(n^2)");
                    writeFile(" ");

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
                    writeFile("Tempo de execução: " + executionTime3);
                    writeFile("Complexidade: melhor caso: O(n^2) | pior caso: O(n^2)");
                    writeFile(" ");

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
                    writeFile("Inserction Sort considerando: artista");
                    writeFile("Comparações: " + InsertionSort.getComp());
                    writeFile("Trocas: " + InsertionSort.getSwap());
                    writeFile("Tempo de execução: " + executionTime4);
                    writeFile("Complexidade: melhor caso: O(n) | pior caso: O(n^2)");
                    writeFile(" ");

//                     for (MusicInfo musicInfo : insertionArtist) {
//                          System.out.println("Ordenação por Inserção Artista: " + musicInfo);
//                     }
                    break;

                case "5":
                    List<MusicInfo> list5 = new ArrayList<MusicInfo>(musicInfoList);
                    long startTime5 = System.currentTimeMillis();
                    List<MusicInfo> bubbleArtist = bubbleSort(list5, "artista");
                    long endTime5 = System.currentTimeMillis();
                    long executionTime5 = endTime5 - startTime5;
                    System.out.println("Tempo de execução: " + executionTime5);
                    writeFile("Tempo de execução: " + executionTime5);
                    writeFile("Complexidade: melhor caso: O(n) | pior caso: O(n^2)");
                    writeFile(" ");

//                        for (MusicInfo musicInfo : bubbleArtist) {
//                              System.out.println("Ordenação por bubble Artista: " + musicInfo);
//                        }

                    break;

                case "6":
                    List<MusicInfo> list6 = new ArrayList<MusicInfo>(musicInfoList);
                    long startTime6 = System.currentTimeMillis();
                    List<MusicInfo> bubbleName = bubbleSort(list6, "nome");
                    long endTime6 = System.currentTimeMillis();
                    long executionTime6 = endTime6 - startTime6;
                    System.out.println("Tempo de execução: " + executionTime6);
                    writeFile("Tempo de execução: " + executionTime6);
                    writeFile("Complexidade: melhor caso: O(n) | pior caso: O(n^2)");
                    writeFile(" ");

//                    for (MusicInfo musicInfo : bubbleName) {
//                        System.out.println("Ordenação por bubble Nome: " + musicInfo);
//                    }

                    break;

                case "7":
                    ShellSort sh = new ShellSort();
                    List<MusicInfo> list7 = new ArrayList<MusicInfo>(musicInfoList);
                    long startTime7 = System.currentTimeMillis();
                    List<MusicInfo> shellName = sh.shellSort(list7, "nome");
                    long endTime7 = System.currentTimeMillis();
                    long executionTime7 = endTime7 - startTime7;
                    writeFile("Shell Sort considerando: nome");
                    writeFile("Comparações: " + sh.getComp());
                    writeFile("Trocas: " + sh.getSwap());
                    writeFile("Tempo de execução: " + executionTime7);
                    writeFile("Complexidade: melhor caso: O(n log² n) | pior caso: O(n^2)");
                    writeFile(" ");

//                    for (MusicInfo musicInfo : shellSort) {
//                        System.out.println("Ordenação por shellSort Nome: " + musicInfo);
//                    }

                    break;

                case "8":
                    ShellSort sh1 = new ShellSort();
                    List<MusicInfo> list8 = new ArrayList<MusicInfo>(musicInfoList);
                    long startTime8 = System.currentTimeMillis();
                    List<MusicInfo> shellArtist = sh1.shellSort(list8, "artista");
                    long endTime8 = System.currentTimeMillis();
                    long executionTime8 = endTime8 - startTime8;
                    writeFile("Shell Sort considerando: artista");
                    writeFile("Comparações: " + sh1.getComp());
                    writeFile("Trocas: " + sh1.getSwap());
                    writeFile("Tempo de execução: " + executionTime8);
                    writeFile("Complexidade: melhor caso: O(n log² n) | pior caso: O(n^2)");
                    writeFile(" ");

//                    for (MusicInfo musicInfo : shellArtist) {
//                        System.out.println("Ordenação por shellSort Artista: " + musicInfo);
//                    }

                    break;

                case "9":
                    List<MusicInfo> list9 = new ArrayList<MusicInfo>(musicInfoList);
                    long startTime9 = System.currentTimeMillis();
                    List<MusicInfo> quickName = quickSort(list9, "nome", 0, list9.size() - 1);
                    long endTime9 = System.currentTimeMillis();
                    long executionTime9 = endTime9 - startTime9;
                    writeFile("Quick Sort considerando: nome");
                    writeFile("Comparações: " + QuickSort.getComp());
                    writeFile("Trocas: " + QuickSort.getSwap());
                    writeFile("Tempo de execução: " + executionTime9);
                    writeFile("Complexidade: melhor caso: O(n log n) | pior caso: O(n^2)");
                    writeFile(" ");


//                    for (MusicInfo musicInfo : quickName) {
//                        System.out.println("Ordenação por quickSort Nome: " + musicInfo);
//                    }

                    break;

                case "10":
                    List<MusicInfo> list10 = new ArrayList<MusicInfo>(musicInfoList);
                    long startTime10 = System.currentTimeMillis();
                    List<MusicInfo> quickArtist = quickSort(list10, "artista", 0, list10.size() - 1);
                    long endTime10 = System.currentTimeMillis();
                    long executionTime10 = endTime10 - startTime10;
                    writeFile("Quick Sort considerando: artista");
                    writeFile("Comparações: " + QuickSort.getComp());
                    writeFile("Trocas: " + QuickSort.getSwap());
                    writeFile("Tempo de execução: " + executionTime10);
                    writeFile("Complexidade: melhor caso: O(n log n) | pior caso: O(n^2)");
                    writeFile(" ");

//                    for (MusicInfo musicInfo : quickArtist) {
//                        System.out.println("Ordenação por quickSort Artista: " + musicInfo);
//                    }

                    break;

                case "11":
                    HeapSort hp = new HeapSort();
                    List<MusicInfo> list11 = new ArrayList<MusicInfo>(musicInfoList);
                    long startTime11 = System.currentTimeMillis();
                    List<MusicInfo> heapNome = hp.heapSort(list11, "nome");
                    long endTime11 = System.currentTimeMillis();
                    long executionTime11 = endTime11 - startTime11;
                    writeFile("Heap Sort considerando: nome");
                    writeFile("Comparações: " + hp.getComp());
                    writeFile("Trocas: " + hp.getSwap());
                    writeFile("Tempo de execução: " + executionTime11);
                    writeFile("Complexidade: melhor caso: O(n log n) | pior caso: O(n log n)");
                    writeFile(" ");

//                    for (MusicInfo musicInfo : heapNome) {
//                        System.out.println("Ordenação por heapSort nome: " + musicInfo);
//                    }

                    break;

                case "12":
                    HeapSort hp1 = new HeapSort();
                    List<MusicInfo> list12 = new ArrayList<MusicInfo>(musicInfoList);
                    long startTime12 = System.currentTimeMillis();
                    List<MusicInfo> heapArtista = hp1.heapSort(list12, "artista");
                    long endTime12 = System.currentTimeMillis();
                    long executionTime12 = endTime12 - startTime12;
                    writeFile("Heap Sort considerando: artista");
                    writeFile("Comparações: " + hp1.getComp());
                    writeFile("Trocas: " + hp1.getSwap());
                    writeFile("Tempo de execução: " + executionTime12);
                    writeFile("Complexidade: melhor caso: O(n log n) | pior caso: O(n log n)");
                    writeFile(" ");

//                    for (MusicInfo musicInfo : heapArtista) {
//                        System.out.println("Ordenação por heapSort Artista: " + musicInfo);
//                    }

                    break;

                case "13":
                    MergeSort ms = new MergeSort();
                    List<MusicInfo> list13 = new ArrayList<MusicInfo>(musicInfoList);
                    long startTime13 = System.currentTimeMillis();
                    List<MusicInfo> mergeNome = ms.mergeSort(list13, "nome");
                    long endTime13 = System.currentTimeMillis();
                    long executionTime13 = endTime13 - startTime13;
                    writeFile("Merge Sort considerando: nome");
                    writeFile("Comparações: " + ms.getComp());
                    writeFile("Trocas: " + ms.getSwap());
                    writeFile("Tempo de execução: " + executionTime13);
                    writeFile("Complexidade: melhor caso: O(n log n) | pior caso: O(n log n)");
                    writeFile(" ");

//                    for (MusicInfo musicInfo : mergeNome) {
//                        System.out.println("Ordenação por merge Sort Nome: " + musicInfo);
//                    }

                    break;

                case "14":
                    MergeSort ms1 = new MergeSort();
                    List<MusicInfo> list14 = new ArrayList<MusicInfo>(musicInfoList);
                    long startTime14 = System.currentTimeMillis();
                    List<MusicInfo> mergeArtista = ms1.mergeSort(list14, "artista");
                    long endTime14 = System.currentTimeMillis();
                    long executionTime14 = endTime14 - startTime14;
                    writeFile("Merge Sort considerando: nome");
                    writeFile("Comparações: " + ms1.getComp());
                    writeFile("Trocas: " + ms1.getSwap());
                    writeFile("Tempo de execução: " + executionTime14);
                    writeFile("Complexidade: melhor caso: O(n log n) | pior caso: O(n log n)");
                    writeFile(" ");

//                    for (MusicInfo musicInfo : mergeArtista) {
//                        System.out.println("Ordenação por merge Sort Artista: " + musicInfo);
//                    }

                    break;

                case "99":
                    sair = false;

                default:
                    break;
            }
        }
        System.out.println("Fim!");

    }
}