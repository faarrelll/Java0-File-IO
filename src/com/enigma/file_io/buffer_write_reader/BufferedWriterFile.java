package com.enigma.file_io.buffer_write_reader;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class BufferedWriterFile {
    public static void main(String[] args) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("iniOutput.txt",true));
            for (int i = 0; i < 50; i++) {
                writer.write("\nHello Enigmat");
            }
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
