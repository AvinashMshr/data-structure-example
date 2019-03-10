package data.structure.example;

import java.util.Comparator;

public class UseOfComparable implements Comparable<UseOfComparable> {
	
	private String name;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	private int year;
	private double rating;
	
	 // Constructor 
    public UseOfComparable(String nm, double rt, int yr) 
    { 
        this.name = nm; 
        this.rating = rt; 
        this.year = yr; 
    } 
	

	public int compareTo(UseOfComparable o) {
		// TODO Auto-generated method stub
		return (this.year - o.year);
	}

}

//Class to compare Movies by ratings 
class RatingCompare implements Comparator<UseOfComparable> 
{ 
 public int compare(UseOfComparable m1, UseOfComparable m2) 
 { 
     if (m1.getRating() < m2.getRating()) return -1; 
     if (m1.getRating() > m2.getRating()) return 1; 
     else return 0; 
 } 
} 

//Class to compare Movies by name 
class NameCompare implements Comparator<UseOfComparable> 
{ 
 public int compare(UseOfComparable m1, UseOfComparable m2) 
 { 
     return m1.getName().compareTo(m2.getName()); 
 } 
} 
