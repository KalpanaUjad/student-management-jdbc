import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentDAO dao = new StudentDAO();

        while (true) {
        	System.out.println("1. Add Student");
        	System.out.println("2. View Students");
        	System.out.println("3. Find Student");
        	System.out.println("4. Update Student");
        	System.out.println("5. Delete Student");
        	System.out.println("6. Exit");

            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Name: ");
                String name = sc.next();
                System.out.print("Email: ");
                String email = sc.next();
                System.out.print("Course: ");
                String course = sc.next();
                System.out.print("Marks: ");
                int marks = sc.nextInt();

                dao.addStudent(new Student(name, email, course, marks));
            }

            if (choice == 2) {
                dao.getAllStudents().forEach(System.out::println);
            }

            if (choice == 3) {
            	System.out.print("Enter student id: ");
                int id = sc.nextInt();

                Student s = dao.getStudentById(id);

                if (s != null) {
                    System.out.println(s);
                } else {
                    System.out.println("Student not found");
                }
            }
            
            if (choice == 4) {
                System.out.print("Enter student id to update: ");
                int id = sc.nextInt();

                Student existing = dao.getStudentById(id);

                if (existing == null) {
                    System.out.println("Student not found");
                } else {
                    System.out.print("New Name: ");
                    String name = sc.next();
                    System.out.print("New Email: ");
                    String email = sc.next();
                    System.out.print("New Course: ");
                    String course = sc.next();
                    System.out.print("New Marks: ");
                    int marks = sc.nextInt();

                    Student s = new Student();
                    s.setId(id);
                    s.setName(name);
                    s.setEmail(email);
                    s.setCourse(course);
                    s.setMarks(marks);

                    dao.updateStudent(s);
                }
            }
            
            if (choice == 5) {
                System.out.print("Enter student id to delete: ");
                int id = sc.nextInt();

                dao.deleteStudent(id);
            }
            
            if(choice == 6) {
            	System.out.println("Exit");
            	break;
            }


        }
    }
}
