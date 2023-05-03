package alfi120423;

public class LatihanStudent extends LatihanStudentRecord {
    @Override
    public String getName() {
        return name;
    }
    
    @Override
    public void setName(String name) {
        this.name = name;
    }
    
    @Override
    public String getAddress() {
        return address;
    }
    
    @Override
    public void setAddress(String address) {
        this.address = address;
    }
    
    @Override
    public int getAge() {
        return age;
    }
    
    @Override
    public void setAge(int age) {
        this.age = age;
    }
    
    @Override
    public double getMathGrade() {
        return mathGrade;
    }
    
    @Override
    public void setMathGrade(double mathGrade) {
        this.mathGrade = mathGrade;
    }
    
    @Override
    public double getEnglishGrade() {
        return englishGrade;
    }
    
    @Override
    public void setEnglishGrade(double englishGrade) {
        this.englishGrade = englishGrade;
    }
    
    @Override
    public double getScienceGrade() {
        return scienceGrade;
    }
    
    @Override
    public void setScienceGrade(double scienceGrade) {
        this.scienceGrade = scienceGrade;
    }
    
    @Override
    public double getAverage() {
        average = (mathGrade + englishGrade + scienceGrade)/3;
        return average;
    }    

    public static void main (String args []) {
        LatihanStudent student = new LatihanStudent();
        student.name = "Ali";
        student.address = "Padang";
    }
}
