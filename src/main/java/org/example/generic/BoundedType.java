package org.example.generic;

public class BoundedType {

    public static void main(String[] args) {
        StringData<String> data = new StringData<>("Ali");
        System.out.println(data.getData());
    }

    public static class StringData<T extends String>{

        private T data;

        public StringData(T data) {
            this.data = data;
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }
    }
}
