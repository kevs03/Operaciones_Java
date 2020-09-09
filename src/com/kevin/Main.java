package com.kevin;

public class Main {

    public static void main(String[] args) {

        Operaciones ope = new Operaciones(33,15);

        //Impimimos los resultados
        System.out.println("La Suma es: "+ope.Suma());
        System.out.println("La Resta es: "+ope.Resta());
        System.out.println("La Multiplicacion es: " +ope.Multiplicacion());
        System.out.println("La Division es: "+ope.Division());
        System.out.println("El Modulo es: "+ope.Modulo());
    }
}