package com.prutha.university.client;

import java.util.Scanner;

import com.prutha.university.entity.manager.StudentAdmin;

public class Login {

	public static void main(String[] args) {

		start();
	}

	private static void start() {
		System.out.println("Welcome");
		System.out.println("Please enter number to start");
	}
	
	private static void giveOptions(){
		
		System.out.println("1 : Sign up as a student");
		System.out.println("2 : Login in as a student");
		System.out.println("3 : Login in as a faculty");
		System.out.println("4 : Exit");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		
		switch(choice){
			case 1:
				StudentClient.signup();
				break;
			case 2:
				StudentClient.signin();
				break;
			case 3:
				FacultyClient.signin();
				break;
			case 4:
				System.exit(0);
				break;
		    default :
		    	System.out.println("Please enter a valid choice.");
				break;
		}
	}

}
