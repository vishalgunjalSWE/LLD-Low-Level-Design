# Taking input from user in Java

```Java
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for integer
        System.out.print("Enter an integer: ");
        int intValue = scanner.nextInt();
        System.out.println("You entered: " + intValue);

        // Taking input for double
        System.out.print("Enter a double: ");
        double doubleValue = scanner.nextDouble();
        System.out.println("You entered: " + doubleValue);

        // Taking input for float
        System.out.print("Enter a float: ");
        float floatValue = scanner.nextFloat();
        System.out.println("You entered: " + floatValue);

        // Taking input for string
        System.out.print("Enter a string: ");
        scanner.nextLine();
        String stringValue = scanner.nextLine();
        System.out.println("You entered: " + stringValue);

        // Taking input for char (as a string and extracting the first character)
        System.out.print("Enter a character: ");
        String charInput = scanner.next();
        char charValue = charInput.charAt(0);
        System.out.println("You entered: " + charValue);

        // Taking input for boolean
        System.out.print("Enter a boolean (true/false): ");
        boolean booleanValue = scanner.nextBoolean();
        System.out.println("You entered: " + booleanValue);

        // Close the scanner to prevent resource leak
        scanner.close();
    }
}
```

**Expected Output**

```CONSOLE
Enter an integer: 5
You entered: 5
Enter a double: 5.4
You entered: 5.4
Enter a float: 4.3
You entered: 4.3
Enter a string: Manoj Kumar
You entered: Manoj Kumar
Enter a character: A
You entered: A
Enter a boolean (true/false): true
You entered: true
```
## Java Garbage Collector:

The Java garbage collector (GC) is an automatic memory management system that frees up memory by reclaiming space occupied by objects that are no longer in use by a program. In Java, obj. are dynamically allocated on the heap and over time, some obj. may no longer be reachable or needed by the application.

The garbage collector identifies these `garbage` obj. and deletes them to make room for new obj, thus preventing memeory leaks and ensuring efficient use of memory. 

The process is largely transparent to the programmer, although it can be influenced through various `GC` algorithms and parameters to optimize performance for specific use cases.
```