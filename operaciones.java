
package examenunidad1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class operaciones {
    Scanner lector = new Scanner(System.in);
        List<Integer> lista = new ArrayList<Integer>();

    public void ingresar(){
    for (int i = 1; i <= 10; i++) {
        System.out.println("ingrese el dato "+""+i);
        int dato;
        dato= lector.nextInt();
        lista.add(dato);
    }
    }
    public void suma(){
        int total=0;
        System.out.println("Ingresa las posiciones a sumar ");
        int dato1, dato2, dato3;
        dato1= lector.nextInt();
        dato2= lector.nextInt();
        dato3= lector.nextInt();
        lista.get(dato1);
        total=lista.get(dato1)+lista.get(dato2)+ lista.get(dato3);
        System.out.println("EL TOTAL DE LA SUMA ES"+total);
    }
       public void restar(){
        int total=0;
        System.out.println("ingresalos las posiciones");
        int dato1, dato2;
        dato1= lector.nextInt();
        dato2= lector.nextInt();
        total=lista.get(dato1)-lista.get(dato2);
        System.out.println("EL TOTAL DE LA RESTA ES"+total);

           
    }
          public void multiplicar(){
        int total=0;
        System.out.println("ingresalos las posiciones");
        int dato1, dato2, dato3;
        dato1= lector.nextInt();
        dato2= lector.nextInt();
        dato3= lector.nextInt();
        total=lista.get(dato1)*lista.get(dato2)* lista.get(dato3);
                      System.out.println("EL TOTAL DE LA MULTIPLICACION ES"+total);
    }
  }  
