package Observer;

import com.example.Observer.Observable.StockObservable;
import org.springframework.beans.factory.annotation.Autowired;

public class MessageObserver implements NotificationObserver {
    int phoneNumber;

    @Autowired
    StockObservable stockObservable;
    public MessageObserver(int phoneNumber, StockObservable stockObservable)
    {
        this.phoneNumber= phoneNumber;
        this.stockObservable= stockObservable;
    }


    @Override
    public void Update() {
        System.out.println(phoneNumber+ ""+ "Item in stock");
    }
}
