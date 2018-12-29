package HackerRank.CodingDays30;

import java.util.Scanner;

class Day15Node {
    int data;
    Day15Node next;
    Day15Node(int d) {
        data = d;
        next = null;
    }
}

public class Day15 {
    public static Day15Node insert(Day15Node head, int data) {
        //Complete this method

        if (head == null) {
            return new Day15Node(data);
        }
        if (head.next == null) {
            head.next = new Day15Node(data);
        } else {
            insert(head.next, data);
        }

        return head;
    }

    public static void display(Day15Node head) {
        Day15Node start = head;
        while(start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Day15Node head = null;
        int N = sc.nextInt();

        while(N-- > 0) {
            int ele = sc.nextInt();
            head = insert(head,ele);
        }
        display(head);
        sc.close();
    }

}
