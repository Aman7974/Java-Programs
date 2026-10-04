// class calc{
//   int add(int a, int b){
//     return a + b;
//   };

//   int sub(int a, int b){
//     return a - b;
//   };
// }

// class AdvancedCalc extends calc{
//   int multiply(int a, int b){
//     return a * b;
//   };

//   int divide(int a, int b){
//     return a / b;
//   };
// }

class A {
  public A (){
    super();
    System.out.println("Class A constructor");
  }

  public A(int a){
    System.out.println("Class A constructor with parameter: " + a);
  }
}

class B extends A {
  public B (){
    super(); // Calls A's default constructor
    System.out.println("Class B constructor");
  }

  public B(int a){
    super(a); // Calls A's constructor with parameter
    System.out.println("Class B constructor with parameter: " + a);
  }
}

 


public class demo {
    public static void main(String[] args) {
      //  B b1 = new B();
       //B b2 = new B(10);

  //       calc c = new calc();
  //       int sum = c.add(5, 3);
  //       int difference = c.sub(5, 3);

  //       System.out.println("Sum: " + sum);
  //       System.out.println("Difference: " + difference);
  //       System.out.println("Multiplication: " + new AdvancedCalc().multiply(5, 3));
  //       System.out.println("Division: " + new AdvancedCalc().divide(5, 3));
   }
}

