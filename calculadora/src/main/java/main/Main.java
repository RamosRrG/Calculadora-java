package main;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com a expressão matematica: ");
        String expressao = sc.nextLine();

        MotorCalculo calculo = new MotorCalculo();

        System.out.println(calculo.calculo(expressao));

        sc.close();
    }
}
