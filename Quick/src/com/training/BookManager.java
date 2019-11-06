package com.training;

import java.util.ArrayList;
import java.util.List;

public class BookManager {
	public List<Book> getAllBooks(){
		
		List<Book>booklist=new ArrayList<>();
		
		booklist.add(new Book(1,"one"));
		return booklist;
	}

}
