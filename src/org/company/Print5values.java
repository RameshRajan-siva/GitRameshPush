package org.company;

import java.util.ArrayList;
import java.util.List;


public class Print5values {
	
  public void First5values() {
		List<Integer> f = new ArrayList<Integer>();
		f.add(10);
		f.add(20);
		f.add(30);
		f.add(40);
	    f.add(50);
		f.add(60);
		f.add(70);
		f.add(80);
		f.add(90);
		f.add(100);
	
		System.out.println("Print First 5 Values");
		for (int i = 0; i < f.size()-5; i++) {
			Integer integer = f.get(i);
			System.out.println(integer);
		}	
	}
	
	public void Last5values() {
    List<Integer> l = new ArrayList<Integer>();	
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);
		l.add(60);
		l.add(70);
		l.add(80);
		l.add(90);
		l.add(100);
		
		System.out.println("Print Last 5 Values");
		for (int i = 5; i < l.size(); i++) {
			Integer integer = l.get(i);
			System.out.println(integer);
		}	

}
	 public void MiddleVal() {
		int val = 0;
		 List<Integer> m = new ArrayList<Integer>();
			m.add(10);
			m.add(20);
			m.add(30);
			m.add(40);
			m.add(50);
			m.add(60);
			m.add(70);
			m.add(80);
			m.add(90);
			m.add(100);
			
			System.out.println("Print Last 5 Values");
			for (int i = 0; i < m.size(); i++) {
				int size = m.size()/2;
				val = m.get(size);
			}	
			System.out.println(val);
	}
	
	public static void main(String[] args) {
	
		 Print5values p = new  Print5values();
		 p.First5values();
		 p.Last5values();
		p.MiddleVal();
		
		
	}


	}

