import java.util.Scanner;

public class SubstringExtractor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input: Read the string
        String inputString = sc.nextLine();
        
        // Input: Read the two integers
        int startIndex = sc.nextInt();
        int endIndex = sc.nextInt();
        
        // Extracting the substring
        String resultSubstring = inputString.substring(startIndex, endIndex + 1); // +1 to include endIndex
        
        // Output: Print the result
        System.out.println(resultSubstring);
        
        sc.close(); // Close the scanner
    }
}
