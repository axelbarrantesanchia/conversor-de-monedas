import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Conversiones {

    Monedas ConversorMonedas(String moneda, String monedacambio, double monto){
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/6058f8c6ee759ba7c71039de/pair/"+moneda+"/"+monedacambio+"/"+monto);
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();
        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            Monedas monedas = new Gson().fromJson(response.body(), Monedas.class);

            // Devolver una nueva instancia de Monedas con los valores de fromCurrency y toCurrency
            return new Monedas(monedas.USD(), monedas.ARS(), monedas.COP(), monedas.BRL(), monedas.conversion_result(), moneda, monedacambio);
        } catch (Exception e) {
            throw new RuntimeException("Error");
        }

    }
}


