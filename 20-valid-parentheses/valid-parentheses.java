class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        Map<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');
        for(int i = 0; i< s.length(); i++){
            if(map.containsKey(s.charAt(i))){
                st.push(s.charAt(i));
            }else if(!st.isEmpty() && s.charAt(i) == map.get(st.peek())){
                st.pop();
            }else{
                return false;
            }
        }
        return st.isEmpty();
    }
}