import java.util.Scanner;

public class PemilihanPercobaan3_29 {
    public static void main(String[] args) {
        Scanner input29 = new Scanner(System.in);
        System.out.print("Masukkan angka pertama: ");
        double angka1 = input29.nextDouble();
        System.out.print("Masukkan angka kedua: ");
        double angka2 = input29.nextDouble();
        System.out.print("Masukkan operator (+, -, *, /): ");
        char operator = input29.next().charAt(0);
        double hasil = 0.0;

        switch (operator) {
            case '+':
                hasil = angka1 + angka2;
                System.out.println(angka1 + " + " + angka2 + " = " + hasil);
                
            case '-':
                hasil = angka1 - angka2;
                System.out.println(angka1 + " - " + angka2 + " = " + hasil);
                break;
            case '*':
                hasil = angka1 * angka2;
                System.out.println(angka1 + " * " + angka2 + " = " + hasil);
                break;
            case '/':
                    hasil = angka1 / angka2;
                    System.out.println(angka1 + " / " + angka2 + " = " + hasil);
              break;
                }
            }
        }