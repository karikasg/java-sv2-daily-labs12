package day04;

import day01.Teacher;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Beosztas {
    private List<Teacher> l = new ArrayList<>();

    public void reader() {

        try (BufferedReader br = Files.newBufferedReader(Path.of("src/main/resources/tanar.txt"))) {
            String name;

            while ((name = br.readLine()) != null) {

                l.add(new Teacher(name, br.readLine(), br.readLine(), Integer.parseInt(br.readLine())));
            }
        }
        catch (IOException ioe) {
            throw new IllegalStateException("File beolvasási hiba", ioe);
        }
    }

    public int ora(String name) {
        int sum = 0;
        for (Teacher t : l) {
            if (name.equals(t.getName())) {
                sum += t.getOraszam();
            }
        }
        return sum;
    }
}
