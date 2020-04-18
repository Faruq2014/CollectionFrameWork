package treeSet;

import java.util.Comparator;

public class Students implements Comparable{
String name;
int sid;
Students(String name, int sid){
	this.name= name;
	this.sid=sid;
}
public String toString() {
	//return name+" "+sid;
	return sid+" "+name;
}
@Override
public int compareTo(Object obj) {
	int s1=this.sid;
	Students s=(Students)obj;
	int s2=s.sid;
	if(s1<s2) {return -1;}
	else if(s1>s2) {return 1;}
	else {return 0;}
}

}



class mycomparator6 implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Students s1=(Students)o1;
		Students s2=(Students)o2;
	    String l1 =s1.name;
	    String l2 =s2.name;
		return l1.compareTo(l2);
	}
	
}
