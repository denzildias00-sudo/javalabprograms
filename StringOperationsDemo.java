package lab2;

public class StringOperationsDemo {
    public static void main(String[] args) {

        // 1. String Creation and Basic Operations
        String str1 = "Hello";
        String str2 = new String("World");
        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);

        // 2. Length and Character Access
        System.out.println("\nLength of str1: " + str1.length());
        System.out.println("Character at index 1: " + str1.charAt(1));

        // 3. String Comparison
        String str3 = "hello";
        System.out.println("\nEquals: " + str1.equals(str3));
        System.out.println("Equals Ignore Case: " + str1.equalsIgnoreCase(str3));
        System.out.println("CompareTo: " + str1.compareTo(str3));

        // 4. String Searching
        String sentence = "Java Programming Language";
        System.out.println("\nIndex of 'Program': " + sentence.indexOf("Program"));
        System.out.println("Last Index of 'a': " + sentence.lastIndexOf('a'));
        System.out.println("Contains 'Java'? " + sentence.contains("Java"));

        // 5. Substring Operations
        System.out.println("\nSubstring (0-4): " + sentence.substring(0, 4));
        System.out.println("Substring from index 5: " + sentence.substring(5));

        // 6. String Modification
        String modified = sentence.replace("Java", "Python");
        System.out.println("\nAfter Replace: " + modified);
        System.out.println("Uppercase: " + sentence.toUpperCase());
        System.out.println("Lowercase: " + sentence.toLowerCase());

        // 7. Whitespace Handling
        String text = "   Welcome to Java   ";
        System.out.println("\nBefore Trim: '" + text + "'");
        System.out.println("After Trim: '" + text.trim() + "'");

        // 8. String Concatenation
        String concat = str1 + " " + str2;
        System.out.println("\nConcatenated String: " + concat);
        System.out.println("Using concat(): " + str1.concat(" ").concat(str2));

        // 9. String Splitting
        String fruits = "Apple,Banana,Mango";
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
        sb.delete(2, 6);
        System.out.println("\nStringBuilder Result: " + sb);

        // 11. String Formatting
        String name = "Denzil";
        int age = 20;
        String formatted = String.format("Name: %s, Age: %d", name, age);
        System.out.println("\nFormatted String: " + formatted);

        // 12. Validate Email using contains(), startsWith(), endsWith()
        String email = "example@gmail.com";

        boolean isValid = email.contains("@") &&
                          email.contains(".") &&
                          !email.startsWith("@") &&
                          email.endsWith(".com");

        System.out.println("\nEmail: " + email);
        System.out.println("Is valid email? " + isValid);
    }
}