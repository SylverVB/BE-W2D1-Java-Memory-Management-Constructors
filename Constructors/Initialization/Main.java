// Default Initialization in Constructors

// In Java, default initialization refers to the process of ensuring that the properties (member variables) of an object are assigned values when an object is created, even if no specific values are provided by the user. Constructors play a key role in this process by allowing the programmer to define these default values explicitly.

// Why Default Initialization Matters
// 	1.	Prevent Uninitialized Variables:
// 	•	In Java, if an object is created without explicitly setting its properties, constructors can provide default values to ensure the object behaves predictably.
// 	2.	Encapsulation and Safety:
// 	•	Default initialization helps encapsulate and safeguard the internal state of the object, ensuring it starts in a valid state.
// 	3.	Avoid Null Pointer Exceptions:
// 	•	By providing meaningful defaults, the risk of NullPointerException or other runtime issues due to uninitialized variables is minimized.

// How Default Initialization Works in Constructors

// When you create an object using a class, the constructor is automatically called. If the constructor specifies default values for the properties, those values will be assigned unless explicitly overridden.

// Example: Default Initialization

class Person {
    // Member variables
    String name;  // Default: null
    int age;      // Default: 0
    boolean isStudent;  // Default: false

    // Constructor with default initialization
    public Person() {
        this.name = "Unknown";  // Default value
        this.age = 18;          // Default value
        this.isStudent = true;  // Default value
    }

    // Constructor with parameters (overrides defaults)
    public Person(String name, int age, boolean isStudent) {
        this.name = name;
        this.age = age;
        this.isStudent = isStudent;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Is Student: " + isStudent);
    }
}

public class Main {
    public static void main(String[] args) {
        // Using default constructor
        Person defaultPerson = new Person();
        defaultPerson.displayInfo();
        // Output:
        // Name: Unknown
        // Age: 18
        // Is Student: true

        // Using parameterized constructor
        Person specificPerson = new Person("Alice", 25, false);
        specificPerson.displayInfo();
        // Output:
        // Name: Alice
        // Age: 25
        // Is Student: false
    }
}

// Key Points
// 	1.	Default Constructor vs. Parameterized Constructor:
// 	•	The default constructor initializes properties with pre-defined values.
// 	•	A parameterized constructor allows the user to explicitly set properties at the time of object creation.
// 	2.	Default Values Without Constructor:
// 	•	Even if no constructor is provided, Java initializes member variables with default values (e.g., 0 for numbers, null for objects, and false for booleans).
// 	•	Example:

public class Example {
    int number;  // Default: 0
    boolean flag;  // Default: false
}


// 	3.	Advantages of Explicit Default Initialization:
// 	•	Using a constructor for default initialization is more flexible than relying on Java’s automatic defaults because it allows setting meaningful values instead of generic ones.

// Why Default Initialization Ensures Predictable Behavior
// 	•	Without default initialization, objects may have uninitialized variables that could lead to undefined or erroneous behavior.
// 	•	Default values defined in constructors ensure that every object has consistent and reliable starting conditions, reducing bugs and enhancing code robustness.