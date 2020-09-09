package com.kevin;

public class Operaciones {
    //Se declaran los numeros
    private float num1;
    private float num2;

    //Les asignamos sus atributos
    public  Operaciones(float num1,float num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    //Indicamos que va a retornar los metodos
    public float Suma (){
        return this.num1 + this.num2;
    }

    public float Resta () {
        return this.num1 - this.num2;
    }

    public float Multiplicacion () {
        return this.num1 * this.num2;
    }

    public float Division () {
        return this.num1 / this.num2;
    }

    public float Modulo () {
        return this.num1 % this.num2;
    }

}
