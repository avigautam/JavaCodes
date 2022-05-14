package com.avi.effective.java.chapter1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithFinally {
    public static void main(String[] args) throws IOException {

        firstLineOfFile("");

    }

    // try-finally - No longer the best way to close resources!

    static String firstLineOfFile(String path) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader(""));
        try {
            return br.readLine();

        } finally {
            System.out.println("in finally 1");
            br.close();
            System.out.println("in finally 2");

        }

    }

    static void throwEx() throws IOException {
        throw new IOException();
    }
}
