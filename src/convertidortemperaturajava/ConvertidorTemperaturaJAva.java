package convertidortemperaturajava;

import java.util.Scanner;

public class ConvertidorTemperaturaJAva{
    public static void main (String [] Args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese el grado Celsius que desea convertir: ");
        float Celsius = sc.nextFloat();
        float f=Fahrenheit(Celsius);
        float k=Kelvin(Celsius);
        
        System.out.println(Celsius+" °C\n"+f+" °F\n"+k+" K");
    }
    public static float Fahrenheit (float c){
        float result=0;
        result=32+(9*c/5);
        
        return result;
    }
    
    public static float Kelvin (float c){
        float result=0;
        
        result= (float) (c + 273.15);
        
        return result;
    }
}