package controller;

import dao.CurrencyDao;
import entity.Currency_Converter;

import java.util.List;

public class CurrencyController {
    private final CurrencyDao dao;

    public CurrencyController() {
        this.dao = new CurrencyDao();
    }

    public List<Currency_Converter> getAllCurrencies() {
        return dao.getAllCurrencies();
    }

    public double convert(double amount, String from, String to) {
        double fromRate = dao.getExchangeRate(from);
        double toRate = dao.getExchangeRate(to);

        if (fromRate <= 0 || toRate <= 0) {
            throw new RuntimeException("Invalid currency rate.");
        }

        double inUSD = amount * fromRate;
        return inUSD / toRate;
    }

    public void addCurrency(String code, String name, double rateToUSD) {
        Currency_Converter c = new Currency_Converter(code, name, rateToUSD);
        dao.insertCurrency(c);
    }
}
