package Classe.Desafio3Classes;

import Classe.Desafio3Classes.Comida;
import Classe.Desafio3Classes.Pessoa;

public class Jantar {
    public static void main(String[] args) {
        Comida c1 = new Comida("arroz", 0.180); // instanciei
      Comida c2 = new Comida ("feijão", 0.300);

      Pessoa p =new Pessoa ("João", 99.8);
      System.out.println(p.apresentar());
      p.comer(c1);
        System.out.println(p.apresentar());
        p.comer(c2);
        System.out.println(p.apresentar());




}
    }

