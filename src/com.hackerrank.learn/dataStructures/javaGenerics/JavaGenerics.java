package dataStructures.javaGenerics;

public class JavaGenerics {
    public static void main(String[] args) {
        Printer printer = new Printer();
        Integer[] intArray = { 1, 2, 3 };
        String[] strArray = { "Hello", "World" };
        printer.printArray(intArray);
        printer.printArray(strArray);
    }

}

class Printer {
    public static <F> void printArray(F[] fz) {
        for (F f : fz) {
            System.out.println(f);
        }
    }
}
