package dao;

import entity.Currency_Converter;
import java.sql.*;
import datasource.MariaDbConnection;
import java.util.*;

public class Currency_ConverterDao {

    public double getExchangeRate(String code) {
        Connection conn = MariaDbConnection.getConnection();
        String sql = "SELECT rateToUSD FROM Currency_Converter WHERE code=?";
        double rate = -1.0;

        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, code);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                rate = rs.getDouble("rateToUSD");
            }
        } catch (SQLException e) {
            System.out.println("Error fetching exchange rate for " + code);
            e.printStackTrace();
        }
        return rate;
    }
}