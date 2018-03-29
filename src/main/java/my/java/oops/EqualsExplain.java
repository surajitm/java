package my.java.oops;

/*
 * Basically equals() is used to compare two objects by there content not reference.
 * Basic rules for implementing equals:
 * 1.Reflexive: so x.equals(x) = return true.
 * 2.Symmetric: x.equals(y) = return true.
 * 3.Transitive: x.equals(y) = true and y.equals(z)=true then x.equals(z)=true
 * 4.Consistent
 * 5.Non-null value protection.
 * 
 * 
 */

class Client{
	private int id;
	public Client(int id) {
		this.id=id;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Client other = (Client) obj;
		if (id != other.id)
			return false;
		return true;
	}
}

public class EqualsExplain {
	
	public static void main(String[] args) {
		Client c1=new Client(11);
		Client c2=new Client(11);
		
		System.out.println(c1.equals(c2));
	}
	
}
