package exec3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Integer pares = 0;

        System.out.println("Escreva uma sequencia de numeros juntos separados por virgula. Exemplo(1,2,3,4)");
        String numerosString = sc.next();

        String[] split = numerosString.split(",");

        for (int i = 0; i < split.length; i++) {

            if (isPar(Integer.parseInt(split[i]))) {
                System.out.println("Numero: "+ split[i] + " é par");
                pares ++;
            }else {
                System.out.println("Numero: "+ split[i] + " é impar");
            }
            System.out.println("Quantidade de pares: " + pares);
            System.out.println("Quantidade de impares: " + (split.length - pares));
        }
    }

    public static boolean isPar(Integer numero){
        return numero % 2 == 0;
    }
}
