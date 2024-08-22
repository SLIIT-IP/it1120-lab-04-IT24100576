import java.util.Scanner;
public class IT24100576Lab4Q3 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a Number:");
		int checkNum = input.nextInt();
		String result = (checkNum > 0) ? "This Number is Positive":
						(checkNum < 0) ? "This Number is Negative":
						"this is Zero!!";
		System.out.println(result);
	}
}