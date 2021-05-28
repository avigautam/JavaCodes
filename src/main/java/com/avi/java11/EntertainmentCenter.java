package com.avi.java11;

import java.io.*;
public class EntertainmentCenter {
    static class TV implements AutoCloseable {
        public void close() {
            System.out.print("D");
        } }
    static class MediaStreamer implements Closeable {
        public void close() {
            System.out.print("W");
        } }
    public static void main(String[] args) {
        var w = new MediaStreamer();
        try (TV d = new TV(); w;){
            //TV d = new TV();
            System.out.print("T");
            throw new RuntimeException();
        } catch (RuntimeException e) {
            System.out.print("R");
        }catch (Exception e) {
            System.out.print("E");
        } finally {
            System.out.print("F");
        }
    }
}
