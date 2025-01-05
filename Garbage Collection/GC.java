// Consider the code snippet below. Write a line of code that at the comment line "POINT A" will cause exactly one additional object to be eligible for the garbage collector.

public class GC {
    public static GC doStuff() {
        GC newGC = new GC();
        doStuff2(newGC);
        return newGC;
    }

    public static void doStuff2(GC gc) {
        System.out.println("doStuff2 called");
    }

    public static void main(String[] args) {
        GC gc1;
        GC gc2 = new GC();
        GC gc3 = new GC();
        GC gc4 = gc3;
        gc1 = doStuff();
        // POINT A
        gc3 = null; // Example of making exactly one object eligible for garbage collection
        // gc4 = null; // Now, the object originally referenced by gc3 and gc4 is no longer referenced by any variable and becomes eligible for garbage collection.
    }
}