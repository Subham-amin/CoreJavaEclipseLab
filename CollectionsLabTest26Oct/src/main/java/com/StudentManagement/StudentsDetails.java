package com.StudentManagement;

import java.util.HashMap;
import java.util.Scanner;

public class StudentsDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// creating a hashmap
		HashMap<String, Student> sDetails = new HashMap<>();

		String uniqueID;

		// creating scanner object
		Scanner sc = new Scanner(System.in);

		// creating StudentDetails object
		Student sInfo = new Student();

		sDetails.put("NIT1026", new Student(01, "Subham Amin", "MTECH", 65000, " Payment Done"));
		sDetails.put("NIT1027", new Student(02, "Sweta Das", "MCA", 35000, "Partially Paid"));
		sDetails.put("JISU1010", new Student(03, "Somenath Hazra", "BCA", 0, "Not Paid"));
		sDetails.put("JISU1012", new Student(04, "Sneha Daw", "IT", 35000, "Partially Paid"));
		sDetails.put("GNIT1016", new Student(05, "Sweety Banerjee", "BTECH", 0, "Not Paid"));
		sDetails.put("GNIT1018", new Student(06, "Ayan Mandal", "JAVA", 1500, "Payment Done"));
		sDetails.put("NIT1107", new Student(07, "Sonu Shrama", "SQL", 0, "NOT PAID"));

		System.out.println("_____________________________________");
		System.out.println("------Students Fees Details------");
		System.out.println("_____________________________________");

		System.out.println("Enter The Student UNIQUE ID :");
		uniqueID = sc.next();

		// check : country is present in the map or not
		boolean status = sDetails.containsKey(uniqueID);

		// displaying the information

		if (status) {
			System.out.println("_____________________________________________________________");
			System.out.println("----------------------STUDENT DETAILS------------------------");
			System.out.println("_____________________________________________________________");
			sInfo = sDetails.get(uniqueID);
			System.out.println(sInfo);

		}

		else {
			System.out.println("_____________________________________");
			System.out.println("-------------INVALID INPUT-----------");
			System.out.println("_____________________________________");
		}

		sc.close();

	}

}
