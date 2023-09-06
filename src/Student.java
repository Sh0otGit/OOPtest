public class Student extends User{
    private int studentID;

    public Student(String name, int age, int studentID) {
        super(name, age);
        this.studentID = studentID;
    }

    public int getStudentID(){
        return studentID;
    }
    public void setStudentID(int n){
        studentID = n;
    }
}
