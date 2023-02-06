package br.com.escuderodev.singleton;

public class AppSingletonPropertyThreadSyncronized {
    public static void main(String[] args) {
        Thread t1 = new Thread(new ThreadFoo());
        Thread t2 = new Thread(new ThreadBar());
        t1.start();
        t2.start();
    }

    static class ThreadFoo implements Runnable {
        @Override
        public void run() {
            SingletonPropertySyncronized singletonPropertySyncronized = SingletonPropertySyncronized.getInstance("Palmeiras não tem mundial!");
            System.out.println(singletonPropertySyncronized.getValue());
        }
    }

    static class ThreadBar implements Runnable {
        @Override
        public void run() {
            SingletonPropertySyncronized singletonPropertySyncronized = SingletonPropertySyncronized.getInstance("Corinthians");
            System.out.println(singletonPropertySyncronized.getValue());
        }
    }
}

