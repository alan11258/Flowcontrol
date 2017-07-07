package tw.alan.myproject.flowcontrol.loop;

public class TestBreakNContinueEx1 {

	public static void main(String[] args) {
		for(int i = 1; i<=10; i++){
			if(i == 5){
//			break;          //print 1 2 3 4
			continue;       //print 1 2 3 4   6 7 8 9 10
			}
			System.out.println("i= " + i);
		}
		System.out.println("Finished");

	}

}
