package my.java.Assignment1;

public class MainDashBoard {

	public static void main(String args[]){
		DashBoard dash=new DashBoard();
		Cricketer virat=new Cricketer("Virat","India");
		virat.hitSingle(3);
		virat.hit6();
		virat.hit4();
		virat.hit6();
		dash.addPlayer(virat);
		
		Cricketer rohit=new Cricketer("Rohit","india");
		rohit.hitSingle(2);
		rohit.hit4();
		rohit.hit4();
		dash.addPlayer(rohit);
		dash.showPlayerDashBoard();
	}
	
}
