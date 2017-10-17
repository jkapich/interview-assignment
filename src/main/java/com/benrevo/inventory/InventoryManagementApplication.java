package com.benrevo.inventory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class InventoryManagementApplication {

	public static void main(String[] args) {
		System.out.println("HELLO");
		SpringApplication.run(InventoryManagementApplication.class, args);

	}

	private void recieveInput() {
		int page = 0;
		Scanner scanner = new Scanner(System.in);
		String temp="";

		System.out.println("(0) = login, (1) = guest, (2) = new account");

		do {
			temp = scanner.nextLine();
		} while(temp=="");

	}



	
}
