import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        String cliente = "Rene Jimenez";
        String tipoCuenta = "Ahorro";
        float saldo = 15000;
        int opcion = 0;
        float retirar = 0;
        float deposito = 0;

        System.out.println("\nBienvenido a su Banca Online!\n");
        System.out.println("Nombre del cliente: " + cliente);
        System.out.println("Tipo de cuenta: " + tipoCuenta);
        System.out.println("Saldo Disponible: L. " + saldo);

        do {
            System.out.println("\nMENU");
            System.out.println("1. Consultar Saldo");
            System.out.println("2. Retirar");
            System.out.println("3. Depositar");
            System.out.println("4. Salir");
            System.out.println("Ingrese su opcion: ");
            opcion = teclado.nextInt();

            switch(opcion){
                case 1:
                    System.out.println("Saldo Disponible: " + saldo);
                    break;
                case 2:
                    System.out.println("Cuanto desea retirar: ");
                    retirar = teclado.nextFloat();
                    if (retirar < saldo){
                        saldo -= retirar;
                        System.out.println("Saldo Disponible: " + saldo);
                    }else{
                        System.out.println("Fondos insuficientes");
                        break;
                    }
                case 3:
                    System.out.println("Cuanto desea depositar: ");
                    deposito = teclado.nextFloat();
                    saldo += deposito;
                    System.out.println("Saldo Disponible: " + saldo);
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Ingreso una opcion invalida! Intente de nuevo");
                    break;
            }

        }while(opcion != 4);

        System.out.println("Adios!");

    }
}