package principal;

import java.util.Scanner;

/**
 *
 * @author hermann paleta de colores RGB: 139, 0 , 47
 */
public class Desafio {

    public static void main(String[] args) {
        String nombre = "Juan Diaz";
        String tipoDeCuenta = "Corriente";
        double saldo = 1999.98;
        int opcion = 0;

        System.out.println("********************");
        System.out.println("\nNombre del cliente: " + nombre);
        System.out.println("Tipo de Cuenta es: " + tipoDeCuenta);
        System.out.println("Saldo actual: " + saldo);
        System.out.println("\n******************");

        String menu = """
                      **** Elige el numero deseado ****
                      1 - Consultar saldo
                      2 - Retirar
                      3 - Depositar
                      9 - Salir
                      """;

        Scanner teclado = new Scanner(System.in);

        while (opcion != 9) {
            System.out.println(menu);
            opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("El saldo actual es: " + saldo);
                    break;
                case 2:
                    System.out.println("¿Cuál es el valor que deseas retirar?");
                    double valorRetirar = teclado.nextDouble();
                    if (saldo < valorRetirar) {
                        System.out.println("Saldo insuficiente");
                    } else {
                        saldo = saldo - valorRetirar;
                        System.out.println("El saldo actualizado es: " + saldo);
                    }
                    break;
                case 3:
                    System.out.println("¿Cuál es el valor que deseas depositar?");
                    double valorDepositar = teclado.nextDouble();
                    saldo += valorDepositar;
                    System.out.println("El saldo actualizado es: " + saldo);
                    break;
                case 9:
                    System.out.println("saliendo del programa.  gracias por utilizar nuestros servicios");
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        }
    }
}
