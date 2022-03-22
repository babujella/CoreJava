package task18;

import java.util.Comparator;

class Rating implements Comparator<Employeee>{
	public int compare(Employeee e1, Employeee e2) {
		return  e2.rating-e1.rating;
	}
}
