package org.example.standard_classes;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesApp {
    public static void main(String[] args) {
        Properties properties = new Properties();

        //load data ke properties
        try {
            properties.load(new FileInputStream("application.properties"));
        } catch (FileNotFoundException e) {
            System.out.println("File not found");;
        } catch (IOException e){
            System.out.println("File not valid");
        }

        System.out.println(properties.getProperty("database.host"));

        properties.put("name.first","Ichwan");
        try {
            properties.store(new FileOutputStream("test.properties"), "File added");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
