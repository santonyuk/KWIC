package version1;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringJoiner;
import java.io.File;
import java.util.Scanner;

public class kwic1 {
    private static ArrayList<String> allLines;

    public static void main(String[] args) {
        readFilesLines();
        sortKwicAlphabetically();
        shiftKwic();
        writeKwic();
    }

    private static void readFilesLines() {
        allLines = new ArrayList<String>();
        Scanner scanner;

        try {
            scanner = new Scanner(new File("kwic.txt"));
            while (scanner.hasNextLine()) {
                allLines.add(scanner.nextLine());
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        }
    }

    private static void sortKwicAlphabetically() {
        Collections.sort(allLines);
    }

    private static void shiftKwic() {
        int count = 0;
        for (String line : allLines) {
            allLines.set(count, shiftKwicLine(line));
            count++;
        }
    }

    private static String shiftKwicLine(String shiftLine) {
        String[] wordsInLine = shiftLine.split(" ");
        String firstWord = wordsInLine[0];

        StringJoiner stringJoiner = new StringJoiner(" ");

        for (int i = 1; i < wordsInLine.length; i++) {
            stringJoiner.add(wordsInLine[i]);
        }

        stringJoiner.add(firstWord);

        return stringJoiner.toString();
    }

    private static void writeKwic() {
        FileWriter fileWriter;

        try {
            fileWriter = new FileWriter("ShiftedAndSortedFile.txt");

            for (String line : allLines) {
                fileWriter.write(line);
                System.out.println(line);
            }

            fileWriter.close();
        } catch (IOException e) {
            System.out.println("File not found!");
        }
    }
}
