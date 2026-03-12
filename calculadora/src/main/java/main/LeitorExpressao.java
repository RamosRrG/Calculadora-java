package main;
import java.util.ArrayList;


public class LeitorExpressao {

    public String latir() {
        return "au au0";
    }

    public ArrayList<String> tokens(String expressao) {
        ArrayList<String> token = new ArrayList<String>();
        int tamanho = expressao.length();
        String caracterAtualAcumulado = "";
        for (int i = 0; i < tamanho; i++) {
            char caracterAtual = expressao.charAt(i);
            if (Character.isDigit(caracterAtual)) {
                caracterAtualAcumulado = caracterAtualAcumulado + caracterAtual;
            } else if (caracterAtual == '+' || caracterAtual == '-' || caracterAtual == '*' || caracterAtual == '/') {
                if (!caracterAtualAcumulado.isEmpty()) {
                    token.add(caracterAtualAcumulado);
                    caracterAtualAcumulado = "";
            }token.add(Character.toString(caracterAtual));//quando aplicado o metodo charAt o indice da string virou character. Para armazenar na lista transformei novamente em string.

            }
        } 
        if (!caracterAtualAcumulado.isEmpty()) {
            token.add(caracterAtualAcumulado);}
        return token;
    }
}

