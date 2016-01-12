//Annotation example using @Deprecated

//deprecate a class
@Deprecated
class MyOldClass {
    private String msg;

    MyOldClass(String m){
        msg = m;
    }

    //deprecate a method within the class
    @Deprecated
    String getMsg() {
        return msg;
    }
}

class AnnotationDemo {
    public static void main(String args[]) {
        MyOldClass myO = new MyOldClass("test");
        System.out.println(myO.getMsg());
    }
}
