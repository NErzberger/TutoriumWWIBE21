package programmierungI.veranstaltung_5.uebungen;

import java.util.ArrayList;

public class Uebung2 {

	public static void main(String[] args) {
		
//		System.out.println(0);
//		System.out.println(1);
		Rekursion r = new Rekursion();
//		r.fibonacci(0, 1, 1, 20);
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(5);
		list.add(4);
		list.add(2);
		list.add(7);
		list.add(10);
		list.add(2);
		list.add(1);
		
		int[] array = new int[2];
		array = r.minMax(list.get(0), list.get(0), list.get(1), 1, list);
		System.out.println(array[0] + " " + array[1]);

	}

}
