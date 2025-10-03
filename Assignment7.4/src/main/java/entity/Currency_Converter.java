package entity;

public class Currency_Converter {
    private int id;
    private final String code;
    private final String name;
    private final double rateToUSD;

    public Currency_Converter(int id, String code, String name, double rateToUSD) {
        this.code = code;
        this.name = name;
        this.rateToUSD = rateToUSD;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public double getRateToUSD() {
        return rateToUSD;
    }

    @Override
    public String toString() {
        return code + " - " + name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
