package my.java.Assignment5;

import java.math.BigDecimal;

public class RectangleClass {

	double length;
	double width;
	
	public RectangleClass(double length,double width){
		this.length=length;
		this.width=width;
	}
	public BigDecimal getArea(){
		BigDecimal len=new BigDecimal(length);
		BigDecimal wid=new BigDecimal(width);
		return len.multiply(wid).setScale(3,BigDecimal.ROUND_HALF_UP);
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
}
