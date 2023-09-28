package org.example.generic;

public class SingleGeneric<T> {

    private T data;

    public SingleGeneric(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
