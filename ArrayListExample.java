
import java.util.List;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	List<Integer> list = new ArrayList<Integer>();
	
	list.add(10);
	list.add(20);
	list.add(30);
	list.add(40);
	list.add(50);

	for(Integer It:list) {
		System.out.println(It);
	}
  }
}
