package alfi120423;

public class LatihanStudentRecord {
    int nilai;
    protected String name; 
    protected String address; 
    protected int age; 
    protected double mathGrade; 
    protected double englishGrade; 
    protected double scienceGrade; 
    protected double average;
    protected static int studentCount;
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getAddress() {
        return address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public double getMathGrade() {
        return mathGrade;
    }
    
    public void setMathGrade(double mathGrade) {
        this.mathGrade = mathGrade;
    }
    
    public double getEnglishGrade() {
        return englishGrade;
    }
    
    public void setEnglishGrade(double englishGrade) {
        this.englishGrade = englishGrade;
    }
    
    public double getScienceGrade() {
        return scienceGrade;
    }
    
    public void setScienceGrade(double scienceGrade) {
        this.scienceGrade = scienceGrade;
    }
    
    public double getAverage() {
        average = (mathGrade + englishGrade + scienceGrade)/3;
        return average;
    }
    
    public static int getStudentCount() {
        return studentCount;
    }
    
    public LatihanStudentRecord() {
        studentCount++;
    }
    
    public LatihanStudentRecord(String temp){ 
        this.name = temp; 
        studentCount++;
    } 
    
    public LatihanStudentRecord(String name, String address){ 
        this.name = name; 
        this.address = address; 
        studentCount++;
    } 
    public LatihanStudentRecord(double mGrade, double eGrade, double sGrade){ 
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
