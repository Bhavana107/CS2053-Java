class Student {
    public String sname;
    public String usn;
    public char section;
    public int sem;

    public Student(String sname, String usn, char section, int sem) {
        this.sname = sname;
        this.usn = usn;
        this.section = section;
        this.sem = sem;
    }

    public void display() {
        System.out.println("Student name is " + sname);
        System.out.println("Student's USN is " + usn);
        System.out.println("Student is in section " + section);
        System.out.println("Student is in " + Sem + " sem");
    }
}

public class Prog2 {
    public static void main(String[] args) {
        Student std = new Student("ABC", "1RUA24SCS0015", 'A', 3);
        std.display();
    }
}
