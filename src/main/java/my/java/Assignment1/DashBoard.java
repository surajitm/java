package my.java.Assignment1;

import java.util.ArrayList;


interface Board{
	void addPlayer(Player player);
	void removePlayer(Player player);
	void showPlayer(Player player);
	void showPlayerDashBoard();
}

public class DashBoard implements Board {

	private Player player;
	private ArrayList<Player> list;
	private static final int finalOver=50;
	private static int totalBallPlayed=0;
	
	public DashBoard(){
		list=new ArrayList<Player>();
	}
	
	public void addCricketer(Cricketer player){
	     list.add(player);	
	}
	
	@Override
	public void addPlayer(Player player) {
		list.add(player);
	}

	@Override
	public void removePlayer(Player p) {
		list.remove(p);
	}

	@Override
	public void showPlayer(Player player) {
		Cricketer cricketer=(Cricketer)player;
		System.out.println(cricketer.getName()+"\t"+cricketer.getScore()+"\t"+cricketer.getBallPlayed()+"\t\t"+cricketer.getTeam());
	}

	@Override
	public void showPlayerDashBoard() {
		System.out.println("NAME"+"\t"+"SCORE"+"\t"+"BALL PLAYED"+"\t"+"TEAM");
		System.out.println("---------------------------------------------------------");

		for(Player player:list){
			showPlayer(player);
		}
	}
}
