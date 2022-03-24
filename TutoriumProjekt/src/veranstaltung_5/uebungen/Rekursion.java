package veranstaltung_5.uebungen;

import java.util.ArrayList;

public class Rekursion {
	
	public void fibonacci(int last, int act, int counter, int length) {
		if(counter > length) {
			return;
		}
		int newAct = act + last;
		last = act;
		System.out.println(newAct);
		counter++;
		fibonacci(last, newAct, counter, length);
	}
	
	public int[] minMax(int min, int max, int act, int counter, ArrayList<Integer> list) {
		if(act < min) {
			min = act;
		}
		if(act > max) {
			max = act;
		}
		counter++;
		if(counter + 1 > list.size()) {
			return new int[] {min, max};
		} else {
			return minMax(min, max, list.get(counter), counter, list);
		}
	}

}
