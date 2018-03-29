package my.java.output.puzzle;

public class Basic1 {
	public static void main(String[] args) {
		
		Test t=new Test();
		System.out.print(t.x+","+t.y);
	}
	
    public void solution(){
    	
    }
	
}

class Test{
	protected int x,y;
	protected void foo(){}
}

class Test1 extends Test{
	//void foo(){} //can not reduce visibility.
}
