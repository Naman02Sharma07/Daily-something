public class LL {
    private Node head;
    private Node tail;
    private int size;
    public LL(){
        this.size=0;
    }
    public void insertlast(int value){
        Node node=new Node(value);
        if(tail==null){
            insertfirst(value);
        }
        tail.next=node;
        tail=node;
        size++;
    }
    public void intsertbetween(int value,int index){
        if(index==0){
            insertfirst(value);
        }
        else if(index==size-1){
            insertlast(value);
        }
        Node node=new Node(value);
        Node prev=head;
        for(int i=1;i<index;i++){
            prev=prev.next;
        }
        node.next=prev.next;
        prev.next=node;
        size++;
    }
    public int deletefirst(){
        int val=head.value;
        head=head.next;
        if(head==null){
            tail=head;
            size--;
            return val;
        }
        size--;
        return val;
    }
    public void insertfirst(int value){
        Node node=new Node(value);
        node.next=head;
        head=node;
        if(tail==null){
            tail=head;
        }
        size++;
    }
    public Node get(int index){
        Node prev=head;
        for(int i=0;i<index;i++){
            prev=prev.next;
        }
        return prev;
    }
    public int deletelast(){
        if(size<=1){
            deletefirst();
        }
        Node secondLast=get(size-2);
        int val= tail.value;
        secondLast.next=null;
        tail=secondLast;
        size--;
        return val;
    }
    public int deleteindex(int index){
        if(index==0){
            deletefirst();
        }
        else if(index==size-1){
            deletelast();
        }
        Node prev=get(index-1);
        int val=prev.next.value;
        prev.next=prev.next.next;
        return val;
    }
    public int find(int index){
        Node temp=head;
        for(int i=1;i<index;i++){
            temp=temp.next;
        }
        return temp.value;
    }
    public Node findn(int value1){
        Node temp=head;
        while(temp!=null){
            if(temp.value==value1){
                return temp;
            }
            temp=temp.next;
        }
        return null;
    }
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.value+"->");
            temp=temp.next;
        }
        System.out.println("END");
    }
    private class Node{
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

}
