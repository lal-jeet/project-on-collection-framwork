package com.CRUD_operations_using_collections;

import java.util.ArrayList;

public class Directory {

	ArrayList<Employe> l =  new ArrayList<>();
	
	public void add(Employe obj) {
      
		l.add(obj);
	}
	
	public void display()
	{
		for(Employe x:l)
		{
			System.out.println(x);
		}
	}
	
	public void update(int index) {
	      
		if(l.size()<index) {
			System.out.println("invalid");
		}
		else {
			Employe employe = l.get(index);
			employe.setPosition("devloper");
			employe.setName("sonu");
			employe.setSalary(100500);
		}
	}
	
public void delete(Employe obj) {
	      
		for(int i=0;i<l.size();i++)
		{
			if(l.get(i).equals(obj))
			{
				l.remove(i);
			}
		}
	}
	
}
