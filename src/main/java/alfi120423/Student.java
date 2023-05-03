package alfi120423;

public  class Student extends Person {
    public Student(){
        super("Budi","Padang");
        System.out.println("Inside Student : Constructor");
    }
    
    public Student( String name, String address ){ 
        this.name = name; 
        this.address = address; 
    }
    
    @Override 
    public String getName(){ 
        System.out.println("getName Student");
        return name; 
    }

    public static void main (String args []) {
        Student student = new Student();
        student.name = "Ali";
        student.address = "Padang";
    }
}
