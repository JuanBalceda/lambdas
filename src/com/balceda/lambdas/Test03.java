/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.balceda.lambdas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;

/**
 *
 * @author jbalceda
 */
public class Test03 {

    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        lista.add("Martín");
        lista.add("Alexandra");
        lista.add("Juan");
        lista.add("Rocio");
        lista.add("Rosa");
        lista.add("Sheyla");
        lista.add("Abigail");

        System.out.println("Nombres: " + lista);
        
        Collections.sort(lista, new Comparator<String>() {
            @Override
            public int compare(String t, String t1) {
                return t.compareTo(t1);
            }
        });

        System.out.println("Nombres: " + lista);

        Collections.sort(lista, (t, t1) -> t1.compareTo(t));

        //Print elements
        lista.stream()
                .forEach(l -> System.out.print(l + " "));

        lista.removeIf(s -> s.length() % 2 != 0);
        System.out.println("\n"+lista);
        
        lista.replaceAll(String::toUpperCase);
        System.out.println("\n"+lista);
        
         
    }
}
