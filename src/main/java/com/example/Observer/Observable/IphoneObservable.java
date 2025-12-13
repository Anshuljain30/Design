package com.example.Observer.Observable;

import Observer.NotificationObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservable implements StockObservable{




List<NotificationObserver> observerList= new ArrayList<>();
int stockSize=0;
        @Override
        public void add(NotificationObserver observer) {
                observerList.add(observer);
        }

        @Override
        public void remove(NotificationObserver observer) {
            observerList.remove(observer);
        }

        @Override
        public void notifys() {

            for(NotificationObserver obj:observerList)
            {
                obj.Update();

            }
            stockSize=0;
        }

        @Override
        public void setStock(int stockCount) {
            if(stockSize==0)
            {
               notifys();
                  stockSize= stockSize+stockCount;
        }}

        @Override
        public int getStock() {

    return stockSize;
        }

}
