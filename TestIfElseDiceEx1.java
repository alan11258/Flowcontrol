package tw.alan.myproject.flowcontrol;

public class TestIfElseDiceEx1 {

	public static void main(String[] args) {
		int dicenumber = (int)(Math.random()*6)+1;
		System.out.println("dicenumber:" + dicenumber);
		int Lucknumber = 3;
		
		if (Lucknumber==dicenumber){
			System.out.println("That's Lucky!!");
		}else{
			System.out.println("Try Again!!");
		}
		{
			System.out.println("Finshied");
		}
	}

}
