package com.sonata.Lambdaexample;

import java.util.ArrayList;
import java.util.List;

public class BookDAO {

	public List<Book>getBook(){
		List<Book> books = new ArrayList<>();
		books.add(new Book(101,"core java",300));
		books.add(new Book(102,"python",200));
		books.add(new Book(103,"spring",400));
		books.add(new Book(104,"hibernate",100));
		return books;
	}
}
