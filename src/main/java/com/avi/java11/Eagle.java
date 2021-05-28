package com.avi.java11;

import java.io.*;

abstract class  Bird {
    public static transient String name;
    public void setName(String name) { this.name = name; }
    public String getName() { return name; }
    public Bird() {
        this.name = "Matt";
    }
    abstract void p();
}
public class Eagle extends Bird implements Serializable {
    String name;
    { this.name = "Olivia"; }
    public Eagle() {
        this.name = "Bridget";
    }
    public static void main(String[] args) throws IOException {

        var e = new Eagle();
        Bird e1 = new Eagle();
        //e.name = "Adeline";
        System.out.println(e.name);
        System.out.println(e1.name);
        e1.p();
        pullBytes(new FileInputStream("XYZABC"), 3);
    }

    public static String pullBytes(InputStream in, int count)
            throws IOException {
        in.mark(count);
        var sb = new StringBuilder();
        for(int i=0; i<count; i++)
            sb.append((char)in.read());
        in.reset();
        in.skip(1);
        sb.append((char)in.read());
        return sb.toString();
    }

    void p(){
        System.out.println("have definition");
    };

    public static void deleteTree(File file) {
        if(!file.isFile())                    // f1
            for(File entry: file.listFiles())  // f2
                deleteTree(entry);
        else file.delete();
    }

    public static void main1(String[] args) throws IOException {
        String line;
        var c = System.console();
        Writer w = c.writer();
        try (w) {
            if ((line = c.readLine("Enter your name: ")) != null)
                w.append(line);
            w.flush();
        }
    }
}