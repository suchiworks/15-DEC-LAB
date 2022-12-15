package lab15DecPrep;

import java.util.ArrayList;

public class Bookstore {

ArrayList<Book> bookList = new ArrayList<Book>(); 			
	//1
	public void addBook(Book b) {					
		bookList.add(b);  //adding new book 
	}
	
	//2
	public void searchByTitle(String title) {	//pass the title 
		for (Book b : bookList) {
			if(title.contains(b.getTitle())) {		
				System.out.println(b);
				break;
			}else {
				System.out.println("not found");
				break;
			}
		}
	} 
	
	//3
	public void searchByAuthor(String author) { //pass the author 
		for (Book b : bookList) {
			if(author.contains(b.getAuthor())) {		
				System.out.println(b);
				break;
			}else {
				System.out.println("not found");
				break;
			}
		}
	}
	
	//operation #4
	public void displayAll() {					
		//traversing
		for(Book b : bookList) {
			System.out.println(b);
		}


	}

}
