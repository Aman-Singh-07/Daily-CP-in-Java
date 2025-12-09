// https://leetcode.com/problems/goal-parser-interpretation/description/

class Solution {
    public String interpret(String command) {
        while(command.contains("()")){
            command=command.replace("()","o");
        }
        while(command.contains("(al)")){
            command=command.replace("(al)","al");
        }
        return command;
    }
}
