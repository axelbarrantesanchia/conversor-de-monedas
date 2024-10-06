import java.util.List;

public record Monedas(double USD, double ARS, double COP, double BRL, double conversion_result, String fromCurrency, String toCurrency) {

    public String formatoPersonalizado() {
        return "El resultado de la conversión de " + fromCurrency + " a " + toCurrency + " es: " + conversion_result;
    }

}
