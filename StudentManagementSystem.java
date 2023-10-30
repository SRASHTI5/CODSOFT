import java.util.ArrayList;
import java.util.List;

     public class StudentManagementSystem {
        private List<StudentManagementSystemTask5> students;
        public StudentManagementSystem(){
            this.students = new ArrayList<>();
        }
        public void addStudent(StudentManagementSystemTask5 student){
            this.students.add(student);
        }
        public void removeStudent(StudentManagementSystemTask5 student){
            this.students.remove(student);
        }
        public StudentManagementSystemTask5 searchStudentByName(String name){
            for(StudentManagementSystemTask5 student: students){
                if(student.getName().equals(name)){
                    return student;
                }
            }
            return null;
        }
        public List<StudentManagementSystemTask5> displayAllStudents(){
            return students;
        } 
        public static void main(String[]args){
        StudentManagementSystem st=new StudentManagementSystem();
        StudentManagementSystemTask5 s1=new StudentManagementSystemTask5("Srashti",1,9,"Excellent student");
        List<StudentManagementSystemTask5> ss=st.displayAllStudents();
        for(StudentManagementSystemTask5 student:ss){
System.out.println(student);
        }
        StudentManagementSystemTask5 st2=st.searchStudentByName("Srashti");
        if(st2!=null)
        System.out.println("Student found"+st2);
       else 
       System.out.println("Student not found.");
    }}
