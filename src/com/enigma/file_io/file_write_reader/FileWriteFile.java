package com.enigma.file_io.file_write_reader;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriteFile {
    public static void main(String[] args) {

        //ada dua parameter untuk filewriter yang bisa digunakan
        //pertama untuk pathnya, kedua untuk menggunakan append
        try(FileWriter fileWriteFile = new FileWriter("iniOutput.txt", true)) {
            fileWriteFile.write("Hello World");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
