package br.com.escuderodev.generics;

public class GenericEntry<T> {
        private T data;

    public GenericEntry(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
