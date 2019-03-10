package data.structure.example;

import java.util.ArrayList;
import java.util.Collections;

import org.junit.Test;

import junit.framework.TestCase;

public class UseOfComparableTest extends TestCase{
	
	@Test
	public void testTheThing() {
		ArrayList<UseOfComparable> list = new ArrayList<UseOfComparable>(); 
		list.add(new UseOfComparable("Force Awakens", 8.3, 2015)); 
		list.add(new UseOfComparable("Star Wars", 8.7, 1977)); 
		list.add(new UseOfComparable("Empire Strikes Back", 8.8, 1980)); 
		list.add(new UseOfComparable("Return of the Jedi", 8.4, 1983));
		
	      Collections.sort(list,new RatingCompare()); 
	      
	        System.out.println("Movies after sorting : "); 
	        for (UseOfComparable movie: list) 
	        { 
	            System.out.println(movie.getName() + " " + 
	                               movie.getRating() + " " + 
	                               movie.getYear()); 
	        } 
	}


}
