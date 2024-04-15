import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Exemple 1:
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(4);

        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(3);
        list2.next = new ListNode(4);

        ListNode result = solution.mergeTwoLists(list1, list2);
        printList(list1);
        printList(list2);
        printList(result);

        // Example 2:
        ListNode list3 = null;
        ListNode list4 = null;
        ListNode result2 = solution.mergeTwoLists(list3, list4);
        printList(list3);
        printList(list4);
        printList(result2);

        // Exemple 3:
        ListNode list5 = null;
        ListNode list6 = new ListNode(0);
        ListNode result3 = solution.mergeTwoLists(list5, list6);
        printList(list5);
        printList(list6);
        printList(result3);
    }
    public static void printList(ListNode head) {
        System.out.print("[");
        while (head != null) {
            System.out.print(head.val);
            if (head.next != null) {
                System.out.print(", ");
            }
            head = head.next;
        }
        System.out.println("]");
    }

}
