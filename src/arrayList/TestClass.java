package arrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class TestClass {

	public static void main(String[] args) {

		UserDefinedClassObject obj1 = new UserDefinedClassObject("Student1", 20, 123);
		UserDefinedClassObject obj2 = new UserDefinedClassObject("Student2", 21, 124);
		UserDefinedClassObject obj3 = new UserDefinedClassObject("Student3", 22, 12345);

		ArrayList<UserDefinedClassObject> arrList = new ArrayList<UserDefinedClassObject>();
		arrList.add(obj1);
		arrList.add(obj2);
		arrList.add(obj3);

		Iterator<UserDefinedClassObject> itr = arrList.iterator();
		while (itr.hasNext()) {
			UserDefinedClassObject stu = itr.next();
			System.out.println(stu.stuName);
			System.out.println(stu.age);
			System.out.println(stu.rollNum);

		}

	}

}
