
public class DisplayStudentExamResult {
    String studentName;
    String rollNo;
    static  String collegeName;

    public String resultEvaluation(int sub1, int sub2, int sub3){
        double totalMarks = sub1 + sub2 + sub3;
        double percentage = (totalMarks / 300.0 )* 100;
        if(percentage >= 40){
            return "PASS";
        }else{
            return "FAIL";
        }
}

public void setStudentDetails(String studentName, String rollNo, String collegeName){
    this.studentName = studentName;
    this.rollNo = rollNo;
    DisplayStudentExamResult.collegeName = collegeName;
}

public void displayStudentDetails(String result){
    System.out.println("Student Name : " +this.studentName);
    System.out.println("College Name : " +DisplayStudentExamResult.collegeName);
    System.out.println("Roll No : " +this.rollNo);
    System.out.println("Exam Result : " +result);
}

public static void main(String[] args) {
    DisplayStudentExamResult s1 = new DisplayStudentExamResult();
    String result = s1.resultEvaluation(100, 90, 80);
    s1.setStudentDetails("Sipun Kumar Nanda", "2622-PD-63", "Seemanta Engineering college");
    s1.displayStudentDetails(result);
}
}
