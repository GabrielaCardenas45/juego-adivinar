import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int number = random.nextInt(100);
        int numero = 0;

        System.out.println("bienvanido al juego de adivinar numeros");

        int adivina;
        do {
            System.out.println("ingresa un numero");
            adivina = input.nextInt();
            numero++;

            if (adivina < number) {
                System.out.println("el numero que intentas adivinar es mayor");
            } else if (adivina > number) {
                System.out.println("el numero que intentas adivinar es menor");
            }
        } while (adivina != number) ;

        System.out.println(" ADIVINASTE EL NUMERO EN " + numero + " intentos fallidos " );

    }
}