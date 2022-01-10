package day01;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Running {

    List<String> text = new ArrayList<>();

    public double telj(int year, int month) throws IOException {
        double sum = 0;
        double km;
        String searchedDate = year + "-" + ((month < 10) ? "0" : "") + month;
        text = readFile("src/main/resources/running.csv");

        for (int i = 1; i < text.size(); i++) {
            String row = text.get(i);
            Scanner scanner = new Scanner(row);
            scanner.useDelimiter(";");
            String run = scanner.next();
            km = Double.parseDouble(run.substring(0, run.length() - 3));
            String date = scanner.next();
            date = date.substring(0,7);
            if (searchedDate.equals(date)) {
                sum += km;
            }
        }
            return Math.round(sum * 10.0) / 10.0;
    }

    private List<String> readFile(String filename) throws IOException {
        try {
            return Files.readAllLines(Paths.get(filename));
        } catch (IOException ioe) {
            throw new IOException("File read error",ioe);
        }
    }

}
