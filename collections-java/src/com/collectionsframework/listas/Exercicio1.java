package com.collectionsframework.listas;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class Exercicio1 {
   public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       List<Double> temperaturas = new ArrayList<>();

       for (int i = 0; i < 6; i++) {
           System.out.println("Enter the temperature of the "+i+"month");
           Double temperatura = s.nextDouble();
           temperaturas.add(temperatura);
       }

       Iterator<Double> iterator = temperaturas.iterator();
       Double soma = 0d;

       while(iterator.hasNext()){
           Double next = iterator.next();
           soma += next;
       }

       Double media = soma/6;

       for(Double temperatura: temperaturas){
           if(temperatura > media){
               System.out.println(temperatura);
           }
       }
   } 
}
