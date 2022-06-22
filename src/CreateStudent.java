import java.util.Scanner;

public class CreateStudent {

    static int id = 0;
    public static Student createStudent(){
        id++;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter name, dob, email, mailingAddress, major");
        String name = scanner.next();
        String dateOfBirth = scanner.next();
        String email = scanner.next();
        String mailingAddress = scanner.next();
        Major major = Major.valueOf(scanner.next());
        Student student = new Student(id, name, dateOfBirth, email, mailingAddress, major);
        return student;
    }
}
