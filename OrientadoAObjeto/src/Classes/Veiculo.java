package Classes;
import java.util.Stack;
import java.util.Scanner;
public class Veiculo {
    public static void main(String[] args) {
        

        Scanner  c = new Scanner(System.in);

       
                    c.close();

    }
    
    public static boolean isValid(char[] charArray) {
        Stack<Character> container = new Stack<Character>();
    
        for (char c : charArray) {
    
            if (c == ' ') {
                continue;
            }
    
            if (c == '(' || c == '{' || c == '[') {
                container.push(c);
            } else if (c == ')' && container.peek() == '(' 
                    || (c == '}' && container.peek() == '{')
                    || (c == ']' && container.peek() == '[')) {
                container.pop();
            } else {
                return false;
            }
          
        }
    
        return container.isEmpty();
    }
    
    }
    
    

