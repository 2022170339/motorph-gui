/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mmdc.motorph;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.exceptions.CsvException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author redenval
 */
public class Helper {

    public static String currentLoggedIn = "";

    public static int findRowIndex(List<String[]> rows, String id) {
        for (int i = 0; i < rows.size(); i++) {
            String[] row = rows.get(i);
            if (row[0].equals(id)) {
                return i;
            }
        }
        return -1; // Row not found
    }

    public static List<String[]> readCSV(String filePath) throws IOException, CsvException {
        try (CSVReader reader = new CSVReader(new FileReader(filePath))) {
            return reader.readAll();
        }
    }

    public static void writeCSV(List<String[]> rows, String filePath) throws IOException {
        try (CSVWriter writer = new CSVWriter(new FileWriter(filePath))) {
            writer.writeAll(rows);
        }
    }

    public static boolean isPasswordCorrect(char[] input, char[] password) {
        if (input.length != password.length) {
            return false; // If the lengths are different, the passwords can't be equal
        }
        // Compare each character in the input and password arrays
        for (int i = 0; i < input.length; i++) {
            if (input[i] != password[i]) {
                return false; // If any characters are different, the passwords are not equal
            }
        }
        return true; // If all characters are the same, the passwords are equal
    }
}
