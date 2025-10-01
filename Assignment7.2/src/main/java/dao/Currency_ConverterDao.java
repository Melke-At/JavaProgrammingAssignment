package dao;

import entity.Currency_Converter;
import java.sql.*;
import datasource.MariaDbConnection;
import java.util.*;

public class Currency_ConverterDao {

    public List<Currency_Converter> getAllCurrency_Converter() {
        Connection conn = MariaDbConnection.getConnection();
        String sql = "SELECT id, code, name, rateToUSD FROM Currency_Converter";
        List<Currency_Converter> currencies = new ArrayList<Currency_Converter>();

        try {
            Statement s = conn.createStatement();
            ResultSet rs = s.executeQuery(sql);

            while (rs.next()) {
                int id = rs.getInt(1);
                String code = rs.getString(2);
                String name = rs.getString(3);
                double rateToUSD = rs.getDouble(4);
                Currency_Converter emp = new Currency_Converter(id, code, name, rateToUSD);
                currencies.add(emp);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return currencies;
    }


    public Currency_Converter getEmployee(int id) {
        Connection conn = MariaDbConnection.getConnection();
        String sql = "SELECT id, code, name, rateToUSD FROM Currency_Converter WHERE id=?";

        String code = null;
        String name = null;
        double rateToUSD = 0.0;
        int count = 0;

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                count++;
                id = rs.getInt(1);
                code = rs.getString(2);
                name = rs.getString(3);
                rateToUSD = rs.getDouble(4);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        if (count==1) {
            return new Currency_Converter(id, code, name, rateToUSD);
        }
        else {
            return null;
        }
    }

    /*public void persist(Currency_Converter curr) {
        Connection conn = MariaDbConnection.getConnection();
        String sql = "INSERT INTO employee (first_name, last_name, email, salary) VALUES (?, ?, ?, ?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, curr.getId());
            ps.setString(2, curr.getCode());
            ps.setString(3, curr.getName());
            ps.setDouble(4, curr.getRateToUSD());

            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }*/
}