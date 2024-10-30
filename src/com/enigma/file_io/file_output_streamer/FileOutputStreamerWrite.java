package com.enigma.file_io.file_output_streamer;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamerWrite {
    private final static File fileStream = new File("iniOutput.txt");
    public static void main(String[] args) {
        System.out.println("FileIO.writeFileOutputStream: start");
        // try resource daripada try catch finally untuk memastikan close
        // tidak perlu lagi fileOutputStream.close
        try (FileOutputStream fileOutputStream = new FileOutputStream(fileStream)) {
            System.out.println("fileStream.exists()" + fileStream.exists());
            fileOutputStream.write('G');
            fileOutputStream.write('o');
            fileOutputStream.write(115); // s
            fileOutputStream.write("ling".getBytes());
            fileOutputStream.write('\n');
            fileOutputStream.write("batch 5".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
