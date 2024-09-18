package com.evergent.corejava.charan.caseStudy1;
import java.util.ArrayDeque;
import java.util.Scanner;
public class SupportTicketSystem {
	ArrayDeque<String> ad=new ArrayDeque<>();
	
	public void addTickets(String ticket) {
		ad.add(ticket);
		System.out.println("Ticket added: "+ticket);
	}
	
	public void addTicketsFirst(String ticket)
	{
		ad.addFirst(ticket);
		System.out.println("The ticket was added front: "+ticket);
	}
	
	public void addTicketsLast(String ticket) {
		ad.addLast(ticket);
		System.out.println("The ticket was added End: "+ticket);
	}
	
	public void offerTicketFirst(String ticket) {
		boolean added = ad.offerFirst(ticket);
		if(added) {
			System.out.println("Ticket offered to the front: "+ticket);
		}
		else {
			System.out.println("Failed to offer ticket at the front.");
		}
	}
	
	public void offerTicketLast(String ticket) {
		boolean added = ad.offerLast(ticket);
		if(added) {
			System.out.println("Ticket offered to the last: "+ticket);
		}
		else {
			System.out.println("Failed to offer ticket at the last.");
		}
	}
	
	
	public void processNextTicket() {
		String ticket=ad.poll();
		if(ticket != null) {
			System.out.println("the processed ticket is : " + ticket);
		}
		else {
			System.out.println("There was no tickets to process");
		}
	}
	
	public void pollFirstTicket() {
		String ticket=ad.pollFirst();
		if(ticket != null) {
			System.out.println("processing ticket: "+ticket);
		}
		else {
			System.out.println("no ticket to process");
		}
	}
	
	public void pollLastTicket() {
		String ticket = ad.pollLast();
		if(ticket != null) {
			System.out.println("processing ticket: "+ticket);
		}
		else{
			System.out.println("no ticket to process");
		}
	}
	
	public void removeTicket() {
		try {
			String removeTicket = ad.remove();
			System.out.println("removed first ticket: "+removeTicket);
		}
		catch(Exception e) {
			System.out.println("No tickets at the front to remove.");
		}
	}
	
	public void removeFirstTicket() {
		try {
			String removeTicket = ad.removeFirst();
			System.out.println("removed first ticket: "+removeTicket);
		}
		catch(Exception e) {
			System.out.println("No tickets at the front to remove.");
		}
	}
	
	public void removeLastTicket() {
		try {
			String removeTicket = ad.removeLast();
			System.out.println("removed last ticket: "+removeTicket);
		}
		catch(Exception e) {
			System.out.println("No tickets at the last to remove.");
		}
	}
	
	public void peekNextTicket() {
	
		String ticket=ad.peek();
		if(ticket != null) {
			System.out.println("the next peek ticket is: " + ticket);
		}
		else {
			System.out.println("There was no tickets");
		}
	}
	
	public void peekFirstTicket(){
		String peekTicket = ad.peekFirst();
		if(peekTicket != null) {
			System.out.println("Removed first element: "+peekTicket);
		}
		else {
			System.out.println("No tickets at the front to remove");
		}
	}
	
	public void peekLastTicket(){
		String peekTicket = ad.peekLast();
		if(peekTicket != null) {
			System.out.println("Removed last element: "+peekTicket);
		}
		else {
			System.out.println("No tickets at the end to remove");
		}
	}
	
	public void displayQueue() {
		System.out.println("current tickets in the queue");
		for(String s:ad) {
			System.out.println(s);
		}
	}
}
