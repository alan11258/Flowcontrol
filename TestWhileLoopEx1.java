package tw.alan.myproject.flowcontrol.loop;

public class TestWhileLoopEx1 {

	public static void main(String[] args) {
		int i =1;
		while(i<=1000000){
			System.out.println("Hello " + i);
			i++;
		}
		
		System.out.println("Finished.");

	}

}
