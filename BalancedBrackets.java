// Input :- "{[()]}"
// Output :- Balanced Brackets 
// Input :- "{[[)]}"
// Output :- Unbalanced Brackets
import java.util.*;
public class BalancedBrackets{
  public static void main(String[] args) {
      String brackets = "{[()]}";
      Stack<Character> bracketList = new Stack<>();
      for (char bracketEle : brackets.toCharArray())
      {
          if ("{[(".contains(String.valueOf(bracketEle)))
          {
              bracketList.push(bracketEle);
          }
          else if (bracketEle == '}')
          {
              if (!bracketList.isEmpty() && bracketList.peek() == '{')
              {
                  bracketList.pop();
              } 
              else
                  break;
          } 
          else if (bracketEle == ']')
          {
              if (!bracketList.isEmpty() && bracketList.peek() == '[') 
              {
                  bracketList.pop();
              } 
              else
                  break;
          } 
          else if (bracketEle == ')') 
          {
              if (!bracketList.isEmpty() && bracketList.peek() == '(') 
              {
                  bracketList.pop();
              }
              else
                  break;
          }
      }
      System.out.println(bracketList);
      if (bracketList.isEmpty())
          System.out.println("Brackets are balanced");
      else
          System.out.println("Brackets are not balanced");
  }
}
