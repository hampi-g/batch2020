package com.sonata.Lambdaexample;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BookServiceAnnon {
	
	public List<Book>getBookinSort(){
		List<Book> books = new BookDAO().getBook();
		Collections.sort(books,new Comparator<Book>() {

			@Override
			public int compare(Book o1, Book o2) {
				return o1.getName().compareTo(o2.getName());
			}
			
		});
		return books;
		
	}
	public static void main(String args[]) {
		System.out.println(new BookServiceAnnon().getBookinSort());
	}

}
