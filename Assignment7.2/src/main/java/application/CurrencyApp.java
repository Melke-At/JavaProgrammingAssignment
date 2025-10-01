package application;

import entity.*;
import dao.*;
import java.util.*;

public class CurrencyApp {

    public static void main(String[] args) {

        Currency_ConverterDao currdao = new Currency_ConverterDao();

        List <Currency_Converter> currencies = currdao.getAllCurrency_Converter();
        for (Currency_Converter curr : currencies) {
            System.out.println(curr.getCode() + " " + curr.getName());
        }

        Currency_Converter curr = (Currency_Converter) currdao.getAllCurrency_Converter();
        System.out.println(curr.getCode() + " " + curr.getName());

        currdao.persist(new Currency_Converter('4', "K", "Kroner", 11.0));

        datasource.MariaDbConnection.terminate();
    }
}
