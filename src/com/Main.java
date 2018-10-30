package com;

class Popcorn {
    void doSomething() {
        System.out.println("popcorn");
    }
    void secondMethod(){
        System.out.println("second");
    }
}

public class Main {
    public static void main(String[] args) throws Exception {
        Popcorn popcorn = new Popcorn() {
              void doSomething() {
                System.out.println("main");
            }
            void secondMethod(){
                System.out.println("second method overrided");
            }
        };
        popcorn.doSomething();
        popcorn.secondMethod();
    }
}
