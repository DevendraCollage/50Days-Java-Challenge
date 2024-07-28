/*
    1
   A B
  2 3 4
 C D E F   
 */

public class Pattern1 {
    public static void main(String[] args) {

        char[][] pattern = {
                { ' ', ' ', ' ', '1', ' ', ' ', ' ' },
                { ' ', ' ', 'A', ' ', 'B', ' ', ' ' },
                { ' ', '2', ' ', '3', ' ', '4', ' ' },
                { 'C', ' ', 'D', ' ', 'E', ' ', 'F' },
        };

        for (char[] row : pattern) {
            for (char ch : row) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}
