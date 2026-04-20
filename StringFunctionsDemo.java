package lab3;
public class StringFunctionsDemo {
public static void main(String[] args) {

        // 1. String Creation and Basic Operations
        String str1 = "Hello";
        String str2 = new String("World");
        System.out.println("String1: " + str1);
        System.out.println("String2: " + str2);

        // 2. Length and Character Access
        System.out.println("\nLength of str1: " + str1.length());
        System.out.println("Character at index 2: " + str1.charAt(2));

        // 3. String Comparison
        String str3 = "hello";
        System.out.println("\nstr1 equals str2? " + str1.equals(str2));
        System.out.println("str1 equalsIgnoreCase str3? " + str1.equalsIgnoreCase(str3));

        // 4. String Searching
        String text = "Java Programming Language";
        System.out.println("\nIndex of 'Program': " + text.indexOf("Program"));
        System.out.println("Contains 'Java'? " + text.contains("Java"));

        // 5. Substring Operations
        System.out.println("\nSubstring (5 to 16): " + text.substring(5, 16));

        // 6. String Modification
        System.out.println("\nReplace Java with Python: " + text.replace("Java", "Python"));
        System.out.println("Uppercase: " + text.toUpperCase());
        System.out.println("Lowercase: " + text.toLowerCase());

        // 7. Whitespace Handling
        String spaceStr = "   Hello Java   ";
        System.out.println("\nBefore trim: '" + spaceStr + "'");
        System.out.println("After trim: '" + spaceStr.trim() + "'");

        // 8. String Concatenation
        String concat = str1 + " " + str2;
        System.out.println("\nConcatenated String: " + concat);

        // 9. String Splitting
        String fruits = "Apple,Banana,Orange";
        String[] arr = fruits.split(",");
        System.out.println("\nSplitted Strings:");
        for (String f : arr) {
            System.out.println(f);
        }

        // 10. StringBuilder Demo
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        sb.insert(5, " Java");
        sb.replace(0, 5, "Hi");
        System.out.println("\nStringBuilder Output: " + sb);

        // 11. String Formatting
        String name = "Denzil";
        int age = 21;
        String formatted = String.format("Name: %s, Age: %d", name, age);
        System.out.println("\nFormatted String: " + formatted);

        // 12. Email Validation using contains(), startsWith(), endsWith()
        String email = "example@gmail.com";
        boolean isValid = email.contains("@") &&
                          email.startsWith("example") &&
                          email.endsWith(".com");

        System.out.println("\nEmail: " + email);
        System.out.println("Is Valid Email? " + isValid);
    }
}