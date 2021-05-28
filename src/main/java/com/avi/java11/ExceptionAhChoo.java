package com.avi.java11;

public class ExceptionAhChoo {
    static class SneezeException extends Exception {}
    static class SniffleException extends SneezeException implements com.avi.java11.SniffleException {}
    public static void main(String[] args) {
        try {
            //throw new SneezeException();

            throw new SniffleException();
        //} catch ( SniffleException   e) {
        } catch ( SneezeException  e) {

        } finally {}
    } }
