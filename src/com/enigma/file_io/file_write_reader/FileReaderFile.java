package com.enigma.file_io.file_write_reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderFile {
    public static void main(String[] args) {
        int character;
        StringBuilder result = new StringBuilder();
        try (FileReader fileReader = new FileReader("iniOutput.txt")) {
            do {
                character=fileReader.read();
                result.append((char) character);
            } while ((character) != -1);
            System.out.println("result: \n" + result);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
