public class CLL {
    public Node head;
    public Node tail;

    public CLL() {
        this.head = null;
        this.tail = null;
    }

    public void insert(int value){
        Node node=new Node(value);
        if(head==null){
            head=node;
            tail=node;
            return;
        }
        tail.next=node;
        node.next=head;
        tail=node;

    }
    public void display(){
        Node temp=head;
        if(head!=null){
            do{
                System.out.print(temp.value+"->");
                temp=temp.next;
            }while (temp.next!=head);
        }
        System.out.println("END");
    }
    public void delete(int val){
        Node temp=head;
        if(head==null){
            return;
        }
        if (temp.value == val) {
            tail=head;
            head=head.next;
        }
        do{
            Node node=temp.next;
            if(node.value==val){
                temp.next=node.next;
                break;
            }
            temp=temp.next;
        }while(temp!=head);
    }

    private class Node{
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }
}
