package br.com.escuderodev.singleton;

public class AppSingletonPropertyThread {
    public static void main(String[] args) {
        Thread t1 = new Thread(new ThreadFoo());
        Thread t2 = new Thread(new ThreadBar());
        t1.start();
        t2.start();
    }

    static class ThreadFoo implements Runnable {
        @Override
        public void run() {
            SingletonProperty singletonProperty = SingletonProperty.getInstance("Palmeiras não tem mundial!");
            System.out.println(singletonProperty.getValue());
        }
    }

    static class ThreadBar implements Runnable {
        @Override
        public void run() {
            SingletonProperty singletonProperty1 = SingletonProperty.getInstance("Corinthians");
            System.out.println(singletonProperty1.getValue());
        }
    }
}
