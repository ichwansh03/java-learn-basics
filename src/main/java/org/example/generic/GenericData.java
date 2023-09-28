package org.example.generic;

public class GenericData<T, R> {

    private T data;
    private R message;

    public void setData(T data) {
        this.data = data;
    }

    public void setMessage(R message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void response(T data, R message){
        System.out.println("this data "+this.data+" from data " +data+
                ", and message "+this.message+" from message "+message);
    }

}
