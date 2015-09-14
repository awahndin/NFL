import java.util.Scanner;

public class QB {



	public static void main(String[] args) {

		Scanner Input = new Scanner(System.in);
		System.out.println("Enter Number of passing attempts");
		int ATT = Input.nextInt();
		System.out.println("Enter Number of Completions");
		int COMP = Input.nextInt();
		System.out.println("Enter Number of Passing Yards");
		float YDS = Input.nextFloat();
		System.out.println("Enter Number of Touchdown passes");
		int TD = Input.nextInt();
		System.out.println("Enter Number of interceptions");
		int INT = Input.nextInt();
		
		double passer_Rating = calc_Passer_Rating(ATT,COMP,YDS,TD,INT);
		System.out.println("This passers rating is " + passer_Rating);
	}

	public static double calc_Passer_Rating (int ATT, int COMP, float YDS, int TD, int INT){ 	
		double a = ((COMP/ATT)-0.3)*5;
		double b = ((YDS/ATT)-3)*.25;
		double c = ((TD/ATT)*20);
		double d = 2.375-(INT/ATT)*25;

		double Passer_Rating = ((a+b+c+d)/6)*100;
		return Passer_Rating;
		
	}	}
