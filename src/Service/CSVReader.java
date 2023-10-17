package Service;

import model.MusicInfo;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CSVReader {
    private List<MusicInfo> musicInfoList;

    public CSVReader() {
        this.musicInfoList = new ArrayList<>();
    }

    public List<MusicInfo> getMusicInfoList() {
        return musicInfoList;
    }

    public void ReadCSV(String path) throws FileNotFoundException {

        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String line = reader.readLine();

            while((line = reader.readLine()) != null){

                String[] arrayLine = line.split(",(?=(?:(?:[^\"]*\"){2})*[^\"]*$)");

                MusicInfo musicInfo = new MusicInfo(arrayLine[0],arrayLine[1],arrayLine[2],arrayLine[3],arrayLine[4],arrayLine[5],arrayLine[6],arrayLine[7],arrayLine[8],arrayLine[9],arrayLine[10],arrayLine[11],arrayLine[12],arrayLine[13],arrayLine[14],arrayLine[15],arrayLine[16],arrayLine[17],arrayLine[18],arrayLine[19],arrayLine[20],arrayLine[21],arrayLine[22],arrayLine[23]);
                musicInfoList.add(musicInfo);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
