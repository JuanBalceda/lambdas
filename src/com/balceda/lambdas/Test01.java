/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.balceda.lambdas;

import com.balceda.interfaces.IMath;

/**
 *
 * @author jbalceda
 */
public class Test01 {

    public static void main(String[] args) {

        IMath math1 = (a, b) -> (a + b);
        IMath math2 = (a, b) -> (a - b);
        System.out.println("Suma de 5 y 7: " + math1.operation(5, 7));
        System.out.println("Resta de 15 y 7: " + math2.operation(15, 7));
    }
}
