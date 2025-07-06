package finalModifier;

public class FinalMethods {

    // 1️⃣ Final Static Method - prevents method shadowing (not overriding)
    public static final void demo() {
        System.out.println("Static final method from superclass");
    }

    // 2️⃣ Final Instance Method - prevents overriding
    public final void test() {
        System.out.println("Final non-static method from superclass");
    }

    public static void main(String[] args) {
        FinalMethods obj = new FinalMethods();
        obj.test();   // Call final instance method
        demo();       // Call final static method
    }
}

// Subclass
class Child extends FinalMethods {

    // ❌ This would cause a compile-time error:
    // Cannot override the final method from FinalMethods
    // public void test() {}

    // ❌ This would also cause a compile-time error:
    // Cannot hide the static method from the superclass if it's final
    // public static void demo() {}

    {
        System.out.println("We cannot override final instance methods.");
        System.out.println("We cannot shadow static final methods.");
    }
}
