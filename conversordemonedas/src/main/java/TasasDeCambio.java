import java.util.HashMap;
import java.util.Map;

public class TasasDeCambio {
    private static final Map<String, Double> rates = new HashMap<>();

    static {
        // Definiendo las tasas de cambio
        rates.put("USD_TO_ARS", 20293.75);
        rates.put("ARS_TO_USD", 1 / 20293.75);
        rates.put("USD_TO_BRL", 5.25);
        rates.put("BRL_TO_USD", 1 / 5.25);
        rates.put("USD_TO_COP", 4078.25);
        rates.put("COP_TO_USD", 1 / 4078.25);
    }

    public static double getRate(String conversion) {
        return rates.getOrDefault(conversion, 0.0);
    }
}

