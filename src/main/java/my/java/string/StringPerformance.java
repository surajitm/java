package my.java.string;

public class StringPerformance {

	/*
	 * 1)Every time we use concatenation operator inside the loop, that will a huge number of object
	 * which could leads to a performance issue.
	 * To solve that problem we can use StringBuffer or StringBuilder.
	 * 
	 * 2)StringBuffer and String both are thread safe.StringBuffer is thread safe because it is implemented by the 
	 * synchronized keyword.
	 *
	 *  
	 *  
	 */
	
	
	public static void concatOp(){
		String s1="a";
		String s2="b";
		for(int i=0;i<1000000;i++){
			s1=s1+s2;
		}
		System.out.println("Done");
	}
	
	public static void concatNM(){
		StringBuffer s1=new StringBuffer("a");
		String s2="b";
		for(int i=0;i<10000;i++){
			s1=s1.append(s2);
		}
		System.out.println("Done:"+s1.toString());
	}
	
	public static void main(String[] args) {
		//concatOp();
		concatNM();
	}
	
}
