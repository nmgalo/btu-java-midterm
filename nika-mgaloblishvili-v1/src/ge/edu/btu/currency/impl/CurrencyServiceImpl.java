package ge.edu.btu.currency.impl;

import ge.edu.btu.Main;
import ge.edu.btu.currency.CurrencyService;
import org.apache.log4j.Logger;

public class CurrencyServiceImpl implements CurrencyService {

    final static Logger logger = Logger.getLogger(Main.class);
    float exchangeRate;

    @Override
    public void setExchangeRate(float value) {
        if (value == 0) {
            logger.error("0 value encountered");
            throw new ArithmeticException();
        }
        this.exchangeRate = value;
    }

    @Override
    public double convert(double amount) {
        return amount / this.exchangeRate;
    }


}
