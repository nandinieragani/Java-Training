package com.hcltech.Excer8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DisplayFileContents {
    public static void main(String[] args) {
        // Check if the filename is provided as a command-line argument
        if (args.length != 1) {
            System.out.println("Usage: java DisplayFileContents <file-path>");
            return;
        }

        String filePath = args[0];

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
    }
}

