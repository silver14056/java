package lesson3;

public class task1 {
    public static void main(String[] args) {
        Object o = 1;
        GetType(o);
        o = 1.2;
        GetType(o);
        //---------------------------------------------------------------------
        System.out.println(Sum(1, 2));
        System.out.println(Sum(1.0, 2));
        System.out.println(Sum(1, 2.0));
        System.out.println(Sum(1.2, 2.1));
    }

    static void GetType(Object o) {
        System.out.println(o.getClass().getName());
    }

    static Object Sum(Object a, Object b) {
        if (a instanceof Integer && b instanceof Integer) {
            return (Object) ((Integer) a + (Integer) b);
        } else if (a instanceof Double && b instanceof Double){
            return (Object) ((Double) a + (Double) b);
        } else return 0;
    }
}
