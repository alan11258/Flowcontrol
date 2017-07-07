package tw.alan.myproject.flowcontrol;

public class TestIfEx1 {

	public static void main(String[] args) {
		int degree = 5;
		System.out.println("Now degree: " + degree);
		if(degree >= 30)
		{
			System.out.println("It's Hot!");
			
		}else{
			if(degree<=10)
				System.out.println("It's Cold!");
		}
			System.out.println("keep writing java");
	}

}
