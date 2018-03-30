package my.java.Assignment6;

public class Review {
    private int id;
    private String des;
    private byte rating;
    
    public Review(int id,String des,byte rating){
    	this.id=id;
    	this.des=des;
    	this.rating=rating;
    }
    
    @Override
    public String toString(){
    	return String.format("Id: %d, Des: %s,Rating: %d",id,des,rating);
    }
    
    
}
