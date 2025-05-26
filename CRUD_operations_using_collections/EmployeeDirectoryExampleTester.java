package com.CRUD_operations_using_collections;

public class EmployeeDirectoryExampleTester {

	public static void main(String[] args) {
		Employe a1 = new Employe("Raj", "SD", 50000);
		Employe a2 = new Employe("Sam", "SD", 60000);
		Employe a3 = new Employe("Amit", "SD", 70000);
		
		Directory d= new Directory();
		
		System.out.println("......employee details......");
		System.out.println();

		d.add(a1);
		d.add(a2);
		d.add(a3);
		
		d.display();
		System.out.println();
		
		System.out.println(".........After Update employee details......");
		System.out.println();
		d.update(2);
		d.display();
		
		System.out.println();
		System.out.println(".......After Delete employee details......");
		System.out.println();
        d.delete(a3);
		d.display();
	}

}
