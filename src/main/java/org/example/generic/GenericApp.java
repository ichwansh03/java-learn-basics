package org.example.generic;

public class GenericApp {

    public static void main(String[] args) {
        GenericData<Integer, String> data = new GenericData<>();
        data.setData(201);
        data.setMessage("Created");
        System.out.println(data.getData());
        data.response(200, "OK");

        validation(data);

        //covariant
        SingleGeneric<String> single = new SingleGeneric<>("Ichwan");
        generate(single);

        //contravariant
        SingleGeneric<Object> gen = new SingleGeneric<>("Data");
        //RUNTIME-ERROR
        //gen.setData(10);
        process(gen);
        System.out.println(gen.getData());
    }

    //covariant
    public static void generate(SingleGeneric<? extends Object> data){
        System.out.println(data.getData());

        //READ-ONLY
        //data.setData(1);
    }

    //contravariant
    public static void process(SingleGeneric<? super String> data){
        String value = (String) data.getData();
        System.out.println(value);
        data.setData("Sholihin");
    }

    //parent class Integer adalah Object
    //? = wildcard
    public static void validation(GenericData<?,String> data){
        System.out.println("Response from validation = "+data.getData());
    }
}
