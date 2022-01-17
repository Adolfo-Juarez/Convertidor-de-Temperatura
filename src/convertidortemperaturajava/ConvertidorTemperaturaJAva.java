package convertidortemperaturajava;

import java.util.Scanner;

public class ConvertidorTemperaturaJAva{
    public static void main (String [] Args){
        Scanner sc = new Scanner(System.in);
        Conversor cv = new Conversor();
        int eleccion;
        
        do{
        System.out.print("Ingrese el grado Celsius que desea convertir: ");
        float Celsius = sc.nextFloat();
        float f=cv.Fahrenheit(Celsius);
        float k=cv.Kelvin(Celsius);
        
        System.out.println(Celsius+" °C\n"+f+" °F\n"+k+" K\n¿Desea realizar otra conversión? \n1) Sí \n2) No");
        eleccion = sc.nextInt();
        }while(eleccion != 2);
    }
}