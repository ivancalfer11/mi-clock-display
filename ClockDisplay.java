
/**
 * Write a description of class ClockDisplay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ClockDisplay
{
    // instance variables - replace the example below with your own
    private NumberDisplay horas;
    private NumberDisplay min;
    private String horaActual;

    /**
     * Constructor for objects of class ClockDisplay
     */
    public ClockDisplay()
    {
        horas = new NumberDisplay(23);
        min = new NumberDisplay(59);
    }
    public ClockDisplay(int valorHoras, int valorMin)
    {
        horas = new NumberDisplay(23);
        min = new NumberDisplay(59);
        horas.setValue(valorHoras);
        min.setValue(valorMin);
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void setTime(int valorActualHoras, int valorActualMin)
    {
        horas.setValue(valorActualHoras);
        min.setValue(valorActualMin);
    }
    public String getTime()
    {
        String cadenaADevolver = " ";
        cadenaADevolver = horas.getDisplayValue() + ":" + min.getDisplayValue();
        
        
        
        return cadenaADevolver;
    }
    public void timeTick()
    {
         min.increment();
         if(min.getValue() == 0)
         {
             horas.increment();
             min.setValue(0);
         }
    }
}
