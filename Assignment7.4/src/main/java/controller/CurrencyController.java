package controller;

import dao.Currency_ConverterDao;

public class CurrencyController {
    private final Currency_ConverterDao currencyDao;

    public CurrencyController() {
        this.currencyDao = new Currency_ConverterDao();
    }

    public double convert(double amount, String fromCode, String toCode) {
        double fromRate = currencyDao.getExchangeRate(fromCode);
        double toRate = currencyDao.getExchangeRate(toCode);

        if (fromRate <= 0 || toRate <= 0) {
            throw new RuntimeException("Invalid currency rates. Check database.");
        }

        double inUSD = amount * fromRate;
        return inUSD / toRate;
    }
}
