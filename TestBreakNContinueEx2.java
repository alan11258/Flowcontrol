package tw.alan.myproject.flowcontrol.loop;

public class TestBreakNContinueEx2 {

	public static void main(String[] args) {
		int i = 1;
		while (i<=10){
			if(i == 5){
			break;             //print 1 2 3 4 Finished
//		    continue;          //print 1 2 3 4~無窮迴圈,無法接Finished
		
			}
			System.out.println("i= " + i);
			i++;
		}
		System.out.println("Finished");

	}

}
