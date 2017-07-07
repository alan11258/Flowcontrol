package tw.alan.myproject.flowcontrol.loop;

public class TestBreakNContinueLabelEx1 {

	public static void main(String[] args) {
		action:
			for (int i = 1; i <= 3; i++){
				for (int j = 1; j <=5 ; j++){
					if (i==2 && j==3){
//					break action;       //到i=2,j=3即停止
					continue action;    //到i=2,j=3不輸出,改找離action最近的迴圈繼續
					}
					System.out.printf("i=%d j=%d\n", i, j);					
				}
			}
			

	}

}
