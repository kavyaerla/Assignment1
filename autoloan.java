package loancal;

import java.util.Scanner;

public class autoloan {

	int Option;

	public void option() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter name");
		String name = in.nextLine();
		System.out.println("Enter age");
		int score = in.nextInt();
		System.out.println("Enter ssn");
		int ssn = in.nextInt();
		System.out.println("Enter req");
		int req = in.nextInt();
		compare(score, name, req);

		in.close();

	}

	public void compare(int score, String name, int req) {
		System.out.println("if you're score is in between 600 - 625 press 1");

		System.out.println("if you're score is in between 626 - 650 press 2");

		System.out.println("if you're score is in between 651 - 675 press 3");

		System.out.println("if you're score is in between 676 - 699 press 4");

		System.out.println("if you're score is in between 700 - 725 press 5");

		System.out.println("if you're score is in between 726 - 750 press 6");

		System.out.println("if you're score is in between 751 - 775 press 7");

		System.out.println("if you're score is in between 776 - 800 press 8");

		Scanner sr = new Scanner(System.in);
		int option = sr.nextInt();

		this.Option = option;

		sr.close();

		switch (option)

		{

		case 1:

			System.out.println("You will get a loan of 12000");

			break;

		case 2:

			System.out.println("You will get a loan of 14000");

			break;

		case 3:

			System.out.println("You will get a loan of 16000");

			break;

		case 4:

			System.out.println("You will get a loan of 18000");

			break;

		case 5:

			System.out.println("You will get a loan of 12000");

			break;

		case 6:

			System.out.println("You will get a loan of 14000");

			break;

		case 7:

			System.out.println("You will get a loan of 16000");

			break;

		case 8:

			System.out.println("You will get a loan of 18000");

			break;

		}

		if (option <= 4) {

			//autoloan ec = new economy();
			economy e = new economy();
			e.regular(option);

		//	((economy) ec).regular(option);

		} else {

			autoloan pr = new premium();

			((premium) pr).luxury(option);

		}

	}

}
