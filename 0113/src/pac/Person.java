package pac;

public class Person {

	private int age;
	private String name;
	public int getAge() {
		return age;
	}
	public String getName() {
		return name;
	}
	public void setAge(int age) {
		if(age>=0) this.age = age;
	}
	public void setName(String name) {
		this.name = name;
	}
	

}
