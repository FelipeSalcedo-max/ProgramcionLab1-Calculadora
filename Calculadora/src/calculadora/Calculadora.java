/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;
import java.util.Scanner;
/**
 *
 * @author RetailAdmin
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    Scanner entradateclado= new Scanner (System.in);
        int numop, num1, num2, cantidadNumeros,i,nuevoNumero;
        float num3,resultado, rad, indice;
        System.out.println("Ingrese el numero de la operacion que desea ejecutar");
       
        System.out.println("1.  Suma" );
        System.out.println("2.  Resta");
        System.out.println("3.  Multiplicacion");
        System.out.println("4.  Division");
        System.out.println("5.  Seno");
        System.out.println("6.  Coseno");
        System.out.println("7.  Tangente");
        System.out.println("8.  Raiz enesima");
        System.out.println("9.  Potencia enesima");
        System.out.println("10. Iva 19%");
        System.out.print("seleccion --->");
        numop = entradateclado.nextInt ();
       
        switch (numop) {
                case 1 :        
                    System.out.println("Ingrese la cantidad de numeros que desea sumar: ");
                    cantidadNumeros = entradateclado.nextInt();
                   
                    resultado = 0;
                   
                    for(i = 1; i <= cantidadNumeros; i++)
                    {
                        System.out.print("Ingrese el numero (" + i + ") : ");
                        nuevoNumero = entradateclado.nextInt();
                        resultado = resultado + nuevoNumero;
                    }
                    System.out.println("El resultado de la suma es : " + resultado);
                    break;
                case 2:
                     System.out.print("Ingrese la cantidad de numeros que desea restar: ");
                    cantidadNumeros = entradateclado.nextInt();
                   
                    resultado = 0;
                   
                    for(i = 1; i <= cantidadNumeros; i++)
                    {
                        System.out.print("Ingrese el numero (" + i + ") : ");
                        nuevoNumero = entradateclado.nextInt();
                        resultado = resultado - nuevoNumero;
                    }
                    System.out.println("El resultado de la resta es : " + resultado);
                    break;
                case 3:
                    System.out.print("Ingrese la cantidad de numeros que desea multiplicar: ");
                    cantidadNumeros = entradateclado.nextInt();
                   
                    resultado = 1;
                   
                    for(i = 1; i <= cantidadNumeros; i++)
                    {
                        System.out.print("Ingrese el numero (" + i + ") : ");
                        nuevoNumero = entradateclado.nextInt();
                        resultado = nuevoNumero * resultado;
                    }
                    System.out.println("El resultado de la multiplicacion es : " + resultado);
                    break;
                case 4:
                    System.out.print("Ingrese el valor para el dividendo : ");
                    num1 = entradateclado.nextInt();
                    System.out.print("Ingrese el valor para el divisor : ");
                    num2 = entradateclado.nextInt();
                    if (num2 > 0) {
                    resultado =(float)num1/num2;
                    System.out.println("El resultado de la division es : " + resultado);
                    }  
                    else {
                        System.out.print("!ERROR¡ division por 0 ");
                    }
                    break;
                case 5:
                   System.out.print("Ingrese el valor del numero que le desea sacar el seno : ");
                    num3 = entradateclado.nextInt();
                     rad = (float) (num3 * Math.PI/180.0);
                    resultado = (float) Math.sin(rad);
                    System.out.println("El resultado del seno es : " + resultado);
                    break;
                case 6 :
                    System.out.print("Ingrese el valor del numero que le desea sacar el coseno : ");
                    num3 = entradateclado.nextInt();
                     rad = (float) (num3 * Math.PI/180.0);
                    resultado = (float) Math.cos(rad);
                    System.out.println("El resultado del coseno es : " + resultado);
                    break;
                case 7 :
                    System.out.print("Ingrese el valor del numero que le desea sacar la tangente : ");
                    num3 = entradateclado.nextInt();
                     rad = (float) (num3 * Math.PI/180.0);
                    resultado = (float) Math.tan(rad);
                    System.out.println("El resultado de la tangente es : " + resultado);
                    break;
                case 8 :
                    System.out.print("Ingrese el valor del radicando : ");
                    num3 = entradateclado.nextInt(); 
                    if (num3>=0){
                   
                    System.out.print("Ingrese el valor del indice : ");
                    num2 = entradateclado.nextInt();
                    indice = (float)1/num2;
                    resultado= (float) Math.pow(num3, indice);
                    System.out.println("El resultado de la raiz enesima es : " + resultado);
                    }else{
                        System.out.println("Ingresar en el radical un numero positivo");
                    }
                    break;
                case 9 :
                    System.out.print("Ingrese el valor del base : ");
                    num3 = entradateclado.nextInt();  
                    System.out.print("Ingrese el valor del exponente : ");
                    num2 = entradateclado.nextInt();
                    resultado= (float) Math.pow(num3, num2);
                    System.out.println("El resultado de la potencia enesima es : " + resultado);
                    break;
                case 10 :
                    System.out.print("Ingrese el numero al cual le desea sacar el 19% de iva : ");
                    num3 = entradateclado.nextInt();
                    resultado= (float) (num3 * 0.19);
                    System.out.print("El 19% de iva del valor ingresado es : " + resultado);
                    break;
                default :
                    System.out.println("La opcion ingresada no es valida");
                    break;
    }
}    
    
    
}
