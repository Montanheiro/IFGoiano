import java.rmi.Naming; 
   
public class CalculatorServer  
{ 
    CalculatorServer() 
    { 
        try
        { 
            Calcutator c = new CalculatorImple(); 
            Naming.rebind("RMI://127.0.0.1:1020/CalculatorService", c); 
        }  
        catch (Exception e)  
        { 
            e.printStackTrace(); 
        } 
    } 
    public static void main(String[] args)  
    { 
        new CalculatorServer(); 
    } 
}   