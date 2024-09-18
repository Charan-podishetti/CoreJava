package com.evergent.corejava.charan.caseStudy1;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		SupportTicketSystem obj=new SupportTicketSystem();
		
		while(true) {
			System.out.println("\n WELCOME TO CUSTOMER SUPPORT TICKETING SYSTEM");
			System.out.println("1. Add ticket");
			System.out.println("2. add ticket to front");
			System.out.println("3. add ticket to end");
			System.out.println("4. offer ticket to front");
			System.out.println("5. offer ticket to end");
			System.out.println("6. process next ticket");
			System.out.println("7. process first ticket");
			System.out.println("8. process last ticket");
			System.out.println("9. peek next ticket");
			System.out.println("10. peek front ticket");
			System.out.println("11. peek end ticket");
			System.out.println("12. remove ticket");
			System.out.println("13. remove first ticket");
			System.out.println("14. remove last ticket");
			System.out.println("15. display all tickets");
			System.out.println("16. Exit");
			
			System.out.println();
			System.out.println("Choose an option: ");
			int select = sc.nextInt();
			sc.nextLine();
			switch(select) {
			case 1:
				System.out.println("Enter ticket discription: ");
				String ticket=sc.nextLine();
				obj.addTickets(ticket);
				break;
				
			case 2:
				System.out.println("Enter the ticket discription: ");
				String FirstTicket=sc.nextLine();
				sc.nextLine();
				obj.addTicketsFirst(FirstTicket);
				break;
			case 3:
				System.out.println("Enter the ticket discription: ");
				String LastTicket=sc.nextLine();
				obj.addTicketsLast(LastTicket);
				break;
			case 4:
				System.out.println("Enter the ticket discription: ");
				String offerFirstTicket=sc.nextLine();
				obj.offerTicketFirst(offerFirstTicket);
				break;
			case 5:
				System.out.println("Enter the ticket discription: ");
				String OfferLastTicket=sc.nextLine();
				obj.offerTicketLast(OfferLastTicket);
				break;
			case 6:
				obj.processNextTicket();
				break;
			case 7:
				obj.pollFirstTicket();
				break;
			case 8:
				obj.pollLastTicket();
				break;
			case 9:
				obj.peekNextTicket();
				break;
			case 10:
				obj.peekFirstTicket();
				break;
			case 11:
				obj.peekLastTicket();
				break;
			case 12:
				obj.removeTicket();
				break;
			case 13:
				obj.removeFirstTicket();
				break;
			case 14:
				obj.removeLastTicket();
				break;
			case 15:
				obj.displayQueue();
				break;
			case 16:
				System.out.println("Exiting the system....");
				sc.close();
				break;
				
			default:
				System.out.println("Invalid selection. Please try again.");
			}
		}
		
	}

}
