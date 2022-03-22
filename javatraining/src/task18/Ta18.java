package task18;

import java.util.Comparator;
	class StartYear implements Comparator<Employeee>{
		public int compare(Employeee e1, Employeee e2) {
			return  e2.startYear-e1.startYear;
		}
	}

