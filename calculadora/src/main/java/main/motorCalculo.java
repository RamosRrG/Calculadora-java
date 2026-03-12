package main;

import java.util.ArrayList;

public class motorCalculo {
    public ArrayList<String> resolveMultiplicacaoDivisao(ArrayList<String> expressao){
        ArrayList<String> pre_resultado = new ArrayList<>();
        for (int i = 0; i < expressao.size(); i++) {       //tamanho da lista de array
            String objetoExpressao = expressao.get(i);     //capturando o objeto do indice
            if(!objetoExpressao.equals("*") ||!objetoExpressao.equals("/") ){
                 pre_resultado.add(objetoExpressao);
            }else{
                double anterior = Double.parseDouble(expressao.get(i-1));
                double posterior = Double.parseDouble(expressao.get(i+1));
             if (objetoExpressao.equals("*")){
                 double resultado = anterior*posterior;
                 pre_resultado.add(String.valueOf(resultado));
             }
            }
        }
        return pre_resultado;
    }
}
