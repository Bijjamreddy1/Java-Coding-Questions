package java8CodingQues;

public class User {
	
	private String name;
	private Integer age;
	
	public User(String name, int age) {

		this.name=name;
		this.age=age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	

	 // toString method for display
    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}
