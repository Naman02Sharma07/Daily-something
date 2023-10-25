public class DLL {
    private Node head;
    public void display(){
        Node temp=head;
        Node last=null;
        while(temp!=null){
            System.out.print(temp.value+" -> ");
            last=temp;
            temp=temp.next;
        }
        System.out.println("END");
        System.out.println();
        System.out.println();
//        while(last!=null){
//            System.out.print(last.value+" <- ");
//            last=last.prev;
//        }
//        System.out.println("START");
    }
    public void insertfirst(int value){
        Node node =new Node(value);
        node.next=head;
        node.prev=null;
        if(head!=null){
            head.prev=node;
        }
        head=node;

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
    public void insertinbetween(int after,int value){
        Node p=findn(after);
        if(p==null){
            System.out.println("no node is present with this vakue");
            return;
        }
        Node node=new Node(value);
        node.prev=p;
        node.next=p.next;
        p.next=node;
        if(node.next!=null){
            node.next.prev=node;
        }
    }
    public void insertlast(int value){
        Node node=new Node(value);
        if(head==null){
            node.prev=null;
            head=node;
            return;
        }
        node.next=null;
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=node;
        node.prev=temp;
//        node.next=null;

    }


    private class Node{
        int value;
        Node prev;
        Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node prev, Node next) {
            this.value = value;
            this.prev = prev;
            this.next = next;
        }
    }
}
