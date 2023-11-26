import java.util.Scanner:
public class L24{
	public static void main(String[] args){
		Scanner s= new Scanner(System.in);
		System.out.println("Enter years");
		float y = s.nextFloat();
		float m =  y * 12;
		float d =  y * 365;
		System.out.println("Months :" + m);
		System.out.println("Days   :" + d);
	}
	
}