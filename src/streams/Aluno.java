package streams;

import java.util.Objects;

public class Aluno {

    final String nome;
    final double nota;


    public Aluno(String nome, double nota) {
        this.nome = nome;
        this.nota = nota;
    }

    @Override
    public String toString() {
        return nome + " Tem nota " + nota;
    }


    }



