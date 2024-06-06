import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nombreCliente = "Tony Stark";
        String tipoCuenta = "Corriente";
        double saldoCuenta = 1599.99;
        Scanner teclado = new Scanner(System.in);
        int opcionCliente;
        double movimientoCliente;
        int contador = 0;
        String datosCliente = """ 
                Nombre = %s
                Típo de Cuenta = %s
                Saldo disponible = $ %.2f
                """.formatted(nombreCliente, tipoCuenta, saldoCuenta);
        System.out.println("******************************");
        System.out.println("");
        System.out.println(datosCliente);
        System.out.println("******************************");
        while (contador != 1) {
            System.out.println("** Escriba el número de la opción deseada **");
            System.out.println("1 - Consultar saldo ");
            System.out.println("2 - Retirar");
            System.out.println("3 - Depositar");
            System.out.println("9 - Salír");
            opcionCliente = teclado.nextInt();
            switch (opcionCliente){
                case 1:
                    System.out.printf("Tu saldo actualizado es: $ %.2f \n", saldoCuenta);
                    break;
                case 2:
                    System.out.println("Ingresa la cantidad a retirar: ");
                    movimientoCliente = teclado.nextDouble();
                    if (movimientoCliente <= saldoCuenta){
                        saldoCuenta -= movimientoCliente;
                        System.out.printf("Saldo restante: $ %.2f \n", saldoCuenta);
                    } else {
                        System.out.println("Cantidad no valida, puedes retirar hasta: $ " + saldoCuenta);
                    }
                    break;
                case 3:
                    System.out.println("Ingrese la cantidad a depositar: ");
                    movimientoCliente = teclado.nextDouble();
                    saldoCuenta += movimientoCliente;
                    System.out.printf("Tu saldo actualizado es: $ %.2f \n", saldoCuenta);
                    break;
                case 9:
                    System.out.println("Finalizando programa. Muchas gracias por usar nuestros servicios.");
                    contador++;
                    break;

                default:
                    System.out.println("Opción no valida, intente de nuevo.");
                    break;
            }
        }



    }
}