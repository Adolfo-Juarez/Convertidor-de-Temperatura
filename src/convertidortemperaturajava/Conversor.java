
package convertidortemperaturajava;

/**
 *
 * @author Adolfo Juárez 
 */
public class Conversor {
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
