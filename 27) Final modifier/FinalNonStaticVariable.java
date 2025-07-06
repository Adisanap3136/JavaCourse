package finalModifier;

public class FinalNonStaticVariable {

    // final int d; 
    // ❌ Error: non-static final variable must be initialized either at declaration, in instance block, or constructor

    // 1️⃣ Initialized at declaration (inline initialization)
    final int a = 10;

    // 2️⃣ Initialized in non-static (instance) initializer block
    final int b;
    {
        b = 20;
        // b = 25; // ❌ Error: cannot assign twice to final variable
    }

    // 3️⃣ Initialized in constructor
    final int c;

    public FinalNonStaticVariable(int val) {
        c = val;  // initialize with constructor parameter
        // c = 11;  // ❌ Error: cannot assign twice
    }

    // 4️⃣ Another constructor demonstrating that final must be assigned in every constructor
    public FinalNonStaticVariable() {
        c = 30;  // must assign here as well, otherwise compile error  //if we not assign value using this constructor we will get cte
    }

    // 5️⃣ Final variable cannot be assigned in static context or static methods
    public static void staticMethod() {
        // a = 50; // ❌ Error: cannot assign a non-static final variable in static context
    }

    // 6️⃣ Final variable can be accessed from instance methods but not reassigned
    public void instanceMethod() {
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        // a = 100; // ❌ Error: cannot assign a final variable
    }

    public static void main(String[] args) {
         new FinalNonStaticVariable(11).instanceMethod();

        new FinalNonStaticVariable().instanceMethod();        //if we cannot assign value to the c in no args constructor then we will get run cte
    }
}
