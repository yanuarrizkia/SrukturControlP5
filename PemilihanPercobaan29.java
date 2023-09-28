import java.util.Scanner;
class PemilihanPercobaan29{
    public static void main(String args[]){
        Scanner input29 = new Scanner(System.in);
        System.out.print("masukan angka = ");
        int angka = input29.nextInt();
        
        String hasil = ((angka % 2 == 0) ?   "Bilangan genap" : "Bilangan ganjil");
        System.out.println(hasil);

    }
}