// Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

// An input string is valid if:

// Open brackets must be closed by the same type of brackets.
// Open brackets must be closed in the correct order.
// Every close bracket has a corresponding open bracket of the same type.

// 1. Initialization:

// The code creates an empty stack leftSymbols to store opening brackets.
// 2. Iteration:

// The code iterates through each character c in the string s:

// Iteration 1:

// Character c: [.
// Since c is an opening bracket ([), it's pushed onto the stack leftSymbols.
// Stack now: [.
// Iteration 2:

// Character c: ].
// Since c is a closing bracket (]), the code checks if the stack is empty. It's not, as [ is present.
// The code then checks the top element of the stack (leftSymbols.peek()), which is [.
// ] matches the opening [, so they are a valid pair and are popped from the stack.
// Stack now: empty.
// Iteration 3:

// Character c: {.
// Similar to [, this opening bracket { is pushed onto the stack.
// Stack now: {.
// Iteration 4:

// Character c: }.
// Following the same logic as ], the code checks the stack and the top element ({ ).
// } matches the opening {, so they are popped.
// Stack now: empty.
// Iteration 5 & 6:

// Characters c: ( and ).
// The process repeats – ( is pushed, then ) pops it as they form a valid pair.
// Stack remains empty.
// 3. Final Check:

// After processing the entire string, the code checks if the stack leftSymbols is empty. In this case, the stack is empty because all brackets were matched and popped correctly.

// Therefore, the code returns true, indicating that the string s = "[](){}" is a valid parentheses string.

import java.util.Stack;

import javax.xml.stream.events.Characters;

public class ValidParentheses {
  public boolean isValid(String s) {
    Stack<Character> leftSymbol = new Stack<>();
    for (char c : s.toCharArray()) {
      if (c == '(' || c == '{' || c == '[') {
        leftSymbol.push(c);
      } else if (c == ')' && !leftSymbol.isEmpty() && leftSymbol.peek() == '(') {
        leftSymbol.pop();
      } else if (c == ']' && !leftSymbol.isEmpty() && leftSymbol.peek() == '[') {
        leftSymbol.pop();
      } else if (c == '}' && !leftSymbol.isEmpty() && leftSymbol.peek() == '{') {
        leftSymbol.pop();
      } else {
        return false;
      }
    }
    return leftSymbol.isEmpty();
  }
  
  public static void main(String args[]) {
    ValidParentheses validParentheses = new ValidParentheses();
    System.out.println(validParentheses.isValid("([]"));
  }
}
