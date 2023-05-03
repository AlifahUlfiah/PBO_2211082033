package alfi060423;

public class StudentRecordExam {
    public static void main (String args []){
        StudentRecord anna = new StudentRecord("Anna","Atlantis");
        anna.nilai = 0;
        anna.print("");

        
        System.out.println("Student Record = " + StudentRecord.getStudentCount());
    }
}
