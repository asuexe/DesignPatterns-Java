package vivek;
import java.util.Iterator;
import java.util.LinkedList;
public class LinkedList1 {

	public static void main(String[]args) {
		LinkedList<String> L1 = new LinkedList<String>();
		L1.add("vivek");
		L1.add("Naiya");
		Iterator<String> i = L1.iterator();
		while(i.hasNext()){
			System.out.println(i.next());
			
		};
	}
}
