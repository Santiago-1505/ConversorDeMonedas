import java.util.Scanner;

public class Conversor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Seleccione una opción válida:");
        System.out.println("1) Dólar => Peso argentino");
        System.out.println("2) Peso argentino => Dólar");
        System.out.println("3) Dólar => Real brasileño");
        System.out.println("4) Real brasileño => Dólar");
        System.out.println("5) Dólar => Peso colombiano");
        System.out.println("6) Peso colombiano => Dólar");
        System.out.println("7) Salir");

        int opcion = scanner.nextInt();
        if (opcion == 7) {
            System.out.println("Gracias por usar el conversor de monedas.");
            return;
        }

        System.out.println("Ingrese el valor que deseas convertir:");
        double valor = scanner.nextDouble();

        double resultado = 0.0;
        String conversion = "";
        switch (opcion) {
            case 1:
                conversion = "USD_TO_ARS";
                resultado = valor * TasasDeCambio.getRate(conversion);
                System.out.println("El valor " + valor + " [USD] corresponde al valor final de >>> " + resultado + " [ARS]");
                break;
            case 2:
                conversion = "ARS_TO_USD";
                resultado = valor * TasasDeCambio.getRate(conversion);
                System.out.println("El valor " + valor + " [ARS] corresponde al valor final de >>> " + resultado + " [USD]");
                break;
            case 3:
                conversion = "USD_TO_BRL";
                resultado = valor * TasasDeCambio.getRate(conversion);
                System.out.println("El valor " + valor + " [USD] corresponde al valor final de >>> " + resultado + " [BRL]");
                break;
            case 4:
                conversion = "BRL_TO_USD";
                resultado = valor * TasasDeCambio.getRate(conversion);
                System.out.println("El valor " + valor + " [BRL] corresponde al valor final de >>> " + resultado + " [USD]");
                break;
            case 5:
                conversion = "USD_TO_COP";
                resultado = valor * TasasDeCambio.getRate(conversion);
                System.out.println("El valor " + valor + " [USD] corresponde al valor final de >>> " + resultado + " [COP]");
                break;
            case 6:
                conversion = "COP_TO_USD";
                resultado = valor * TasasDeCambio.getRate(conversion);
                System.out.println("El valor " + valor + " [COP] corresponde al valor final de >>> " + resultado + " [USD]");
                break;
            default:
                System.out.println("Elija una opción válida.");
        }
    }
}

