package java8;

import java.util.ArrayList;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;


	class Cricket{
		String Name;
		int jerseynum;
		String field;
		float salary;
		Cricket(String Name,int jerseynum,String field,float salary){
			this.Name=Name;
			this.jerseynum=jerseynum;
			this.field=field;
			this.salary=salary;
		}
	}
	public class India {
	public static void main(String[] args) {
		ArrayList<Cricket> b=new ArrayList<>();
		b.add(new Cricket("Virat",18,"Batting",1000));
		b.add(new Cricket("Rohith",45,"Batting",1000));
		b.add(new Cricket("Siraj",12,"Bowling",700));
		b.add(new Cricket("Dhoni",07,"Batting",1000));
		b.add(new Cricket("Bumrah",49,"Bowling",990));
		b.add(new Cricket("Jadeja",001,"AllRounder",980));
		System.out.println("The players details :");
		Set<Cricket> newSet=b.stream().filter(obj->obj.salary>=970).collect(Collectors.toSet());
		newSet.forEach(n->System.out.println(n.Name+" "+n.jerseynum+" "+n.field+" "+n.salary));
	}

}
