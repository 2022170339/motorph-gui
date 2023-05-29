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
import java.util.List;

/**
 *
 * @author redenval
 */
public class Helper {
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
}
