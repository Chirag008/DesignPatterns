package com.cb.observerpattern;

public interface Subject {
    
    public void notifyAllObservers();
    public void registerObserver(Observer observer);
    public void unregisterObserver(Observer observer);

}
