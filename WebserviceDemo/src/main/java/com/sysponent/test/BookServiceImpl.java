package com.sysponent.test;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import org.springframework.stereotype.Service;

@Service("bookService")
public class BookServiceImpl implements BookService {

	@GET
	@Produces("text/xml")
	@Path("/book/{id}")
	public Book getBook(@PathParam( "id" ) String id) {
		Book book = new Book();
        book.setAuthor( "Steven Haines" );
        book.setTitle( "Book title = " + id );
        return book;
	}

}