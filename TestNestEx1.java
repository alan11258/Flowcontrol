package tw.alan.myproject.flowcontrol;

public class TestNestEx1 {

	public static void main(String[] args) {
		int value = 65;
		
		if(value>=0){
			System.out.println(value + " is postive.");
			
			if(value%2==0){
				System.out.println(value + " is even.");
			}else{
				System.out.println(value + " is odd.");
			}
			
		}else{
			System.out.println(value + " is negative.");
			
			if(value%2==0){
				System.out.println(value + " is even.");
			}else{
				System.out.println(value + " is odd.");
			}
		}
	
	}

}
