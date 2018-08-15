/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.balceda.lambdas;

/**
 *
 * @author jbalceda
 */
public class Test02 {

    interface Calculadora {

        int operation(int x, int y);
    }

    private int funciones(int a, int b, Calculadora c) {
        return c.operation(a, b);
    }

    public static void main(String[] args) {
        Calculadora c = (x, y) -> x * y;
        System.out.println("Producto 9 x 10: " + c.operation(9, 10));

        Test02 t = new Test02();
        System.out.println("Producto 9 x 10: " + t.funciones(9, 10, c));
    }
}
