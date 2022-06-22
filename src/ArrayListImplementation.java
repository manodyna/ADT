import java.util.ArrayList;

public class ArrayListImplementation implements StudentOperations{

    ArrayList<Student> students = new ArrayList<>();

    @Override
    public String add(Student student) {
        students.add(student);
        return ("student successfully added");
    }

    @Override
    public String add() {
        Student student = CreateStudent.createStudent();
        students.add(student);
        return ("student successfully added");
    }

    @Override
    public Student search(int id) {
        for (int i = 0; i< students.size(); i++) {
            Student student = new Student();
            student = students.get(i);
            if (id == student.getId()) {
                return student;
            }
        }
        return null;
    }

    @Override
    public void delete(int id) {
        for (int i = 0; i< students.size(); i++){
            Student student = new Student();
            student = students.get(i);
            if(id == student.getId()){
                students.remove(i);
            }
        }
    }
}
