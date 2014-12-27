/**
 * Following program demonstrates use of Comparable and Comparator in java
 */
package in.blogspot.javacodebit.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author dinesh
 *
 */
public class CollectionSortDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Student> students = new ArrayList<Student>();
		students.add(new Student(4, "Tom", "Peterson"));
		students.add(new Student(1, "Dick", "Loyd"));
		students.add(new Student(5, "Harry", "Ken"));
		students.add(new Student(2, "James", "Powel"));
		students.add(new Student(3, "Dan", "Brown"));
		
		System.out.println("Unsorted List");
		printList(students);
		
		Collections.sort(students);
		System.out.println("Sorted List - Natural Ordering by roll number in ascending way");
		printList(students);
		
		Comparator<Student> fnameComparator = new Comparator<Student>() {	// Customized Comparator	
			@Override
			public int compare(Student s1, Student s2) {
				return s1.getFirstName().compareTo(s2.getFirstName());
			}
		};
		Collections.sort(students, fnameComparator);
		System.out.println("Sorted List - Customized Ordering by first name in ascending way");
		printList(students);
	}

	private static void printList(List<Student> students) {
		for (Student student : students) {
			System.out.println(student);
		}
	}
}
/**
 * Student class implements comparable interface 
 * and applies comparison logic in compareTo method.
 * This logic is default logic for ordering students.
 */
class Student implements Comparable<Student>{
	private String firstName;
	private String lastName;
	private Integer rollNo;
	
	public Student(Integer rollNo, String firstName, String lastName) {
		super();
		this.rollNo = rollNo;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	@Override
	public String toString() {
		return rollNo+"\t"+firstName+"\t"+lastName;
	}
	@Override
	public int compareTo(Student s) {	//method Comparable interface
		return (rollNo- s.getRollNo());
	}
}
