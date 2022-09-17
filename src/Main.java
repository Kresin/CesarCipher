package src;

import src.cypher.CesarCypher;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        CesarCypher cypher = new CesarCypher();

        int option = 1;
        while (option != 3) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Digite 1 para criptografar; 2 para descriptografar ou 3 para sair");
            option = Integer.parseInt(scanner.nextLine());

            if (option == 1) {
                System.out.println("Digite o texto que deve ser criptografado");
                String text = scanner.nextLine();
                System.out.println(cypher.encrypt(text));
            } else if (option == 2) {
                System.out.println("Digite o texto que deve ser descriptografado");
                String text = scanner.nextLine();
                System.out.println(cypher.decrypt(text));
            }
        }
    }

}
