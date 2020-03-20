package com.sonata.CollectionEx;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ProductCls {
	
	public static void main(String args[])
	{
		List<Product> p1 = new LinkedList<Product>();
		
		p1.add(new Product(123,"TV",345));
		p1.add(new Product(123,"mobile",466));
		p1.add(new Product(123,"laptop",375));
		
		for(Product p2:p1) {
			System.out.println(p2.pId+" "+p2.pName+" "+p2.pPrice);
		}
		
		LinkedList<String> l2 = new LinkedList<String>();
		l2.add("hampi");
		l2.add("bhagya");
		l2.add("sonu");
		l2.add("neelu");
		l2.add("maggi");
		l2.remove("sonu");
		System.out.println(l2);
		
		Iterator<String> i1 = l2.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		
		
		
	}

}
