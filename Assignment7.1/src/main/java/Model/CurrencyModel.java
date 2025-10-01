package Model;

import java.util.ArrayList;
import java.util.List;

public class CurrencyModel {
    private final List<Currency> currencies;

    public CurrencyModel() {
        currencies = new ArrayList<>();
        currencies.add(new Currency("USD", "US Dollar", 1.0));
        currencies.add(new Currency("EUR", "Euro", 1.07));
        currencies.add(new Currency("GBP", "British Pound", 1.22));
        currencies.add(new Currency("JPY", "Japanese Yen", 0.0067));
        currencies.add(new Currency("INR", "Indian Rupee", 0.012));
    }

    public List<Currency> getCurrencies() {
        return currencies;
    }

    public double convert(double amount, Currency from, Currency to) {
        double inUSD = amount * from.getRateToUSD();
        return inUSD / to.getRateToUSD();
    }
}
