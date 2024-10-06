import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Conversiones conversor = new Conversiones();
        int cont = 0;
        while(cont != 1){
            System.out.println("Hola bienvenido a mi conversor de monedas :D" +
                    "\nElija la opcion que quiere realizar:\n1. Dolar a Peso Argentino " +
                    "\n2. Peso Argentino a Dolar\n3. Dolar a Real Brasileño\n4. Real Brasileño a Dolar\n5. Dolar a Peso Colombiano\n6. Peso colombiano a Dolar\n7. Salir ");
            int menu = teclado.nextInt();
            if (menu==1){
                System.out.println("Digite el monto que desea hacer la conversion");
                double monto = teclado.nextDouble();
                Monedas resultado = conversor.ConversorMonedas("USD", "ARS", monto);
                System.out.println(resultado.formatoPersonalizado());
            }else if(menu == 2){
                System.out.println("Digite el monto que desea hacer la conversion");
                double monto = teclado.nextDouble();
                Monedas resultado = conversor.ConversorMonedas("ARS", "USD", monto);
                System.out.println(resultado.formatoPersonalizado());
            } else if (menu == 3) {
                System.out.println("Digite el monto que desea hacer la conversion");
                double monto = teclado.nextDouble();
                Monedas resultado = conversor.ConversorMonedas("USD", "BRL", monto);
                System.out.println(resultado.formatoPersonalizado());

            }else if (menu == 4) {
                System.out.println("Digite el monto que desea hacer la conversion");
                double monto = teclado.nextDouble();
                Monedas resultado = conversor.ConversorMonedas("BRL", "USD", monto);
                System.out.println(resultado.formatoPersonalizado());

            }else if (menu == 5) {
                System.out.println("Digite el monto que desea hacer la conversion");
                double monto = teclado.nextDouble();
                Monedas resultado = conversor.ConversorMonedas("USD", "BRL", monto);
                System.out.println(resultado.formatoPersonalizado());

            }else if (menu == 6) {
                System.out.println("Digite el monto que desea hacer la conversion");
                double monto = teclado.nextDouble();
                Monedas resultado = conversor.ConversorMonedas("COP", "USD", monto);
                System.out.println(resultado.formatoPersonalizado());

            } else if (menu == 7) {
                break;

            }else{
                System.out.println("Opcion invalida");
            }
        }
    }
}
