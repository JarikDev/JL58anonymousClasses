package com;

class Popcor {
    void doSomething() {
        System.out.println("popcorn");
    }

    void secondMethod() {
        System.out.println("second");
    }
}

public class MainThree {
    public static void main(String[] args) throws Exception {
        method(new Popcor(){
            void doSomething(){
                System.out.println("popcor");
            }
        });
    }
    static void method(Popcor popcor){
        popcor.doSomething();
    }
}
