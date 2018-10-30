package com;

class Popcornn {
    void doSomething() {
        System.out.println("popcorn");
    }

    void secondMethod() {
        System.out.println("second");
    }
}

public class MainTwo {
    public static void main(String[] args) throws Exception {
        Comparable comparable = new Comparable() {
            @Override
            public int compareTo(Object o) {
                return 0;
            }
        };
        comparable.compareTo(new Object());
    }
    static void method(Popcornn popcornn){
        popcornn.doSomething();

    }
}
