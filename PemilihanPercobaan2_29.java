import java.util.Scanner;

class PemilihanPercobaan2_29 {
    public static void main(String[] args) {
        Scanner input29 = new Scanner(System.in);
        System.out.print("Masukkan KKM: ");
        int angka = input29.nextInt();
        System.out.print("Nilai UAS: ");
        float uas = input29.nextFloat();
        System.out.print("Nilai UTS: ");
        float uts = input29.nextFloat();
        System.out.print("Nilai kuis: ");
        float kuis = input29.nextFloat();
        System.out.print("Nilai tugas: ");
        float tugas = input29.nextFloat();
        float total = (uas * 0.4F) + (uts * 0.3F) + (kuis * 0.1F) + (tugas * 0.2F);

        String predikat;
        if (total > 80) {
            predikat = "A";
        } else if (total > 73) {
            predikat = "B+";
        } else if (total > 65) {
            predikat = "B";
        } else if (total > 60) {
            predikat = "C+";
        } else if (total > 50) {
            predikat = "C";
        } else if (total > 39) {
            predikat = "D";
        } else {
            predikat = "E";
        }
    
        String huruf;
        if (predikat.equals("A")) {
            huruf = "Sangat Baik";
        } else if (predikat.equals("B+") || predikat.equals("B")) {
            huruf = "Lebih dari Baik";
        } else {
            huruf = "Baik";
        }

        String message = total < 65 ? "Remidi" : "Tidak remidi";
        System.out.print("Nilai akhir = " + total + ", sehingga " + message);
        System.out.println("Nilai predikat = " + predikat);
        System.out.println("Nilai huruf = " + huruf);
}
}