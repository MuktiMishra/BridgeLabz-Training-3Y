class PalindromeChecker {
    String text;

    PalindromeChecker(String text) {
        this.text = text;
    }

    boolean isPalindrome() {
        String cleaned = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int left = 0, right = cleaned.length() - 1;
        while (left < right) {
            if (cleaned.charAt(left) != cleaned.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    void displayResult() {
        if (isPalindrome()) {
            System.out.println(text + " is a Palindrome.");
        } else {
            System.out.println(text + " is NOT a Palindrome.");
        }
    }
}

public class PalindromeCheckerTest {
    public static void main(String[] args) {
        PalindromeChecker pc1 = new PalindromeChecker("Madam");
        pc1.displayResult();

        PalindromeChecker pc2 = new PalindromeChecker("Hello");
        pc2.displayResult();
    }
}
