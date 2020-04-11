package com.fabioqmarsiaj.thrillio.managers;

import com.fabioqmarsiaj.thrillio.entities.Book;
import com.fabioqmarsiaj.thrillio.entities.Movie;
import com.fabioqmarsiaj.thrillio.entities.WebLink;

public class BookmarkManager {
	
private static BookmarkManager instance;
	
	private BookmarkManager() {}
	
	synchronized public static BookmarkManager getInstance() {
		if(instance == null) {
			instance = new BookmarkManager();
		}
		return instance;
	}
	
	public Movie createMovie(long id, String title, String profileUrl, int releaseYear, String[] cast, 
							String[] directors, String genre, double imdbRating) {
		
		Movie movie = new Movie();
		movie.setTitle(title);
		movie.setProfileUrl(profileUrl);
		movie.setReleaseYear(releaseYear);
		movie.setCast(cast);
		movie.setDirectors(directors);
		movie.setGenre(genre);
		movie.setImdbRating(imdbRating);
		
		return movie;
	}
	
	public Book createBook(int publicationYear, String publisher, String[] authors, 
									String genre, double amazonRating) {
		
		Book book = new Book();
		book.setPublicationYear(publicationYear);
		book.setPublisher(publisher);
		book.setAuthors(authors);
		book.setGenre(genre);
		book.setAmazonRating(amazonRating);
		
		return book;
		
	}
	
	public WebLink createWebLink(String url, String host) {
		
		WebLink webLink = new WebLink();
		webLink.setUrl(url);
		webLink.setHost(host);
		
		return webLink;
		
	}

}
