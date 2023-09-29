package org.example.generic;

public class GenericApp {

    public static void main(String[] args) {
        GenericData<Integer, String> data = new GenericData<>();
        data.setData(201);
        data.setMessage("Created");
        data.response(data.getData(), "OK");

        validation(data);

        //covariant
        SingleGeneric<Double> single = new SingleGeneric<>(12.3100001);
        generate(single);

        //contravariant
        SingleGeneric<Object> gen = new SingleGeneric<>("Set data dari class SingleGeneric");
        //RUNTIME-ERROR
        //gen.setData(10);
        process(gen);
        System.out.println(gen.getData());
    }

    //covariant
    public static void generate(SingleGeneric<? extends Number> data){
        System.out.println(data.getData());

        //READ-ONLY
        //data.setData(1);
    }

    //contravariant
    public static void process(SingleGeneric<? super String> data){
        String value = (String) data.getData();
        System.out.println(value);
        data.setData("Set Data dari method process()");
    }

    //parent class Integer adalah Object
    //? = wildcard
    public static void validation(GenericData<Integer,?> data){
        System.out.println("Response from validation = "+data.getData()+ " and "+data.getMessage());
    }
}
