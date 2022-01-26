package Abstraction;

public class SBI extends AbstractRBI {
	
    protected double sbiSimpleInterest(double p, double y)
    {
    	return countSI(p, y);
    }
    static double oldAmt=0;
    public double Deposite(double newAmt)
    {
    	return oldAmt += newAmt;
    }
    public double Widrawal(double AmountToWidrawal)
    {
    	return oldAmt -= AmountToWidrawal;
    }
}
