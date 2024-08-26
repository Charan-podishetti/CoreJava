package com.evergent.corejava.charan.application2;

import java.io.IOException;
import java.util.Scanner;

public class EventManagementSystem_CHARAN {

	enum module1 {
		O, P, R, C, E
	};

	enum subModule1 {
		F, S, M
	};

	enum subModule2 {
		T, P, M
	};

	enum subModule3 {
		I, S, M
	};

	enum subModule4 {
		D, Q, M
	};

	enum menuCode {
		A, B, C, D
	};

	enum shirtSize {
		S, M, L, XL
	};

	enum shirtStyle {
		INDIA, USA, UK, JAPAN
	};

	enum designCode {
		PRINT, EMBROIDERY
	};

	enum colorCode {
		RED, BLUE, BROWN, BLACK, WHITE
	};

	static int menuItemCost;
	static int amount;
	static int numberOf_shirts;
	static int amountDisc;
	static int additionalItemCost;
	static String selectedDesign;
	static String selectedSize;
	static String selectedStyle;
	static String selectedColor;

	public static void main(String[] args) throws IOException {
		String module = null;

		Scanner br = new Scanner(System.in);

		System.out.println("\n\t\t \t\t Welcome To SHIRT MANAGEMENT SYSTEM");

		while (true) {
			System.out.println("======================");
			System.out.println(" SMS Main Menu");
			System.out.println("======================");
			System.out.println("O-Order Module");
			System.out.println("P-Payment Module");
			System.out.println("R-Report Module");
			System.out.println("C-Customization Module");
			System.out.println("E-Quit Module");
			System.out.println("======================");
			System.out.println("Enter your Module code (O,P,R,C,E) : ");

			module = br.nextLine();
			System.out.println("You entered module is  : ");

			switch (module1.valueOf(module)) {

			case O:
				System.out.println(" Order Module");
				System.out.println("======================");
				System.out.println("F-to place orders for shirts");
				System.out.println("S-to place for other services");
				System.out.println("M-Return to Main Menu");
				System.out.println("======================");
				System.out.println("Enter your Module code (F,S,M) : ");

				module = br.nextLine();
				switch (subModule1.valueOf(module)) {
				case F:
					System.out.println("Menu \t Description  \t Charge per head ");
					System.out.println("===============================================");
					System.out.println("A \t Formal Ware  \t\t\t RM400.00");
					System.out.println("");
					System.out.println("B \t Casual Ware \t\t\t RM500.00");
					System.out.println("");
					System.out.println("C \t Traditional Ware \t\t RM600.00");
					System.out.println("");
					System.out.println("D \t Party Ware \t\t RM700.00");
					System.out.println("===============================================");
					System.out.println("Enter your Menu code (A,B,C,D) : ");

					module = br.nextLine();
					switch (menuCode.valueOf(module)) {
					case A:
						menuItemCost = 400;
						break;
					case B:
						menuItemCost = 500;
						break;
					case C:
						menuItemCost = 600;
					case D:
						menuItemCost = 700;
					default:
						break;
					}

					System.out.println("Enter the number of shirts");

					numberOf_shirts = Integer.parseInt(br.nextLine());
					System.out.println("you selected no of shirts are " + numberOf_shirts);
					// FOR OPTING SHIRT SIZE.
					System.out.println("Enter your shirt size {S, M, L, XL}: ");
					module = br.nextLine();
					selectedSize = shirtSize.valueOf(module).name();
					System.out.println("Your shirt size selected as : " + selectedSize);
					// FOR OPTING SHIRT STYLE.
					System.out.println("Enter your shirt style (INDIA, USA, UK, JAPAN): ");
					module = br.nextLine();
					selectedStyle = shirtStyle.valueOf(module).name();
					System.out.println("Your shirt Style Selected as: " + selectedStyle);

					amount = menuItemCost * numberOf_shirts;

					System.out.println("Amount for ordered shirts before discount is Rs" + amount);
					if (numberOf_shirts >= 1 && numberOf_shirts <= 25)
						amountDisc = (int) (amount - (amount * 0.00));
					if (numberOf_shirts >= 26 && numberOf_shirts <= 50)
						amountDisc = (int) (amount - (amount * 0.03));
					else if (numberOf_shirts >= 51 && numberOf_shirts <= 100)
						amountDisc = (int) ((amount - numberOf_shirts * 0.05));
					else if (numberOf_shirts >= 101 && numberOf_shirts <= 200)
						amountDisc = (int) ((amount - numberOf_shirts * 0.08));
					else if (numberOf_shirts >= 251)
						amountDisc = (int) ((amount - numberOf_shirts * 0.10));

					System.out.println(
							"Amount for ordered shirts after Discount for selected guests is  Rs" + amountDisc);

					break;
				case S:

					System.out.println("Item \t Description  \t Charge per Unit ");
					System.out.println("========================================================================");
					System.out.println("1 \t Printed Shirts \t   RM40.00 per shirt");
					System.out.println("");
					System.out.println("2 \t Gifting Shirts \t RM20.00 per shirt");
					System.out.println("");
					System.out.println("3 \t Expedited shipping \t RM30.00 per shirt");
					System.out.println("========================================================================");
					System.out.println("Enter your Menu code (1,2,3) : ");

					module = br.nextLine();

					int i = Integer.parseInt(module);
					switch (i) {

					case 1:
						additionalItemCost = 40;
						break;
					case 2:
						additionalItemCost = 20;
						break;
					case 3:
						additionalItemCost = 30;
						break;
					default:
						break;
					}

					System.out.println("Your Additional Cost : Rs " + additionalItemCost);

					break;
				default:
					break;
				}
				break;

			case P:
				System.out.println(" Payment Module");
				System.out.println("======================");
				System.out.println("T-to display total amount to be paid");
				System.out.println("P-to make payment");
				System.out.println("M-Return to Main Menu");
				System.out.println("======================");
				System.out.println("Enter your Module code (T,P,M) : ");

				module = br.nextLine();
				switch (subModule2.valueOf(module)) {

				case T:
					System.out.println("Total Amount to be Paid : Rs" + (amount + additionalItemCost));

					break;
				case P:
					System.out.println("To Make Payment : Rs" + (amountDisc + additionalItemCost));
					break;
				default:
					break;
				}
				break;

			case R:

				System.out.println(" Payment Module");
				System.out.println("======================");
				System.out.println("I-to dispaly invoice for order mode");
				System.out.println("S-to display the summary of orders and payments made");
				System.out.println("M-Return to Main Menu");
				System.out.println("======================");
				System.out.println("Enter your Module code (I,S,M) : ");

				module = br.nextLine();
				switch (subModule3.valueOf(module)) {

				case I:
					System.out.println("Invoice Display");
					System.out.println("==================");
					System.out.println("Ordered Id : " + (Math.ceil(Math.random())));
					System.out.println("you selected no of shirts are " + numberOf_shirts);
					System.out.println("You selected shirt size as " + selectedSize);
					System.out.println("You selected shirt style as " + selectedStyle);
					System.out.println("To Make Payment : Rs" + (amountDisc + additionalItemCost));

					break;
				case S:
					System.out.println("Summary Of Order");
					System.out.println("======================");
					System.out.println("you selected shirts cost Rs" + amount);
					System.out.println("you selected no of shirts are " + numberOf_shirts);
					System.out.println("You selected shirt size as " + selectedSize);
					System.out.println("You selected shirt style as " + selectedStyle);
					System.out
							.println("Amount for ordered shirts after Discount for selected items is  Rs" + amountDisc);
					System.out.println("Your Additional Cost : Rs " + additionalItemCost);
					System.out.println("\n");
					System.out.println("Total Amount to be Paid : Rs" + (amount + additionalItemCost));
					System.out.println("To Make Payment : Rs" + (amountDisc + additionalItemCost));

					break;

				default:
					break;
				}
				break;

			case C:
				System.out.println("Customization Module");
				System.out.println("======================");
				System.out.println("D-To choose design options");
				System.out.println("Q-To choose color options");
				System.out.println("M-Return to Main Menu");
				System.out.println("=======================");
				System.out.println("Enter your Module code (D, Q, M) : ");

				module = br.nextLine();
				// System.out.println("You Entered Module Code as : ");

				switch (subModule4.valueOf(module)) {

				case D:
					System.out.println(" Design Code \t Description \t Additional Charge");
					System.out.println("======================");
					System.out.println("PRINT \t Printed Design \t RM30.00");
					System.out.println("EMBROIDERY \t Embroidery \t RM50.00");
					System.out.println("======================");
					System.out.println("Enter your Design code (PRINT, EMBROIDERY): ");

					module = br.nextLine();
					System.out.println("You Entered Design code as: ");
					selectedDesign = designCode.valueOf(module).name();
					if (selectedDesign.equals("PRINT")) {
						additionalItemCost += 30;
					} else if (selectedDesign.equals("EMBROIDERY")) {
						additionalItemCost += 50;
					}
					System.out.println("You selected design: " + selectedDesign);
					System.out.println("Your additional cost: RM " + additionalItemCost);
					break;

				case Q:
					System.out.println("Color Code \t Description \t Additional Charge");
					System.out.println("======================");
					System.out.println("RED \t Red Color Shirt \t RM50.00");
					System.out.println("BLUE \t Blue Color Shirt \t RM60.00");
					System.out.println("BROWN \t Brown Color Shirt \t RM70.00");
					System.out.println("BLACK \t Black Color Shirt \t RM60.00");
					System.out.println("WHITE \t White Color Shirt \t RM90.00");
					System.out.println("======================");
					System.out.println("Enter your color code (RED, BLUE, BROWN, BLACK, WHITE): ");

					module = br.nextLine();
					System.out.println("You selected color code as: " + module);
					selectedColor = colorCode.valueOf(module).name();
					if (selectedColor.equals("RED")) {
						additionalItemCost += 50;
					} else if (selectedColor.equals("BLUE")) {
						additionalItemCost += 60;
					} else if (selectedColor.equals("BROWN")) {
						additionalItemCost += 70;
					} else if (selectedColor.equals("BLACK")) {
						additionalItemCost += 60;
					} else if (selectedColor.equals("WHITE")) {
						additionalItemCost += 90;
					}

					System.out.println("You Selected color: " + selectedColor);
					System.out.println("Your additional cost: RM " + additionalItemCost);

					break;
				default:
					break;

				}
				break;

			case E:
				System.out.println("Quit Module");
				System.exit(0);
				br.close();
				break;

			}

		}
	}

}
