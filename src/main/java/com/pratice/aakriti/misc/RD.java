package com.pratice.aakriti.misc;

import java.util.HashMap;

public class RD {

    public Node removeDup(Node head){
        HashMap<Integer, Integer> ht = new HashMap<Integer, Integer>();
        if(head==null){
            return null;
        }
        Node currNode = head.next;
        Node prevNode = head;
        Node temp; //keeping it so that last node would be eligible for garbage collection
        ht.put(head.data, 1);
        while(currNode!=null){
            int data = currNode.data;
            if(ht.containsKey(data)){
                prevNode.next = currNode.next;
                temp= currNode;
                currNode = currNode.next;
                temp.next = null;
            }else{
                ht.put(data, 1);
                prevNode = currNode;
                currNode = currNode.next;
            }
        } return head;
    }
    public void display(Node head){
        Node n=head;
        while(n!=null){
            System.out.print("->" + n.data);
            n=n.next;
        }
    }
    public static void main(String args[]){
        Node n = new Node(2);
        n.next = new Node(2);
        n.next.next = new Node(2);
        n.next.next.next = new Node(3);
        n.next.next.next.next = new Node(4);
        n.next.next.next.next.next = new Node(4);
        n.next.next.next.next.next.next = new Node(2);
        System.out.print("Original List : ");
        RD rm = new RD();
        rm.display(n);
        System.out.print("\n Updated List: ");
        Node x =rm.removeDup(n);
        rm.display(x);
    }
}
class Node{
    int data;
    Node next;
    public Node(int data){
        this.data = data;
        next = null;
    }
}