// https://www.geeksforgeeks.org/problems/operations-on-queue/1

class myQueue {
    public ArrayList<Integer> list;
    
    public myQueue() {
        // initialize your queue
        list=new ArrayList<>();
    }

    public void enqueue(int x) {
        // insert x into queue
        list.add(x);
    }

    public void dequeue() {
        // remove front element from queue
        list.remove(0);
    }

    public int getFront() {
        // return the front element of the queue
        if(isEmpty()) return -1;
        return list.get(0);
    }

    public int getRear() {
        // return the rear element of the queue
        if(isEmpty()) return -1;
        return list.get(list.size()-1);
    }

    public boolean isEmpty() {
        // check whether the queue is empty
        return list.size()==0;
    }

    public int size() {
        // return the size of the queue
        return list.size();
        
    }
}
