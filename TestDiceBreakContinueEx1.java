package tw.alan.myproject.flowcontrol.loop;

public class TestDiceBreakContinueEx1 {

	public static void main(String[] args) {
		int YourLuckyNumber = 5;
		
		while(true){
		int RicherNumber = (int)(Math.random()*6)+1;
		System.out.println("RicherNumber= " + RicherNumber);
		
		if (YourLuckyNumber == RicherNumber){
			System.out.println("You are a richer!!!");
			break;
		}else{
			System.out.println("Carry on. You may dream come true someday.");
		}
		}

	}

}
