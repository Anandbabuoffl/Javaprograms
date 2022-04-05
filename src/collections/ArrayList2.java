
package collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList2 {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(11);
		al.add(12);
		al.add(13);
		al.add(15);
		al.add(14);
		
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);
		Collections.sort(al,Collections.reverseOrder());
		System.out.println(al);
		Collections.shuffle(al);
		System.out.println(al);

	}

}
