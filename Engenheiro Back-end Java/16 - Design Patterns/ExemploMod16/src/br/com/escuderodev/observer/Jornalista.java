package br.com.escuderodev.observer;

import java.util.ArrayList;
import java.util.List;

public class Jornalista implements Subject {

    private String title;
    private String notice;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getNotice() {
        return notice;
    }

    public void setNotice(String notice) {
        this.notice = notice;
    }

    public List<Observer> observers = new ArrayList<>();
    @Override
    public void add(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyAll(String title, String notice) {
        this.title = title;
        this.notice = notice;

        for (Observer ob : this.observers) {
            ob.update(this);
        }
    }

    @Override
    public String toString() {
        return "Jornalista{" +
                "title='" + title + '\'' +
                ", notice='" + notice + '\'' +
                '}';
    }
}
