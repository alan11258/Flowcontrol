package tw.alan.myproject.flowcontrol.loop;

public class TestWhileLoopEx2_1 {

	public static void main(String[] args) {
		int sum = 0;
		int i = 1;
		while (i<= 10){
			sum = sum + i;  //<->也可以寫成sum+=i
			System.out.println("i= " + i + ", sum= " + sum);
			i++;
					
		}	
		System.out.println("total= " + sum);
	}

}
