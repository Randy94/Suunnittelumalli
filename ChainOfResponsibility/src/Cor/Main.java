package Cor;

public class Main {

	public static void main(String[] args) {
		
		
		Accountant chain = createChain();
        
		chain.raisePay(100, 102);
        chain.raisePay(100, 104);
        chain.raisePay(100, 110);
    }
    
    private static Accountant createChain() {
    	Accountant accountant = new Supervisor(Accountant.SmallRaise);
    	Accountant payraiser1 = new Boss(Accountant.MediumRaise);
    	accountant.setNext(payraiser1);
        Accountant payraiser2 = new Cto(Accountant.HighRaise);
        payraiser1.setNext(payraiser2);
        return accountant;
    }

	}


