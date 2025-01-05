public class MemoryExample {
    public static void main(String[] args) {
        // This reference variable `person1` is stored in stack memory
        Person person1 = new Person("John");
        
        // The new Person object is created in heap memory.
        // `person1` holds the address/reference to that object in the heap.
        
        Person person2 = new Person("Jane");
        // A second object is created in the heap, and `person2` is a stack reference to it.

        System.out.println(person1.getName()); // Output: John
        System.out.println(person2.getName()); // Output: Jane

        // Assigning person1 to person2
        person1 = person2;
        // Now both `person1` and `person2` point to the same object in the heap.
        // The object previously referenced by `person1` may become eligible for garbage collection.

        System.out.println(person1.getName()); // Output: Jane
    }
}

class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}