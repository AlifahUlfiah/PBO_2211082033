package alfi130423;

public class MyInteger implements Relation {
    public boolean isGreater(Object a, Object b) {
        return ((int) a > (int)b);
    }
    public boolean isLess(Object a, Object b) {
        return ((int) a < (int)b);
    }
    public boolean isEqual(Object a, Object b) {
        return ((int) a == (int)b);
    }
}
