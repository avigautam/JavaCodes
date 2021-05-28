package com.avi.udemy;

interface Document {
    default String getType() {
        return "TEXT";
    }
}

interface WordDocument extends Document {
    String getType();
}

class Word implements WordDocument {
    @Override
    public String getType() {
        return null;
    }
}

public class Test1 {
    public static void main(String[] args) {
        Document doc = new Word(); //Line n1
        System.out.println(doc.getType()); //Line n2
    }
}
