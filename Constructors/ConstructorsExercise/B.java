public class B extends A {
    // No-arguments constructor
    public B() {
        System.out.println("No Arguments to B.");
    }

    // Constructor with one int argument
    public B(int value) {
        super(value); // Call the constructor of class A with one int argument
        System.out.println("Argument received in B: " + value);
    }
}