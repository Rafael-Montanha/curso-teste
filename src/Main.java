import java.util.Scanner;

public class Main {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int idade = sc.nextInt();

        if(idade < 18) {
            System.out.println("Criança");
        } else {
            System.out.println("Adulto");
        }
    }
}

