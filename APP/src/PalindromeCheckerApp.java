void main() {
    String input = "noon";

    Stack<Character> stack = new Stack<>();

    // Push all characters
    for (char c : input.toCharArray()) {
        stack.push(c);
    }

    boolean isPalindrome = true;

    // Pop and compare
    for (char c : input.toCharArray()) {
        if (c != stack.pop()) {
            isPalindrome = false;
            break;
        }
    }

    System.out.println("Input : " + input);
    System.out.println("Is Palindrome? : " + isPalindrome);
}