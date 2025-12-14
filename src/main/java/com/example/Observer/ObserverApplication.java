package com.example.Observer;

import Observer.EmailObserver;
import Observer.NotificationObserver;
import com.example.Observer.Observable.IphoneObservable;
import com.example.Observer.Observable.StockObservable;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class ObserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(ObserverApplication.class, args);



		StockObservable observable= new IphoneObservable();

		NotificationObserver observer1= new EmailObserver("sonali@gmail.com", observable);
		observable.add(observer1);
		NotificationObserver observer2= new EmailObserver("anshul@gmail.com", observable);
		observable.add(observer2);
		NotificationObserver observer3= new EmailObserver("sapna@gmail.com", observable);
		observable.add(observer3);

		System.out.println("\n" + "Current Stock: " + observable.getStock());
		System.out.println("Setting New Stock to: " + 10 + "\n");
		observable.setStock(10);

		System.out.println("\n" + "Current Stock: " + observable.getStock());
		System.out.println("Setting New Stock to: " + 0 + "\n");
		observable.setStock(0);

		System.out.println("\n" + "Current Stock: " + observable.getStock());
		System.out.println("Setting New Stock to: " + 20 + "\n");
		observable.setStock(20);

	}

}
