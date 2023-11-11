package task_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PhoneNumbersFileReader {
    public List<String> readFromFile(String fileName) {
        List<String> lines = new ArrayList<>();

        try (Scanner scanner = new Scanner(new File(fileName))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                lines.add(line);
            }
        } catch (FileNotFoundException e) {
            System.err.println("no such file");
            e.printStackTrace();
        }
        return lines;
    }
}
