// https://www.geeksforgeeks.org/problems/lru-cache/1

import java.util.HashMap;
import java.util.Map;

class Node{
    int key;
    int value;
    Node next;
    Node prev;
    
    Node(int key,int value){
        this.key=key;
        this.value=value;
        this.next=null;
        this.prev=null;
    }
}




class LRUCache {
    private int capacity;
    private Map<Integer,Node> cacheMap;
    private Node head;
    private Node tail;
    
    LRUCache(int capacity) {
        // code here
        this.capacity=capacity;
        this.cacheMap=new HashMap<>();
        this.head=new Node(-1,-1);
        this.tail=new Node(-1,-1);
        this.head.next=this.tail;
        this.tail.prev=this.head;
        
    }

    public  int get(int key) {

        
        //  code here
        if(!cacheMap.containsKey(key)){
            return -1;
        }
        Node node=cacheMap.get(key);
        remove(node);
        add(node);
        return node.value;
        
        
    }

        
    public void put(int key, int value) {
        //  code here
        
        if(cacheMap.containsKey(key)){
            Node oldNode=cacheMap.get(key);
            remove(oldNode);
        }
        Node node=new Node(key,value);
        cacheMap.put(key,node);
        add(node);
        
        if(cacheMap.size()>capacity){
            Node nodeToDelete=tail.prev;
            remove(nodeToDelete);
            cacheMap.remove(nodeToDelete.key);
        }
    }
    
    private void add(Node node){
        Node nextNode=head.next;
        head.next=node;
        node.prev=head;
        node.next=nextNode;
        nextNode.prev=node;
    }
    
    private void remove(Node node){
        Node prevNode=node.prev;
        Node nextNode=node.next;
        prevNode.next=nextNode;
        nextNode.prev=prevNode;
    }
}
