package java8tasks;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
/*What are the Terminal operations?
give an example for 1.collect() 2.reduce() 3. anyMatch() , noneMatch() , allMatch() 4. forEach() 5.forEachOrdered()*/

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
		public class TerminalOperations {
		public static void main(String[] args) {
			ArrayList<Cricket> b=new ArrayList<>();
			b.add(new Cricket("Virat",18,"Batting",1000));
			b.add(new Cricket("Rohit",44,"Batting",1000));
			b.add(new Cricket("Siraj",12,"Bowling",700));
			b.add(new Cricket("Dhoni",8,"Batting",1000));
			b.add(new Cricket("Bumrah",48,"Bowling",990));
			b.add(new Cricket("Jadeja",100,"AllRounder",980));
			System.out.println("Collect Terminal operation :");
			List<Cricket> newList=b.stream().filter(n->n.salary>=1000).collect(Collectors.toList());
			newList.forEach(k->System.out.println(k.Name+" "+k.jerseynum+" "+k.field+" "+k.salary));
			System.out.println("Mapping on Salary : ");
			List<Float> m=b.stream().filter(n->n.salary<=990).map(p->p.salary).collect(Collectors.toList());
			System.out.println(m);
			System.out.println("Reduce Terminal operation  :");
			float b1=b.stream().filter(n->n.salary>=1000).map(p->p.salary).reduce(0f,(sum,n)->sum+n);
			System.out.println(b1);
			System.out.println("AnyMatch terminal operation  :");
			boolean b2=b.stream().anyMatch(b21->b21.Name.startsWith("B")&&b21.salary>980);
			System.out.println(b2);
			System.out.println("NonMatch terminal Operation   :");
			boolean b3=b.stream().noneMatch(b24->b24.salary==1000&&b24.field=="Bowling");
			System.out.println(b3);
			System.out.println("AllMatch terminal operation   :");
			boolean b4=b.stream().allMatch(b7->b7.Name.endsWith("t")&&b7.field=="Batting"||b7.salary>=700 &&b7.jerseynum%2==0);
			System.out.println(b4);
			System.out.println("forEach terminal operation  :");
			b.stream().filter(n->n.salary>=1000).forEach(n->System.out.println(n.Name+" "+n.salary));
			System.out.println("forEachOrdered terminal operation  :");
			b.stream().filter(n->n.salary<=980).forEachOrdered(n->System.out.println(n.Name+" "+n.salary));
	}

}
