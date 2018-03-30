package my.java.Assignment6;

import java.util.ArrayList;

//Book has many reviews

public class Book {
    private int id;
    private String name;
    private String authorName;
    private ArrayList<Review> reviews ;
    
    public Book(int id,String name,String authorName){
    	this.name=name;
    	this.id=id;
    	this.authorName=authorName;
    	reviews=new ArrayList<>();
    }
    
    @Override
    public String toString(){
    	return String.format("Id:%d,Name:%s,Author Name:%s \n",id,name,authorName);
    }
    
	public void addReview(Review review){
		reviews.add(review);
	}
    
    public void showReview(){
    	for(Review review:reviews){
    		System.out.println(review);
    	}
    }
}
