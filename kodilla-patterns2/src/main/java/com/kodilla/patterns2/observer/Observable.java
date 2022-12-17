package com.kodilla.patterns2.observer;

public interface Observable {
    void registerObserver(Observer observer);
    void notifyObserver();
    void removeObserver(Observer observer);

}