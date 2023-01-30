// import java.util.*;

// class Node {
//     int value;
//     Node next;

//     public Node(int value, Node next){
//         this.value = value;
//         this.next = next;
//     }
// }

// class LinkedList {
//     Node head, curr;

//     public LinkedList() {

//     }

//     public void add(int value) {
//         if (head == null) {
//             head = new Node(value, null);
//             curr = head;
//         } else {
//             Node temp = new Node(value, null);
//             curr.next = temp;
//             curr = temp;
//         }
//     }

//     public void print() {
//         Node temp = head;
//         while (temp != null) {
//             System.out.println(temp.value);
//             temp = temp.next;
//         }
//     }
// }

// class Test {
//     public static void main(String[] args) {
//         LinkedList list = new LinkedList();
//         list.add(1);
//         list.add(10);
//         list.add(20);
//         list.add(99);
//         list.add(13);
//         list.print();
//     }
// }