import java.util.Scanner;

public class WeaponUsage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan jarak antara Anda dan musuh (dalam meter): ");
        double jarak = input.nextDouble();
        
        if (jarak <= 5) {
          
            System.out.println(" pertarungan malee weapon jarak dekat.");
        } else if (jarak > 5 && jarak <= 1000) {
            
            System.out.println(" pertarungan range weapon jarak menengah atau jauh.");
        } else {
            // Jarak tidak valid
            System.out.println("Jarak tidak valid. Perhatikan jarak Anda.");
        }
        
        input.close();
    }
}