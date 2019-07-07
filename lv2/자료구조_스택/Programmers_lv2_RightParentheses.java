import java.util.Stack;

class Programmers_lv2_RightParentheses {
    boolean solution(String s) {
    	int length = s.length();
    	Stack<Character> openBracket = new Stack<Character>();
    	
    	
    	for(int i=0; i<length; i++)
    	{
    		if(s.charAt(i) == '(') {
    			openBracket.push('(');
    		}
    		else {
    			if(!openBracket.isEmpty()) openBracket.pop();
    			else return false;
    		}
    	}
    	
    	
    	return openBracket.isEmpty();
    }
} 