package org.example.basic;

public class Constructors {

    String messageClass;
    String type;

    Constructors(String message, String type){
        messageClass = message;
        this.type = type;
    }

    //memanggil constructor atasnya
    Constructors(String message){
        this(message, null);
    }

    public static void main(String[] args) {

        Constructors as = new Constructors("this is message");
        System.out.println(as.messageClass);
    }
}
