package my.java.project1;

/*
 * Cricketer {name,age,team,score,ballPalyed,getSignle(int howMany),hitFour(),hitSix(),getBallPlayed()}
 */

interface Player{
	String getName();
	String getTeam();
	int getScore();
	void setOutOfGame();
	
}


public class Cricketer implements Player{
     private String name;
     private String team;
     private  int score;
     private int ballPlayed;
     private boolean isPlaying=true;
     
     
     
//     public static void main(String args[]){
//    	 Cricketer Virat=new Cricketer("Virat","India");
//    	 Virat.hitSingle(2);
//    	 Virat.hit6();
//    	 Virat.hit4();
//    	 Virat.hit6();
//    	 
//    	 System.out.println("Run by virat::"+Virat.getScore());
//    	 System.out.println("Ball played by Virat::"+Virat.getBallPlayed());
//    	 
//     }
     
     public Cricketer(String name,String team){
    	 if(isPlaying){
    		 this.name=name;
    		 this.team=team;
    		 this.score=0;
    		 this.ballPlayed=0;
    	 }else{
    		 System.out.println("Player is already out!");
    	 }
    	
     }
     
     @Override
     public int  getScore(){
    	 return this.score;
     }
     
     public void hitSingle(int i){
    	 setBallPlayed();
    	 this.score+=i;
     }
     
     public void hit4(){
    	 setBallPlayed();
    	 this.score+=4;
     }
     
     public void hit6(){
    	 setBallPlayed();
    	 this.score+=6;
     }
     
     public void setBallPlayed(){
    	 this.ballPlayed+=1;
     }
     
     public int getBallPlayed(){
    	 return this.ballPlayed;
     }

	@Override
	public void setOutOfGame() {
		this.isPlaying=false;
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public String getTeam() {
		return this.team;
	}
}
