class A {
    public void display() {
        System.out.println("This is class A");
    }
}

class B extends A {
    @Override
    public void display() {
        System.out.println("This is class B");
    }
}



public class Annotation {
    public static void main(String[] args) {
        // A objA = new A();
        A objB;
        objB = new B(); // Upcasting: B is a subclass of A

        // objA.display(); // Calls class A's display method
        objB.display(); // Calls class B's display method   
    }
    
}
