
import java.util.ArrayList;

public class List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList Food= new ArrayList();
		
		Food.add("Pizza");
		Food.add("Burger");
		Food.add("Nuggets");
		Food.add("Fries");
		Food.add("IceCream");
		
		System.out.println(Food);
		
		Food.remove(0);
		Food.remove(1);
		Food.remove(2);
		
		System.out.println(Food);
		
		
		

	}

}
