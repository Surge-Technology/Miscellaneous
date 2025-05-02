import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

@SuppressWarnings("unused")
public class Driver {

	static ArrayList<Student> a1 = new ArrayList<Student>(5);
	static int u, v, x, y, z;

	public ArrayList<Student> getStudentlist() {
		HashMap<String, Integer> stulist1 = new HashMap<String, Integer>();
		stulist1.put("java", 20);
		stulist1.put("c", 85);
		stulist1.put("spring", 80);
		stulist1.put("xml", 90);
		stulist1.put("html", 100);

		Student s1 = new Student();
		s1.setStudentid(1);
		s1.setStudentname("raj");
		s1.setDetails(stulist1);
		a1.add(s1);

		HashMap<String, Integer> stulist2 = new HashMap<String, Integer>();
		stulist2.put("java", 100);
		stulist2.put("c", 100);
		stulist2.put("spring", 100);
		stulist2.put("xml", 100);
		stulist2.put("html", 100);

		Student s2 = new Student();
		s2.setStudentid(2);
		s2.setStudentname("karthi");
		s2.setDetails(stulist2);
		a1.add(s2);

		HashMap<String, Integer> stulist3 = new HashMap<String, Integer>();
		stulist3.put("java", 100);
		stulist3.put("c", 85);
		stulist3.put("spring", 80);
		stulist3.put("xml", 90);
		stulist3.put("html", 100);
		stulist3.put("java", 60);

		Student s3 = new Student();
		s3.setStudentid(3);
		s3.setStudentname("arya");
		s3.setDetails(stulist3);
		a1.add(s3);

		HashMap<String, Integer> stulist4 = new HashMap<String, Integer>();
		stulist4.put("java", 30);
		stulist4.put("c", 85);
		stulist4.put("spring", 80);
		stulist4.put("xml", 90);
		stulist4.put("html", 100);

		Student s4 = new Student();
		s4.setStudentid(4);
		s4.setStudentname("lasya");
		s4.setDetails(stulist4);
		a1.add(s4);

		HashMap<String, Integer> stulist5 = new HashMap<String, Integer>();
		stulist5.put("java", 60);
		stulist5.put("c", 85);
		stulist5.put("spring", 80);
		stulist5.put("xml", 90);
		stulist5.put("html", 100);

		Student s5 = new Student();
		s5.setStudentid(5);
		s5.setStudentname("ceaser");
		s5.setDetails(stulist5);
		a1.add(s5);

		return a1;

	}

	public static void getMaxMarks(ArrayList<Student> studentList) {
		Iterator<Student> it = studentList.iterator();
		Map<String, Integer> nameMarksMap = new HashMap<String, Integer>();
		while (it.hasNext()) {
			Student stu = (Student) it.next();
			Integer sum = 0;
			for (Map.Entry<String, Integer> entry : stu.getDetails().entrySet()) {
				String key = entry.getKey();
				Integer value = entry.getValue();
				sum = sum + value;
			}
			System.out.println("Student name = " + stu.getStudentname() + " : Marks = " + sum);
			nameMarksMap.put(stu.getStudentname(), sum);

		}

		System.out.println("NameMaxMarksMap " + nameMarksMap);

		int maxValueInMap = (Collections.max(nameMarksMap.values())); // This
																		// will
																		// return
																		// max
																		// value
																		// in
																		// the
																		// Hashmap

		System.out.println(maxValueInMap);
		for (Entry<String, Integer> entry : nameMarksMap.entrySet()) { // Itrate
																		// through
																		// hashmap
			if (entry.getValue() == maxValueInMap) {
				System.out.println("Person who got the highest marks  " + entry.getKey() + " | Marks = " + entry.getValue());
			} // Print the key with max value
			
		}

	}

	public static void main(String[] args) {
		Driver dc = new Driver();
		ArrayList<Student> array = dc.getStudentlist();
		// String hm = DriverClass.getBestStudent(null);

//		System.out.println("                                 ");
//
//		Iterator<Student> it = array.iterator();
//
//		while (it.hasNext()) {
//
//			Student stu = (Student) it.next();
//			System.out.println(stu.getStudentid() + "    " + stu.getStudentname() + "  " + stu.getDetails());
//
//		}

		getMaxMarks(array);
	}

}