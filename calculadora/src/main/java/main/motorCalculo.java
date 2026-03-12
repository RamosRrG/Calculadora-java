package main;

import java.util.ArrayList;

public class motorCalculo {

    public static String calculo(String expressao){
        LeitorExpressao expressao_calc = new LeitorExpressao(String expressao);


    }





    private  ArrayList<String> resolveMultiplicacaoDivisao(ArrayList<String> expressao){
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
             }if(objetoExpressao.equals("/")){
                    double resultado = anterior / posterior;
                    pre_resultado.add(String.valueOf(resultado));
                }
            }
        }
        return pre_resultado;
    }
    private ArrayList<String> resolveAdicaoSubtracao(ArrayList<String> pre_calculo){
        ArrayList<String> calculoFinal = new ArrayList<>();
        for (int i = 0; i < pre_calculo.size() ; i++) {
            if(!pre_calculo.get(i).equals("+")|| !pre_calculo.get(i).equals("-")){
                calculoFinal.add(pre_calculo.get(i));
            }else{
                double anterior = Double.parseDouble(pre_calculo.get(i-1));
                double posterior = Double.parseDouble(pre_calculo.get(i+1));
                if (pre_calculo.equals("+")){
                    double resultado = anterior+posterior;
                    calculoFinal.add(String.valueOf(resultado));
                }if(pre_calculo.equals("-")){
                    double resultado = anterior - posterior;
                    calculoFinal.add(String.valueOf(resultado));
                }
            }
        }
        return calculoFinal;
    }


}
