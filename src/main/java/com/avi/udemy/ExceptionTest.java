package com.avi.udemy;


public class ExceptionTest {
    private static void div(int i, int j) throws Exception {
        try {
            System.out.println(i / j);
        } catch(ArithmeticException e) {
            Exception ex = new Exception(e);
            throw ex;
        }catch (Exception e){
            System.out.println("Exception");
        }
    }
    public static void main(String[] args) {
        try {
            div(5, 0);
        } catch(Exception e) {
            System.out.println("END");
        }
    }
}
