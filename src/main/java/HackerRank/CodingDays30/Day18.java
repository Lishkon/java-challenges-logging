package HackerRank.CodingDays30;

import java.util.LinkedList;
import java.util.Scanner;

public class Day18 {

    /*
     * Two instance variables: one for your Stack, and one for your Queue.
     * A void pushCharacter(char ch) method that pushes a character onto a stack.
     * A void enqueueCharacter(char ch) method that enqueues a character in the Queue instance variable.
     * A char popCharacter() method that pops and returns the character at the top of the Stack instance variable.
     * A char dequeueCharacter() method that dequeues and returns the first character in the Queue instance variable.
     * */

    LinkedList queue;
    LinkedList stack;

    // Making a queue
    public Day18() {
        queue = new LinkedList();
        stack = new LinkedList();
    }


    public void pushCharacter(char ch) {
        stack.push(ch);
    }

    public void enqueueCharacter(char ch) {
        queue.add(ch);
    }

    public char dequeueCharacter() {
        return (char) queue.remove(0);
    }

    public char popCharacter() {
        return (char) stack.pop();
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Solution object:
        Day18 p = new Day18();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length/2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;
                break;
            }
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println( "The word, " + input + ", is "
                + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
    }
}
