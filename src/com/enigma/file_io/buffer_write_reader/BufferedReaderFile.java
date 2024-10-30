package com.enigma.file_io.buffer_write_reader;

import java.io.*;

public class BufferedReaderFile {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("iniOutput.txt"));
            while ((reader.readLine()) != null) {
                System.out.println(reader.readLine());
            }
            reader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
