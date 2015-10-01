package com.base.dp.behaviour.iterator;



public class Client {
	public static void main(String[] args) {
		  Collection<String> con = new ArrayList<String>();
		  con.add("testd");
		  con.add("tomcat");
		  con.add("jack");
		  con.add("jim");
		  con.add("lucy");
		  Iterator<String> it = con.iterator();
		  while(it.hasNext()){
			  System.out.println(it.next());
		  }
		  con.remove("jack");
		  it = con.iterator();
		  while(it.hasNext()){
			  System.out.println(it.next());
		  }
	}
}
