package tw.alan.myproject.flowcontrol.loop;

public class TestDiceBreakContinueEx2 {

	public static void main(String[] args) {
		int YourLuckyNumber = 5;
		int count = 0;
		
		while(true){
		int RicherNumber = (int)(Math.random()*6)+1;
		System.out.println("RicherNumber= " + RicherNumber);
		
		if (YourLuckyNumber == RicherNumber){
			count++;
				if(count==2){
				System.out.println("You are a richer!!!");
				break;
				}
		}else{
			System.out.println("Carry on. You may dream come true someday.");
		}
		}

	}

}
