package same;
import java.util.*;
public class BoxVolume {
	public static void main(String[] args) {
		int count=0;
		double l,h,w;
		HashSet<Box> box=new HashSet<Box>();
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter Number of Boxes");
		count=scan.nextInt();
		for(int i=0;i<count;i++) {
			System.out.println("Enter Length : ");
			l=scan.nextDouble();
			System.out.println("Enter Height : ");
			h=scan.nextDouble();
			System.out.println("Enter Width : ");
			w=scan.nextDouble();
			Box b=new Box(l,h,w);
			box.add(b);
		}
		for(Box b1 : box) {
			System.out.println(b1);
		}
	}

}
class Box{
	double boxLength;
	double boxHeight;
	double boxWidth;
	Box(double l,double h, double w){
		this.boxLength=l;
		this.boxHeight=h;
		this.boxWidth=w;
	}
	public String toString() {
		return "length: "+boxLength+" height: "+boxHeight+" width: "+boxWidth;
	}
	public int hashCode() {
		return (int)(boxLength+boxHeight+boxWidth);
	}
}