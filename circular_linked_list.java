public class circular_linked_list {
    public static void main(String[] args) {
        CLL circular=new CLL();
        circular.insert(929);
        circular.insert(22);
        circular.insert(12);
        circular.insert(2322);
        circular.display();
        circular.delete(22);
        circular.display();
    }
}
