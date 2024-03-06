package exec4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escreva uma sequencia de numeros juntos separados por virgula. Exemplo(1,2,3,4)");
        String numerosString = sc.next();

        String[] split = numerosString.split(",");

        separador(split);
    }

    public static boolean isPar(Integer numero){
        return numero % 2 == 0;
    }

    public static void separador(String[] vetor ){

        Integer pares = 0;
        Integer impares = 0;

        for (int i = 0; i < vetor.length; i++) {
            if (isPar(Integer.parseInt(vetor[i]))) {
                pares += Integer.parseInt(vetor[i]);
            }else {
                impares -= Integer.parseInt(vetor[i]);
            }
            System.out.println("Soma de pares: " + pares);
            System.out.println("Soma de impares: " + impares);
        }
    }
}
