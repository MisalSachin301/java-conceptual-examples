package pack2;

import pack1.A;

public class B extends A {
    public B(){
        super(100);
        System.out.println(A.i);
    }

    public static void main(String[] args) {
        B b = new B();
    }
}
