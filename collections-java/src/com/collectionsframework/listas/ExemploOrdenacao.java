package com.collectionsframework.listas;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ExemploOrdenacao {

    public static void main(String[] args) {
        List<Gato> meusGatos = new ArrayList<>(){{
            add(new Gato("Jon", 18, "preto"));
            add(new Gato("Simba", 6, "cor"));
            add(new Gato("Jon", 12, "amarelo"));
        }};

        // mostrar todos na ordem de inserção
        System.out.println(meusGatos);

        // mostrar todos na ordem aleatoria
        Collections.shuffle(meusGatos);
        System.out.println(meusGatos);

        // mostrar na ordem natural de nomes

        Collections.sort(meusGatos);
        System.out.println(meusGatos);

        // mostrar na ordem de idade

        Collections.sort(meusGatos, new ComparatorIdade());
        System.out.println(meusGatos);

        // mostrar na ordem natural de cor

        Collections.sort(meusGatos, new ComparatorCor());
        System.out.println(meusGatos);

        // mostrar na ordem nome/cor/idade

        meusGatos.sort(new ComparatorNomeCorIdade());
        System.out.println(meusGatos);

    }
    
}

class Gato implements Comparable<Gato>{
    private String nome;
    private Integer idade;
    private String cor;

    public Gato(String nome, Integer idade, String cor){
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    public String getNome(){
        return this.nome;
    }

    public String getCor() {
        return cor;
    }

    public Integer getIdade() {
        return idade;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "{" +
                "nome = '" + nome + '\'' +
                ", idade= " + idade +
                ", cor='" + cor + '\'' +
                '}';
    }

    @Override
    public int compareTo(Gato gato) {
        // TODO Auto-generated method stub
        return this.getNome().compareToIgnoreCase(gato.getNome());
    }
}

class ComparatorIdade implements Comparator<Gato>{

    @Override
    public int compare(Gato g1, Gato g2) {
        // TODO Auto-generated method stub
        return Integer.compare(g1.getIdade(), g2.getIdade());
    }

}

class ComparatorCor implements Comparator<Gato>{

    @Override
    public int compare(Gato g1, Gato g2) {
        // TODO Auto-generated method stub
        return g1.getCor().compareToIgnoreCase(g2.getCor());
    }

}

class ComparatorNomeCorIdade implements Comparator<Gato>{

    @Override
    public int compare(Gato g1, Gato g2) {
        // TODO Auto-generated method stub
        int nome = g1.getNome().compareToIgnoreCase(g2.getNome());
        if(nome != 0 ) return nome;

        int cor = g1.getCor().compareToIgnoreCase(g2.getCor());
        if(cor != 0) return cor;

        return Integer.compare(g1.getIdade(), g2.getIdade()); 
    }

}