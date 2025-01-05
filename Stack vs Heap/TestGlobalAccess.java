// There’s a subtle distinction between objects and instance variables, and understanding their scope and access is key.

// Clarification:
// 	1.	Objects vs. Instance Variables:
// 	•	Objects: These are actual entities created in the heap memory. For example, new MyClass() creates an object in the heap.
// 	•	Instance variables: These are attributes (variables) that belong to an object. Their access is governed by access modifiers (private, protected, etc.), not by the heap.
// 	2.	Why Objects Are Said to Have “Global Access” in Heap:
// 	•	Objects in heap memory are not restricted to a specific thread or stack. They can be accessed by any thread or method in your program as long as you have a reference to the object.
// 	•	This “global access” does not mean unrestricted access. You still need the correct reference and must obey any access control rules (e.g., access modifiers of instance variables or methods).
// 	3.	Heap Memory and Stack Memory:
// 	•	The heap holds the actual objects.
// 	•	The stack holds references (pointers) to these objects.
// 	•	You can think of objects as global entities in the heap that can be shared across the application, but instance variable accessibility depends on the object’s visibility and design.

// Example to Understand the Distinction

class MyClass {
    private int instanceVar = 10; // Instance variable: accessible only within MyClass
    
    public void displayVar() {
        System.out.println(instanceVar); // Accessible here
    }
}

public class TestGlobalAccess { // This class doesn't need to be public
    public static void main(String[] args) {
        MyClass obj = new MyClass(); // `obj` is a reference stored in the stack, object is in heap
        
        // The object is in the heap and technically "globally accessible" if you have a reference
        obj.displayVar(); 
        
        // However, instanceVar is private, so you cannot access it directly
        // System.out.println(obj.instanceVar); // ERROR: instanceVar is private
    }
}

// Key Takeaways:
// 	•	Objects in heap can be shared globally if you have a reference, which is why they are described as “global access.”
// 	•	Instance variables are part of these objects but their access is governed by Java’s encapsulation and access control rules.
// 	•	So, while objects may have “global presence” in the heap, accessing their internal instance variables is restricted based on how they are defined.