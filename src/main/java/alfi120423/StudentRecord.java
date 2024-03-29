package alfi120423;

public class StudentRecord {
    int nilai;
    private String name; 
    private String address; 
    private int age; 
    private double mathGrade; 
    private double englishGrade; 
    private double scienceGrade; 
    private double average;
    
    
    private static int studentCount;
    
    public double getAverage() {
        average = (mathGrade + englishGrade + scienceGrade)/3;
        return average;
    }
    
    public static int getStudentCount() {
        return studentCount;
    }
    
    public StudentRecord() {
        studentCount++;
    }
    
    public StudentRecord(String temp){ 
        this.name = temp; 
        studentCount++;
    } 
    
    public StudentRecord(String name, String address){ 
        this.name = name; 
        this.address = address; 
        studentCount++;
    } 
    public StudentRecord(double mGrade, double eGrade, double sGrade){ 
        mathGrade = mGrade; 
        englishGrade = eGrade; 
        scienceGrade = sGrade; 
        studentCount++;
    }
    
    public void print( String temp ){ 
        System.out.println("Name:" + name); 
        System.out.println("Address:" + address); 
        System.out.println("Age:" + age); 
    } 
    
    public void print(double eGrade, double mGrade, double sGrade){
        System.out.println("Name:" + name); 
        System.out.println("Math Grade:" + mGrade); 
        System.out.println("English Grade:" + eGrade); 
        System.out.println("Science Grade:" + sGrade); 
    }
}
