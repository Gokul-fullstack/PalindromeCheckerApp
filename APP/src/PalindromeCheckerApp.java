void main() {
    String input = "madam";

    LinkedList<Character> list = new LinkedList<>();

    for (char c : input.toCharArray())
        list.add(c);

    boolean isPalindrome = true;

    while (list.size() > 1) {
        if (list.removeFirst() != list.removeLast()) {
            isPalindrome = false;
            break;
        }
    }

    System.out.println("Input : " + input);
    System.out.println("Is Palindrome? : " + isPalindrome);
}