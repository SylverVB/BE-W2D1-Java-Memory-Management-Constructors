// Exercises:
// Create a class named A that contains two constructors,
//     One with no arguments that prints "No Arguments to A." to the console
//     One with one int argument that prints the argument received.
// Create a class named B that extends class A above:
//     Also implement this class with two constructors as described above but prints "No Arguments to B" when the no-arguments constructor is called.
// Create a class named C that extends class B above, and has a main that instantiates objects of classes A, B, and C with one argument each.
//     NOTE: 'Extending' a class is in reference to the object oriented design principle 'inheritance'. Review this information for more details.


public class C extends B {
    // No-arguments constructor
    public C() {
        System.out.println("No Arguments to C.");
    }

    // Constructor with one int argument
    public C(int value) {
        super(value); // Call the constructor of class B with one int argument
        System.out.println("Argument received in C: " + value);
    }

    // Main method
    public static void main(String[] args) {
        // Instantiate objects of classes A, B, and C with one argument each
        A a = new A(10); // Calls A(int value)
        B b = new B(20); // Calls B(int value), which in turn calls A(int value)
        C c = new C(30); // Calls C(int value), which calls B(int value), which calls A(int value)
    }
}