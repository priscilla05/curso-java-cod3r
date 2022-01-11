package Classe;

public class ValorVsReferencia {
    public static void main(String[] args) {
        double a = 2;
        double b = a; //aribuição por valor (tipo primitivo)
        a++;
        b--;
        System.out.println(a + " " + b);

        Data d1 = new Data(1, 6, 2022);
        Data d2 = d1; //atribuição por referência (objeto)
        d1.dia = 31;
        d2.mes = 12;
        d1.ano = 2025; // eu acrescentei o ano e isso vai impactar no ano das duas
        System.out.println(d1.obterDataFormatada());
        System.out.println(d2.obterDataFormatada());

        voltarDataParaValorPadrao(d1);

        System.out.println(d1.obterDataFormatada());
        System.out.println(d2.obterDataFormatada());
        int c = 5;
        alterarPrimitivo(c);
        System.out.println(c);
    }
    static void voltarDataParaValorPadrao(Data d){ // isso eh um método
        d.dia = 1;
        d.mes = 1;
        d.ano = 1970;
    }
    static void alterarPrimitivo(int a){
        a++;
    }
}

