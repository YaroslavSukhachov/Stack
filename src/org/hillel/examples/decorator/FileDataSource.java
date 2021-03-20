package org.hillel.examples.decorator;

import java.io.*;

public class FileDataSource implements DataSource {
    private String name;

    public FileDataSource(String name) {
        this.name = name;
    }

    @Override
    public String readData() {
        File file = new File(name);

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            StringBuilder result = new StringBuilder();
            while ((line = reader.readLine()) != null) {
                result.append(line);
            }
            return result.toString();
        } catch (IOException e) {
            System.out.println("Ошибка чтения файла");
            return "";
        }
    }

    @Override
    public void writeData(String data) {
        File file = new File(name);

        try (FileWriter fileWriter = new FileWriter(file)) {
            fileWriter.write(data);
        } catch (IOException e) {
            System.out.println("Ошибка записи файла");
        }
    }
}
