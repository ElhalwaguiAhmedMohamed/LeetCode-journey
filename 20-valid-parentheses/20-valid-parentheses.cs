public class Solution {
    public bool IsValid(string s) {
        var myStack = new Stack<char>();
        for(int i=0 ; i<s.Length ; i++){
            if(myStack.Count == 0){
            if(s[i]=='(' || s[i]=='{' || s[i]=='[') 
                myStack.Push(s[i]);
            else 
                return false;
        }else if(s[i]=='(' || s[i]=='{' || s[i]=='['){
                myStack.Push(s[i]);
        }else{
                if(myStack.Peek()=='(' && s[i]==')') myStack.Pop();
                else if(myStack.Peek()=='[' && s[i]==']') myStack.Pop();
                else if(myStack.Peek()=='{' && s[i]=='}') myStack.Pop();
                else return false;
            }
    }
        if(myStack.Count == 0) return true;
        return false;
}
}