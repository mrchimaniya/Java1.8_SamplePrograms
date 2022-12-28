package com.divergentsl.predefined.consumer;

import java.util.function.Consumer;

class Movie{
	String name;
	String result;
	
	public Movie(String name, String result) {
		super();
		this.name = name;
		this.result = result;
	}
	@Override
	public String toString() {
		return "Movie [name=" + name + ", result=" + result + "]";
	}
	
	
	
	
}

public class ConsumerChainingWith_andThen {
  public static void main(String[] args) {
	 Consumer<Movie> notification= movie-> System.out.println(movie.name+" Movie Is Going To Start");
	 Consumer<Movie> result= movie-> System.out.println(movie.name+" Movie Is "+movie.result);
	 Consumer<Movie> storeData= movie-> System.out.println("Viewers Of "+movie.name+" Is Stored In DataBase");
	 
	 Movie movie1=new Movie("SPIDERMAN","HIT");
	 notification.andThen(result).andThen(storeData).accept(movie1);
	 
	 //revert the result
	 Movie movie2=new Movie("DABANG","FLOP");
     result.andThen(notification).andThen(storeData).accept(movie2);
	 
  }
}
