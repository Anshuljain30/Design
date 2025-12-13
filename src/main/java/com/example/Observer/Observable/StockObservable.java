package com.example.Observer.Observable;

import Observer.NotificationObserver;

public interface StockObservable {
    void add(NotificationObserver observer);
    void remove(NotificationObserver observer);
    void notifys();
    void setStock(int stockCount);
    int getStock();


}
