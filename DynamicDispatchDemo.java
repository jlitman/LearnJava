//Demonstrate dynamic method dispatch
class Sup {
    void who() {
        System.out.println("who in Sup");
    }
}

class Sup1 extends Sup {
    void who() {
        System.out.println("who in Sup1");
    }
}

class Sup2 extends Sup {
    void who() {
        System.out.println("who in Sup2");
    }
}

class DynamicDispatchDemo {
    public static void main(String args[]) {
        Sup superOb = new Sup();
        Sup1 subObj1 = new Sup1();
        Sup2 subObj2 = new Sup2();

        Sup superRef;

        superRef = superOb;
        superRef.who();

        superRef = subObj1;
        superRef.who();

        superRef = subObj2;
        superRef.who();
    }
}

