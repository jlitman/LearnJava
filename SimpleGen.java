//generic class with two type params
class TwoGen<T,V> {
    T obj1;
    V obj2;

    //pass ctor refs to objects of type T and V
    TwoGen(T o1, V o2) {
        obj1 = o1;
        obj2 = o2;
    }

    void showTypes() {
        System.out.println("Type of T is " + obj1.getClass().getName());
        System.out.println("Type of V is " + obj2.getClass().getName());
    }

    T getob1() {
        return obj1;
    }

    V getob2() {
        return obj2;
    }
}

class SimpleGen {
    public static void main(String argv[]) {
        TwoGen<Integer, String> tg = new TwoGen<Integer, String>(88,
                "Generic");

        tg.showTypes();

        int v = tg.getob1();
        System.out.println("value: " + v);

        String s = tg.getob2();
        System.out.println("value: " + s);
    }
}
