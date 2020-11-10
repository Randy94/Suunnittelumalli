package Cor;

public abstract class Accountant {

	public static final double SmallRaise = 3;
	public static final double MediumRaise = 6;
	public static final double HighRaise = 50;
	
	protected double euro;
    protected Accountant next;
	

    public void setNext(Accountant pr) {
        this.next = pr;
    }

    public void raisePay(double OldPay, double NewPay) {
        double percentage = (NewPay - OldPay) / OldPay * 100;

        if (percentage < euro) {
            handlePayRaise(NewPay);          
        } else {
            if (next != null) {
                cantHandle();
                next.raisePay(OldPay, NewPay);
            }
        }
    }

    abstract protected void handlePayRaise(double newSalary);
    abstract protected void cantHandle();
}

