
public class Student {
    private int id;
    private String name;
    private String email;
    private String course;
    private int marks;

    // constructors
    public Student() {}

    public Student(String name, String email, String course, int marks) {
        this.name = name;
        this.email = email;
        this.course = course;
        this.marks = marks;
    }
    
    
	
    @Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Student [id=");
		builder.append(id);
		builder.append(", name=");
		builder.append(name);
		builder.append(", email=");
		builder.append(email);
		builder.append(", course=");
		builder.append(course);
		builder.append(", marks=");
		builder.append(marks);
		builder.append("]");
		return builder.toString();
	}

	// getters and setters
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
    	this.id=id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }
}
