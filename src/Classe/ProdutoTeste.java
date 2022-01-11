package Classe;


public class ProdutoTeste {
    public static void main(String[] args) {
        // 1ºProduto classe e 2ºProduto construtor
        Produto p1 = new Produto(); // p1 é o nome da variável
        p1.nome = "Notebook";
        p1.preco = 4356.89;
        p1.desconto = 0.25;

        var p2 = new Produto();
        p2.nome= "Caneta Preta";
        p2.preco = 12.56;
        p2.desconto = 0.29;
        System.out.println(p1.nome);
        System.out.println(p2.nome);
        double precoFinal1 = p1.precoComDesconto();
        double precoFinal2 = p2.precoComDesconto();
        double mediaCarrinho= (precoFinal1 + precoFinal2)/2;
        System.out.printf("Média carrinho =R$%.2f" , mediaCarrinho);




    }
}
