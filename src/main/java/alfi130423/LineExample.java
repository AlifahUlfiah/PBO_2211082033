package alfi130423;

public class LineExample {

    public static void main(String[] args) {
        Relation MyInteger = new MyInteger();
        Relation MyDouble = new MyDouble();
        boolean hasilInt = MyInteger.isGreater(5, 6);
        boolean hasilDbl = MyDouble.isGreater(6.4, 2.2);
        System.err.println("Hasil Integer " + hasilInt);
        System.err.println("Hasil Double " + hasilDbl);
        
        Relation myline = new Line();
        Line line1 = new Line(2, 5, 2, 7);
        Line line2 = new Line(2, 5, 2, 2);
        boolean lineA_lineB = myline.isGreater(line1,line2);
        System.out.println("Line A > Line B " + lineA_lineB);
        
        
    }
}
