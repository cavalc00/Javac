package Comparator;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class ExemplosPratico {
    public static void main(String[] args) {

        List<Estudante> estudantes = new ArrayList<>();

        estudantes.add(new Estudante("Mario", 19));
        estudantes.add(new Estudante("Larissa", 18));
        estudantes.add(new Estudante("João", 20));
        estudantes.add(new Estudante("Carlos", 22));
        estudantes.add(new Estudante("Pedro", 26));
        estudantes.add(new Estudante("Carl", 35));
        estudantes.add(new Estudante("Bruno", 16));
        estudantes.add(new Estudante("Creusa", 21));
        estudantes.add(new Estudante("Jorge", 22));

        System.out.println("-----ORDEM DE INSERÇÃO-----");
        System.out.println(estudantes+"\n");

        System.out.println("-----ORDEM NATURAL-----");
        estudantes.sort((first, second) -> first.getIdade() - second.getIdade() );
        System.out.println(estudantes);


    }
}
