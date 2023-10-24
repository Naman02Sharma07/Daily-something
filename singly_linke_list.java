public class singly_linke_list {
    public static void main(String[] args) {
        LL single=new LL();
        single.insertfirst(939);
        single.insertfirst(88);
        single.insertfirst(676);
        single.insertfirst(823);
        single.display();
        single.insertlast(34);
        single.insertlast(4993);
        single.display();
        single.intsertbetween(234,2);
        single.display();
        single.deletefirst();
        System.out.println(single.deletefirst());
        single.display();
        System.out.println(single.deletelast());
        single.display();
        single.insertfirst(838);
        single.insertfirst(993);
        single.display();
        single.deleteindex(3);
        single.display();
        System.out.println(single.find(3));
        System.out.println(single.findn(34));
    }
}
