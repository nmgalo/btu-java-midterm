package ge.edu.btu;

import ge.edu.btu.currency.CurrencyService;
import ge.edu.btu.currency.impl.CurrencyServiceImpl;
import org.apache.log4j.Logger;

public class Main {

    final static Logger logger = Logger.getLogger(Main.class);

    public static void main(String[] args) {

        CurrencyService currencyService = new CurrencyServiceImpl();

        currencyService.setExchangeRate(0);

        double result = currencyService.convert(122.2);

        logger.info(result);

    }

}
