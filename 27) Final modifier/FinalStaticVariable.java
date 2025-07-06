package finalModifier;

public class FinalStaticVariable {

    // Static final variable declared but NOT initialized here
    // Must be initialized in static block or at declaration, else compile error
    final static int a;

    // Static block runs once when the class is loaded,
    // so it's the perfect place to initialize static final variables if not initialized inline.
    static {
        a = 10; // ✅ Initialize static final variable here
        System.out.println("Static block initialized a = " + a);
    }

    // Static final variable initialized inline
    final static int b = 110;

    // Uncommenting this will cause a compile-time error because
    // static final variables must be initialized either inline or in static block
    // final static int c;

    public static void main(String[] args) {
        // You cannot assign a value to static final variable anywhere else like here:
        // c = 10; // ❌ Error: cannot assign a value to final variable 'c'
        
        System.out.println("Static final variable b = " + b);
    }
}


class SubClass extends FinalStaticVariable {
    static {
        // a = 20; // ❌ Error: cannot assign a value to final variable 'a'
        // b = 200; // ❌ Error: cannot assign a value to final variable 'b'
    }
}