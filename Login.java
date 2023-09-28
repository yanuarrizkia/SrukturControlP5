import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String bUsername = "123";
        String bPassword = "abc";
        System.out.print("Masukkan username: ");
        String aUsername = input.nextLine();

        switch (aUsername) {
            case "123":
                System.out.print("Masukkan password: ");
                String aPassword = input.nextLine();
                if (aPassword.equals(bPassword)) {
                    System.out.println("Selamat Datang!");
                } else {
                    System.out.println("Password Salah.");
                }
                break;
            default:
                System.out.println("Username Salah.");
                break;
        }

        input.close();
    }
}



