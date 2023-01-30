// // Implement an autocomplete system. That is, given a query string s and a set of all possible query strings, return all strings in the set that have s as a prefix.
// // For example, given the query string de and the set of strings [dog, deer, deal], return [deer, deal].
// // Hint: Try preprocessing the dictionary into a more efficient data structure to speed up queries.

// import java.util.*;
// public class AutoComplete {
//     public static String autoComplete(String[] array, int size, char srch) {
//         for(int i = 0; i < size; i++) {
//             char newStr = array[i].charAt(i);
//             if(newStr == srch) {
//                 return array[i];
//             }
//         }
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int size = sc.nextInt();
//         String[] array = new String[size];

//         for (int i = 0; i < size; i++) {
//             array[i] = sc.next();
//         }

//         System.out.println("Enter something to autocomplete: ");
//         char search = sc.next().charAt(0);
//         String result = autoComplete(array, size, search);
//         System.out.println("Result: " + result);
//         sc.close();
//     }
// }
