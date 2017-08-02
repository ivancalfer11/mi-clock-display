
/**
 * Write a description of class NumberDisplay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NumberDisplay
{
    // instance variables - replace the example below with your own
    private int horas;
    private int min;
    private int limitHoras;
    private int limitMin;

    /**
     * Constructor for objects of class NumberDisplay
     */
    public NumberDisplay(int limitHoras, int limitMin)
    {    
        if(horas > limitHoras){
           horas= 00; 
        }
        if(min > limitMin){
            min = 00;
        }
        
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void setValue(int valorHoras, int valorMin)
    {
        // put your code here
        horas = valorHoras;
        min = valorMin;
        
    }
    public String getDisplayValue()
    {
        String cadenaADevolver = " ";
        cadenaADevolver = horas + " : " + min;
        return cadenaADevolver;
    }
    public void increment()
    {
        min = min + 1;
        if (min > limitMin)
        {
            min = 00;
            horas = horas + 1;
            if(horas > limitHoras)
            {
                horas = 00;
            }
        }
    }
        
}
