package com.collectionsframework.listas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Exemplo{
    public static void main(String[] args) {
        // Inicialização
        List<Double> notas1 = new ArrayList<>();
        List<Double> notas2 = List.of(7d, 8.5, 9.3, 10.00, 5.1); // a lista fica imutável

        List<Double> notas = new ArrayList<>();

        // adicionar elementos
        notas.add(7.0);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(0.0);
        notas.add(6.0);
        notas.add(3.6);

        // print de todos os elementos
        System.out.println(notas);
        System.out.println(notas.toString());

        // substituir elementos

        notas.set(notas.indexOf(5d), 6.0);
        System.out.println(notas);

        // verifica se valor está na lista

        System.out.println(
            notas.contains(5d)
        );

        // for each - iteração

        for(Double nota: notas){
            System.out.println(nota);
        }

        // pega a partir de index

        System.out.println(
            notas.get(2)
        );

        // para pegar a menor nota usando a interface collections

        System.out.println(
            Collections.min(notas)
        );

        // pegar a maior nota

        System.out.println(
            Collections.max(notas)
        );
        
        // ver a soma dos valores com iterator

        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;

        while(iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }

        System.out.println(soma);

        // remover elemento

        notas.remove(0d);
        System.out.println(notas);

        // Remove com limite

        Iterator<Double> iterator2 = notas.iterator();
        while(iterator2.hasNext()){
            Double next = iterator2.next();
            if(next < 7){
                iterator2.remove();
            }
        }
        System.out.println(notas);

        // remover todos os elementos

        notas.clear();

        /// verificar se a List está vazia

        System.out.println(
            notas.isEmpty()
        );

    }
}