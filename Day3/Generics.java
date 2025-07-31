package Day3;

import java.util.ArrayList;

// Custom generic class
class MyGeneric<T> {
    int val;
    T t1;

    MyGeneric(int val, T t1) {
        this.val = val;
        this.t1 = t1;
    }

    public T getT1() {
        return t1;
    }
}

public class Generics {

    public static void main(String[] args) {
        ArrayList<Integer> arraylist = new ArrayList<>();
        // arraylist.add("str1"); // compile-time error: can't add String to Integer list
        arraylist.add(54);
        arraylist.add(643);

        int a = arraylist.get(0);  // No cast needed if list is generic (Integer)

        MyGeneric<String> g1 = new MyGeneric<>(25, "MyString");
        String str = g1.getT1();

        System.out.println("ArrayList first element: " + a);
        System.out.println("Generic value: " + str);
    }
}
