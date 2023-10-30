import java.util.ArrayList;
import java.util.List;

public class StudentManagementSystemTask5 {
        private String name;
        private int rollno;
        private int grade;
        private String otherDetails;
        public StudentManagementSystemTask5(String name,int rollno,int grade, String otherDetails){
            this.name=name;
            this.rollno=rollno;
            this.grade=grade;
            this.otherDetails=otherDetails;

        }
        public String getName(){
            return name;
        }
        public void setName(String name){
            this.name=name;
        }
        int getRollNo(){
            return rollno;
        }
        void setRollno(int rollno){
            this.rollno=rollno;
        }
        int getGrade()
        {
            return grade;
        }
        void setGrade(int grade){
            this.grade=grade;
        }
        public String getotherDetails(){
            return otherDetails;
        }
        void setOtherDetails(String otherDetails){
            this.otherDetails=otherDetails;
        }

    @Override
    public String toString(){
        return "Student{"+"name='"+name+'\''+", rollno="+ rollno+", grade="+grade+", otherDetails='"+otherDetails+'\''+'}';
    }
}
   

