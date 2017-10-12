
package com.company;
		import sun.font.TrueTypeFont;

		import java.util.Random;
		import java.util.Scanner;

public class Main
{

	public static void main(String[] args)
	{
		Scanner Rainfall = new Scanner(System.in);

		String Quit;


		do
		{

			System.out.println("Enter the Length: ");
			double L = Rainfall.nextInt();
			Rainfall.nextLine();

			System.out.println("Enter the wedth: ");
			double W = Rainfall.nextInt();
			Rainfall.nextLine();

			double Calculate = 0;

			{
				Calculate = ((L * W) * 12 * 1);
				Calculate = ((L * W) * 12 * 1) / 231;

			}

			System.out.println("The Result in inche is: " + Calculate);
			System.out.println("The Result cubic inches is: " + Calculate);
			System.out.println("Do you want quit(yes/no)");
			Quit = Rainfall.nextLine();

			if (Quit.equals("yes"))
			{
				System.out.println("Thanks");
                System.exit(0);
			}
		}

		while (Quit.equalsIgnoreCase("yes")||Quit.equalsIgnoreCase("no"));
	}
}
