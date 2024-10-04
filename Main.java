import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] numeros = new int[20];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 20; i++) {
            System.out.println("Introduce el " + i + 1 + "número: ");
            numeros[i] = scanner.nextInt();
        }

        System.out.println("Número, Cuadrado, Cubo");
        for (int i = 0; i < 20; i++) {
            int cuadrado = numeros[i] * numeros[i];
            int cubo = numeros[i] * numeros[i] * numeros[i];
            System.out.println(numeros[i] + ", " + cuadrado + ", " + cubo);
        }
    }
}
