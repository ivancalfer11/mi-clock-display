
/**
 * Write a description of class NumberDisplay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NumberDisplay
{
    // instance variables - replace the example below with your own
    private int value;
    private int limit;
    

    /**
     * Constructor for objects of class NumberDisplay
     */
    public NumberDisplay(int rollOverLimit)
    {    
        value = 00;
        limit = rollOverLimit;
        
        
        
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void setValue(int valorActual)
    {
        value = valorActual;
    }
    public String getDisplayValue()
    {
      String cadenaADevolver = " "; 
        if(value < 10) 
      {
        cadenaADevolver = "0" + value;
          return cadenaADevolver;
      }
      else 
      {
        cadenaADevolver = ""+ value;
          return cadenaADevolver;
      }
    } 
    public int getValue()
    {
        return value;
    }
    public void increment()
    {
        value = value + 1;
        if(value > limit)
        {
            value = 0;
        }
    }
    public int getLimit()
    {
        return limit;
    }
   }
    
        

