void main() {
    String input = "refer";

    Deque<Character> deque = new ArrayDeque<>();

    for (char c : input.toCharArray())
        deque.add(c);

    boolean isPalindrome = true;

    while (deque.size() > 1) {
        if (deque.removeFirst() != deque.removeLast()) {
            isPalindrome = false;
            break;
        }
    }

    System.out.println("Input : " + input);
    System.out.println("Is Palindrome? : " + isPalindrome);
}