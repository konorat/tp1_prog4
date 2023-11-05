package Service;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    public static void writeFile(String data) throws IOException {
        String currentDirectory = System.getProperty("user.dir");
        String filePath = currentDirectory + "/logs.txt";

        FileWriter fileWriter = new FileWriter(filePath, true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        bufferedWriter.write(data);
        bufferedWriter.newLine();

        bufferedWriter.close();
        fileWriter.close();
    }
}
