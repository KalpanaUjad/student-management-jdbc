import java.sql.*;
import java.util.*;

public class StudentDAO {

    public void addStudent(Student s) {
        String sql = "INSERT INTO students(name,email,course,marks) VALUES(?,?,?,?)";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, s.getName());
            ps.setString(2, s.getEmail());
            ps.setString(3, s.getCourse());
            ps.setInt(4, s.getMarks());
            

            ps.executeUpdate();
            System.out.println("Student added successfully");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<Student> getAllStudents() {
        List<Student> list = new ArrayList<>();
        String sql = "SELECT * FROM students";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                Student s = new Student();
                s.setId(rs.getInt("id"));
                s.setName(rs.getString("name"));
                s.setEmail(rs.getString("email"));
                s.setCourse(rs.getString("course"));
                s.setMarks(rs.getInt("marks"));
                list.add(s);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    
    public Student getStudentById(int id) {
    	String sql = "Select * from students where id = ?";
    	Student s = null;
    	
    	try (Connection con = DBConnection.getConnection();
    			PreparedStatement ps = con.prepareStatement(sql)){
    		
    		ps.setInt(1, id);
    		ResultSet rs = ps.executeQuery();
    		
    		if(rs.next()) {
    			s = new Student();
                s.setId(rs.getInt("id"));
                s.setName(rs.getString("name"));
                s.setEmail(rs.getString("email"));
                s.setCourse(rs.getString("course"));
                s.setMarks(rs.getInt("marks"));
            }
    	} catch (Exception e) {
            e.printStackTrace();
        }
        return s;
    	
    }
    
    public void updateStudent(Student s) {
        String sql = "UPDATE students SET name=?, email=?, course=?, marks=? WHERE id=?";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, s.getName());
            ps.setString(2, s.getEmail());
            ps.setString(3, s.getCourse());
            ps.setInt(4, s.getMarks());
            ps.setInt(5, s.getId());

            ps.executeUpdate();
            System.out.println("Student updated");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    
    public void deleteStudent(int id) {
        String sql = "DELETE FROM students WHERE id=?";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("Student deleted");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
