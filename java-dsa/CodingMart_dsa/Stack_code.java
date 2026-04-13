import java.util.Stack;

public class Stack_code {
    public static void main(String[] args) {

        String s = "12(bc)";

        Stack<Integer> numStack = new Stack<>();
        Stack<Character> charStack = new Stack<>();

        for (int j = 0; j < s.length(); j++) {
            char ch = s.charAt(j);

            // 👉 If digit → build full number
            if (Character.isDigit(ch)) {
                int num = 0;

                while (j < s.length() && Character.isDigit(s.charAt(j))) {
                    num = num * 10 + (s.charAt(j) - '0');
                    j++;
                }

                j--; // step back
                numStack.push(num);
            }

            // 👉 If closing bracket → process substring
            else if (ch == ')') {
                String res = "";

                // pop until '('
                while (!charStack.isEmpty() && charStack.peek() != '(') {
                    res = charStack.pop() + res;
                }

                charStack.pop(); // remove '('

                int repeat = numStack.pop();

                StringBuilder temp = new StringBuilder();
                for (int k = 0; k < repeat; k++) {
                    temp.append(res);
                }

                // push expanded string back
                for (char c : temp.toString().toCharArray()) {
                    charStack.push(c);
                }
            }

            // 👉 Otherwise push character
            else {
                charStack.push(ch);
            }
        }

        // 👉 Build final answer
        StringBuilder ans = new StringBuilder();
        while (!charStack.isEmpty()) {
            ans.insert(0, charStack.pop());
        }

        System.out.println(ans.toString());
    }
}