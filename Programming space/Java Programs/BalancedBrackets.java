import java.util.*;
public class BalancedBrackets{

    public String brackerBalanceCheck(String iputString){
        Stack<Character> bracketStack = new Stack<>();
        Map<Character,Character> bracketMap = Map.of(')','(',']','[','}','{');
        for(char bracket: bracketStack){
            if(bracketMap.containsValue(bracket)){
                bracketStack.add(bracket);
            }
            else if(bracketMap.containsKey(bracket)){
                if(!bracketStack.isEmpty() && bracketStack.peek().equals(bracketMap.get(bracket)))
                    bracketStack.pop();
                else
                    return "Unbalanced Brackets";
            }
        }
        if(bracketStack.isEmpty())
            return "Balanced Brackets";
        else
            return "Unbalanced Brackets";
    }

  public static void main(String[] args) {
    BalancedBrackets checker = new BalancedBrackets();
    String brackets = "{[()]}";
    String result = checker.brackerBalanceCheck(brackets);
    System.out.println(result);
  }
}

  
