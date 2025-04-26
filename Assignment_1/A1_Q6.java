class College{
    String collegeName;
    String collegeLocation;
    College(String name , String location){
        this.collegeName = name;
        this.collegeLocation = location;
    }
    public void setCollegeName(String name){
        this.collegeName = name;
    }
    public String getCollegeName(){
        return this.collegeName;
    }
    public void setCollegeLocation(String location){
        this.collegeLocation = location;
    }
    public String getCollegeLocation(){
        return this.collegeLocation;
    }
    @Override
    public String toString(){
        return "College name: "+this.collegeName+" College Loction: "+this.collegeLocation;
    }
}
class Student{
    int studentId;
    String StudentName;
    College college;
    Student(int id , String name , College obj){
        this.studentId = id;
        this.StudentName = name;
        this.college = obj;
    }
    public void displaytudentInfo(){
        System.out.println("Student Name : "+this.StudentName);
        System.out.println("Student ID : "+this.studentId);
        System.out.println("College : "+this.college);
    }
}
public record A1_Q6() {
    public static void main(String[] args) {
        Student s1 = new Student(1234, "Anwesha", new College("ITER", "BBSR"));
        Student s2 = new Student(4567,"Laxmi" , new College("ABIT", "CTC"));
        Student s3 = new Student(78910, "Riya", new College("IIIT", "BBSR"));
        Student s4 = new Student(1359, "Rani", new College("IIT", "Bombay"));
        s1.displaytudentInfo();
        s2.displaytudentInfo();
        s3.displaytudentInfo();
        s4.displaytudentInfo();
    }
}
