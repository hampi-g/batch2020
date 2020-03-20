package com.sonata.CollectionEx;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class ProductList {
public static void main(String args[])
{
	ArrayList a1 = new ArrayList();
	//int a=10;
	//a1.add(a);
	a1.add("abc");
	a1.add("xys");
	a1.add("zw");
	System.out.println(a1);
	LinkedList ll = new LinkedList(a1);
	ll.addFirst("jhg");
	System.out.println(ll);
	
	HashSet s1 = new HashSet(ll);
	s1.add("os");
	System.out.println(s1);
	
	TreeSet t1 = new TreeSet(s1);
	t1.add("msd");
	System.out.println(t1);
}
}
