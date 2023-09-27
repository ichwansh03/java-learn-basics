package org.example.basic.records;

public record StudentRecords(String name, String npm) {

    //compact constructor
    public StudentRecords(String name) {
        this(name, null);
    }

    void sayStudent(){
        System.out.println("Halo "+this.name+" npm: "+this.npm);
    }

    //ERROR, karena field pada constructor bersifat final
//    public void setName(String name){
//        this.name = name;
//    }
}
