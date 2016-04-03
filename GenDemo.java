//simple generic class
class Gen<T> {
    T ob; //declare an object of type T

    //pass the ctor a reference to an object of type T
    Gen(T o) {
        ob = o;
    }

    //return ob
    T getOb() {
        return ob;
    }

    //show type of T
    void showType() {
        System.out.println("Type of T is " + ob.getClass().getName());
    }
}

class GenDemo {
    public static void main(String args[]) {
        //create a Gen reference for Integers
        Gen<Integer> iOb;

        //create a Gen<Integer> object and assign its reference to iOb.
        //Notice the use of autoboxing to encapsulate the value 88 within an
        //Integer object
        iOb = new Gen<Integer>(88);

        iOb.showType();

        //get the value of iOb. Note that no cast is needed
        int v = iOb.getOb();
        System.out.println("value: " + v);
        System.out.println();

        //create a gen object for Strings
        Gen<String> strObj = new Gen<String>("Generics Test");

        //show the type of data used by strObj
        strObj.showType();

        //get the value of strObj. No cast needed.
        String str = strObj.getOb();
        System.out.println("value " + str);
    }
}
