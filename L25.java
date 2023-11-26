import java.util.Scanner:
public class L25{
	public static void main(String[] args){
		Scanner s= new Scanner(System.in);
		System.out.println("Enter Celcius temperature");
		float c = s.nextFloat();
		float f =  (c * 9/5)+32;
	
		System.out.println("Farenheight Temperature : " + f);
		
	}
	
}