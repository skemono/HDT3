package com.nashe;

import java.io.*;
import java.util.Arrays;

public class ArrayFile {

    public static void saveArrayToFile(int[] array, String filename) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(filename))) {
            for (int element : array) {
                writer.println(element);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static int[] readArrayFromFile(String filename) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            return reader.lines()
                    .mapToInt(Integer::parseInt)
                    .toArray();
        } catch (IOException e) {
            e.printStackTrace();
            return new int[0];
        }
    }
}
