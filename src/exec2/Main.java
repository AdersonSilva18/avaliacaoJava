package exec2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escreva uma sequencia de numeros juntos separados por virgula. Exemplo(1,2,3,4)");
        String numerosString = sc.next();

        String[] split = numerosString.split(",");

        System.out.println("Ecreva um numero alvo");
        Integer alvo = sc.nextInt();

        for (int i = 0; i < split.length; i++) {
            if (Integer.parseInt(split[i]) == alvo){
                System.out.println("Numero encontrado na posicao: "+ i);
                System.exit(0);
            }
        }
        System.out.println("Numero nao encontrado");
    }
}
