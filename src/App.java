import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int tarde;
        int aTiempo1 = pedirDatos(entrada, "Ingrese el número del primer hermano que llega a tiempo: ");
        int aTiempo2 = pedirDatos(entrada, "Ingrese el número del segundo hermano que llega a tiempo: ");

        if (aTiempo1 == 1 && aTiempo2 == 2) {
            tarde = 3;
        } else if (aTiempo1 == 1 && aTiempo2 == 3) {
            tarde = 2;
        } else {
            tarde = 1;
        }
        System.out.printf("El hermano que llega tarde es: %d\n", tarde);
    }

    public static int pedirDatos(Scanner entrada, String mensaje) {

        int number = 0;
        boolean validator = false;
        do {
            System.out.print(mensaje);
            if (entrada.hasNextInt()) {
                number = entrada.nextInt();
                if (number == 1 || number == 2 || number == 3) {
                    validator = true;
                } else {
                    System.out.println("El número debe ser 1, 2 o 3.");
                }
            } else {
                System.out.println("Entrada inválida. Debe ingresar 1, 2 o 3.");
                entrada.next();
            }
        } while (!validator);

        return number;
    }
}
