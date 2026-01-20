// https://www.geeksforgeeks.org/problems/implement-undo-redo/1

class Solution {
    private StringBuilder sb;
    private Stack<Character> undo;
    private Stack<Character> redo;

    public Solution() {
        sb=new StringBuilder();
        undo=new Stack<>();
        redo=new Stack<>();
    }

    public void append(char x) {
        sb.append(x);
        undo.push(x);
        redo.clear(); 
    }
    
    public void undo() {
        if(!undo.isEmpty()){
            char last=undo.pop();
            sb.deleteCharAt(sb.length()-1);
            redo.push(last);
        }
    }

    public void redo(){
        if(!redo.isEmpty()){
            char last=redo.pop();
            sb.append(last);
            undo.push(last);
        }
    }

    public String read() {
        return sb.toString();
    }
}
