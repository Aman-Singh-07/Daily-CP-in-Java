// https://www.codechef.com/problems/BBXJG01

class StackUsingQueues {
    public Queue<Integer> q1=new LinkedList<>();
    public Queue<Integer> q2=new LinkedList<>();
    public void push(int x) {
        q1.add(x);
    }
    
    public int pop() {
        if(q1.isEmpty()) return -1;
        while(q1.size()>1){
            q2.add(q1.poll());
        }
        int x=q1.poll();
        Queue<Integer> temp=q1;
        q1=q2;
        q2=temp;
        return x;
    }
    
    public int top() {
        if(q1.isEmpty()) return -1;
        while(q1.size()>1){
            q2.add(q1.poll());
        }
        int x=q1.peek();
        q2.add(q1.poll());
        Queue<Integer> temp=q1;
        q1=q2;
        q2=temp;
        return x;
    }
    
    public boolean empty() {
        return q1.isEmpty();
    }
    
}
