import java.util.*;
public class StudentGradeCalcTask2 {
    // to claculate the TOTAL SUM
    public static int totalSum(int marks[]){
        int sum=0;
        for (int i=0;i<marks.length;i++)
        {
            sum+=marks[i];
        }
        return sum;
    }
    //to claculate the AVERAGE PERCENTAGE
    public static double average(int marks[]){
        double avg=totalSum(marks)/(marks.length);
        return avg;
    }
    // GRADE calculation
    public static String grade(double avg){
        if(avg<40)
            return "F";
        else if (avg>=40 && avg<50) {
            return "E";
        }
        else if (avg>=50 && avg<60) {
            return "D";
        }
        else if (avg>=60 && avg<70) {
            return "C";
        }
        else if (avg>=70 && avg<80) {
            return "B";
        }
        else if (avg>=80 && avg<90) {
            return "A";
        }
        else if (avg>=90 && avg<100) {
            return "A+";
        }
        else if (avg==100) {
            return "A++";
        }
        return "";
    }
    //DISPLAY RESULTS
    public static void print(int marks[],String subjectname[]){
        int totalsum=totalSum(marks);
        double avg=average(marks);
        String grade=grade(avg);
//        System.out.println("SUBJECT\t\t\t\tMARKS");
//        for (int i=0;i<marks.length;i++){
//            System.out.println(subjectname[i]+"\t\t\t\t"+marks[i]);
//        }
        System.out.println("____________________________________________________");
        System.out.println("|GRAND-TOTAL|\t|AVERAGE-PERCENTAGE|\t|GRADE|");
        System.out.println("____________________________________________________");
        System.out.println("   "+totalsum+"\t\t\t"+avg+"%\t\t"+grade);
        System.out.println("_______________|_____________________|______________");
    }
    public static void main(String[] args) {
        int numOfSub;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of Subjects");
        numOfSub=sc.nextInt();
        int marks[]=new int[numOfSub];
        String subjectname[]=new String[numOfSub];
        for (int i=0;i<numOfSub;i++)
        {
            System.out.println("Enter the Subject"+(i+1)+" Name");
             subjectname[i]=sc.next();
            System.out.println("Enter your marks in "+subjectname[i]+": ");
            marks[i]= sc.nextInt();
        }
        print(marks,subjectname);
    }
}
