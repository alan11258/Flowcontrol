package tw.alan.myproject.flowcontrol;

public class TestLeapYearEx1 {

	public static void main(String[] args) {
		
		int year = (int)(Math.random()*30+1990);
		
		if((year%4==0 && year%100!=0) || (year%400==0)){
			System.out.println(year + " it's leap year.");
			}else
			System.out.println(year + " it's common year.");
			}

}
