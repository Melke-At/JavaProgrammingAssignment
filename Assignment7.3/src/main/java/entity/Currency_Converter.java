package entity;


import jakarta.persistence.Entity;
import jakarta.persistence.*;

@Entity
@Table(name = "Currency_Converter")
public class Currency_Converter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false, unique = true)
    private String code;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private double rateToUSD;

    public Currency_Converter() {}  // JPA requires a no-arg constructor

    public Currency_Converter(String code, String name, double rateToUSD) {
        this.code = code;
        this.name = name;
        this.rateToUSD = rateToUSD;
    }

    public int getId() { return id; }
    public String getCode() { return code; }
    public String getName() { return name; }
    public double getRateToUSD() { return rateToUSD; }

    public void setCode(String code) { this.code = code; }
    public void setName(String name) { this.name = name; }
    public void setRateToUSD(double rateToUSD) { this.rateToUSD = rateToUSD; }

    @Override
    public String toString() {
        return code + " - " + name;
    }
}
