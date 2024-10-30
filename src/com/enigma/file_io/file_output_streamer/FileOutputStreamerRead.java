package com.enigma.file_io.file_output_streamer;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileOutputStreamerRead {
    private final static File fileStream = new File("iniOutput.txt");
    public static void main(String[] args) {
        System.out.println("FileIO.readFileInputStream: start");

        try (FileInputStream fileInputStream = new FileInputStream(fileStream)) {
//            System.out.println("fileInputStream.read()" + fileInputStream.read());
//            System.out.println("fileInputStream.readAllBytes()" + Arrays.toString(fileInputStream.readAllBytes()));

            StringBuilder result = new StringBuilder();
            for (int i = 0; i < fileStream.length(); i++) {
                System.out.println("fileInputStream.available()" + fileInputStream.available());
                result.append((char) fileInputStream.read());
            }
            System.out.println("result: \n" + result);

            System.out.println("fileInputStream.available()" + fileInputStream.available());

            String result2 = new String(fileInputStream.readAllBytes());

            System.out.println("result2: \n" + result2);

            System.out.println(result.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
