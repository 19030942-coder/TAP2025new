import java.util.Scanner;

public class selecUsuario {

    public String mostUsuario(String[] usuarios, String[] nombres, int intentos,int usuarioActual) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== Bienvenido al Cajero ===");

        while (intentos < 3 && usuarioActual == -1) {
            System.out.print("Ingrese su PIN: ");
            String pin = scanner.nextLine();
            for (int i = 0; i < usuarios.length; i++) {
                if (usuarios[i].equals(pin)) {
                    usuarioActual = i;
                    break;
                }
            }
            if (usuarioActual == -1) {
                System.out.println("PIN incorrecto.");
                intentos++;
            }
        }

        if (usuarioActual == -1) {
            System.out.println("Demasiados intentos fallidos. Adiós.");
        }

        System.out.println("Bienvenido, " + nombres[usuarioActual]);
        return nombres[usuarioActual];
    }
}