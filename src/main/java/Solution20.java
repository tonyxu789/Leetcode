import java.util.Stack;

public class Solution20 {

    public boolean isValid(String s) {
        char[] chars = s.toCharArray();
        if(chars.length == 0){
            return true;
        }else{
            Stack<Character> stack = new Stack<>();
            for(int i=0;i<chars.length;i++){
                if(chars[i]=='('||chars[i]=='['||chars[i]=='{'){
                    stack.push(chars[i]);
                }else if(chars[i]==')'){
                    if(!stack.empty()&&stack.peek()=='('){
                        stack.pop();
                    }else{
                        return false;
                    }
                }else if(chars[i]==']'){
                    if(!stack.empty()&&stack.peek()=='['){
                        stack.pop();
                    }else{
                        return false;
                    }

                }else if(chars[i]=='}'){
                    if(!stack.empty()&&stack.peek()=='{'){
                        stack.pop();
                    }else{
                        return false;
                    }

                }else {
                    return false;
                }
            }

            if(stack.empty()){
                return true;
            }else{
                return false;
            }
        }
    }
}
