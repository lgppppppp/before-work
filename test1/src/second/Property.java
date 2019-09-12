package second;//: second.Property.java
import java.util.*;

/**
 * The second Thinking in Java example program
 * Lists system information on current machine.
 * @author Bruce Eckel
 * @author http://www.BruceEckel.com
 * @version 1.0
 */
public class Property {
    /**
     * Sole entry point to class & application
     * @param args array of string arguments
     */
    public static void main(String[] args) {
        System.out.println(new Date());
        Properties p = System.getProperties();
        p.list(System.out);
        System.out.println("---Memory Usage:");
        Runtime rt = Runtime.getRuntime();
        System.out.println("Total Memory = " + rt.totalMemory() + " Free Memory = " + rt.freeMemory());
    }
} ///:~