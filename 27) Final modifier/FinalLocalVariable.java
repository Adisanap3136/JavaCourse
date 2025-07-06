package finalModifier;

public class FinalLocalVariable {
    public static void main(String[] args) {
        
        // ------------------ Scenario 1 ------------------
        // Final variable initialized at declaration
        final int a = 10;
        System.out.println("Scenario 1: " + a);
        // a = 20;  // ❌ Error: Cannot assign a value to final variable 'a'
        
        
        // ------------------ Scenario 2 ------------------
        // Final variable declared but not initialized
        // Uncommenting below will cause compile-time error
        /*
        final int b;
        System.out.println("Scenario 2: " + b); // ❌ Error: variable b might not have been initialized
        */
        
        
        // ------------------ Scenario 3 ------------------
        // Final variable declared and assigned later (only once)
        final int c;
        c = 10;
        System.out.println("Scenario 3: " + c);
        // c = 11;  // ❌ Error: cannot assign a value again to final variable 'c'
        
        
        // ------------------ Scenario 4 ------------------
        // Declaring final variable without initialization is allowed
        // But you must initialize before using
        final int d;
        d = 99; // ✅ Assigning later is okay
        System.out.println("Scenario 4: " + d);

        
        // ------------------ Scenario 5 ------------------
        // Using final variable in if-else (assigned in all branches)
        final int e;
        boolean flag = true;
        if (flag) {
            e = 5;
        } else {
            e = 10;
        }
        System.out.println("Scenario 5: " + e); // ✅ OK because all paths assign 'e'

        
        // ------------------ Scenario 6 ------------------
        // Final variable in a loop (watch for conditional assignment)
        final int f;
        if (true) {
            f = 30; // Only if this block always runs, it's okay
        }
        System.out.println("Scenario 6: " + f); // ✅ OK if f is guaranteed to be assigned

        
        // ------------------ Scenario 7 ------------------
        // Final variable in anonymous class
        final int g = 100;
        Runnable r = new Runnable() {
            public void run() {
                System.out.println("Scenario 7 (anonymous class): " + g);
            }
        };
        r.run();

        
        // ------------------ Scenario 8 ------------------
        // Final reference vs. object content
        final int[] arr = {1, 2, 3};
        arr[0] = 99; // ✅ Allowed
        System.out.println("Scenario 8: arr[0] = " + arr[0]);
        // arr = new int[5]; // ❌ Error: cannot assign a new array to final reference
    }
}
