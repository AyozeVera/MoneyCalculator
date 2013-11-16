package Model;

import java.util.Date;

public class ExchangeRate {
    Date date;
    Currency from;
    Currency to;
    Number rate;

    public ExchangeRate(Currency from, Currency to, Number rate) {
        this.from = from;
        this.to = to;
        this.rate = rate;
    }

    public ExchangeRate(Date date, Currency from, Currency to, Number rate) {
        this.date = date;
        this.from = from;
        this.to = to;
        this.rate = rate;
    }
    
}
