package thisKeywords;

public class ThisKeywordUsage1Method {

	// Initialized name
	String name;
	int rollNum;
	int age;

	ThisKeywordUsage1Method(String name, int rollNum, int age) {

		// This is used when we have same parameter name as a initialized name
		this.name = name;
		this.rollNum = rollNum;
		this.age = age;

	}

	public void display() {
		System.out.println(name);
		System.out.println(rollNum);
		System.out.println(age);
	}
}
