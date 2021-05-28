package com.avi.java11;

class Penguin {
    public int age = 30;
    public int getHeight() { return 3; }


    public static int getHeightStatic() { return 4; }

    // Here this has EmperorPenguin identity
    // and hence will print 8 from EmperorPenguin class
    public void printInfo() {
        System.out.println("Parent : " + getHeight());
    }

    // Method hiding doesn't come under polymorphic behaviour
    // Here this maintains own identity
    public void printInfoStatic() {
        System.out.println(this.getHeightStatic());
    }
}

public class EmperorPenguin extends Penguin {
    public int age = 10;
    //public static final int staticAge;
    public  EmperorPenguin(){
        //staticAge = 12;
    }

    public int getHeight() { return 8; }
    public static int getHeightStatic() { return 10; }
    public static void main(String []fish) {

        EmperorPenguin em = new EmperorPenguin();
        EmperorPenguin em1 = new EmperorPenguin();

        System.out.println("================== Child object ==================");
        EmperorPenguin ep = new EmperorPenguin();
        System.out.println("");

        ep.printInfo();
        ep.printInfoStatic();
        String someJson = "{\"some\" :  \"some\"}";
        //language=JSON
        String  s1 = "{\"somekey\": \"somevalue\", \n" +
                "\"anotherkey\" :  \"anothervalue\",\n" +
                "\"somemoewKey\": \"somemorevalues\",\n" +
                "\"addsomemre\": \"more added\"}";
        //language=HTML
        String html = "<html>\n" +
                "<title>\n" +
                "    some title\n" +
                "</title>\n" +
                "<body>some bosy</body>\n" +
                "</html>";
        System.out.println("Child : " + ep.getHeight());

        System.out.println("Child : " + ep.age);

        System.out.println("================== Parent reference ==================");
        Penguin p = ep;
        p.printInfo();
        p.printInfoStatic();
        System.out.println("Parent : " + p.getHeight());
        System.out.println("Parent : " + p.age);
    }
}
