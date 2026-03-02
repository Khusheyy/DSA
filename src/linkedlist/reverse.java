package linkedlist;

private class Node {
    int val;
    Node next;

    public Node(int val) {
        this.val = val;
    }
}

public class reverse {

    private Node head;
    private Node tail;
    //recursion reverse
    private void reverse(Node node){
     if(node == tail){
        head = tail;
        return;
     }
        reverse(node.next);
        tail.next = node;
        tail = node;
        tail.next = null;
    }

    private Node reverseinplace(Node node) {
        //inplace reverse
        while (head != null) {
            Node temp = head.next;// next node
            head.next = node; //null
            node = head;
            head = temp;
            //swaped
        }
        return node;

    }

}
