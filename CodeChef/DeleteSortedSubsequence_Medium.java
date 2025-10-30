// https://www.codechef.com/START210C/problems/DELSORTSUB

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            int n=input.nextInt();
            String s=input.next();
            Stack<Character> stack=new Stack<>();
            for (char ch:s.toCharArray()){
                if (!stack.isEmpty() && stack.peek()=='0' && ch=='1'){
                    stack.pop();
                } else {
                    stack.push(ch);
                }
            }
            int res=0;
            while(!stack.isEmpty()){
                char top=stack.pop();
                while(!stack.isEmpty() && stack.peek()==top){
                    stack.pop();
                }
                res++;
            }

            System.out.println(res);
        }
    }
}
