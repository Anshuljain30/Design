package Observer;

import com.example.Observer.Observable.StockObservable;
import org.springframework.beans.factory.annotation.Autowired;

public class EmailObserver implements NotificationObserver{

    @Autowired
    StockObservable stockObservable;
    String emailID;
    public EmailObserver(String emailID,StockObservable stockObservable)
    {
        this.emailID=emailID;
        this.stockObservable=stockObservable;
    }

    @Override
    public void Update() {
        System.out.println(emailID+" " +"Item in Stock");

    }
}
