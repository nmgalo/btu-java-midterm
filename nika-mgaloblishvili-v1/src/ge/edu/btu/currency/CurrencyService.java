package ge.edu.btu.currency;

public interface CurrencyService {

    void setExchangeRate(float value);

    double convert(double amount);

}
