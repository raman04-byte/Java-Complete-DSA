package DSA_Questions;

public class LLMain {
    public static void main(String[] args) {
        LL list=new LL();

        list.insertFirst(4);
        list.insertFirst(3);
        list.insertFirst(54);
        list.insertFirst(74);
        list.insertLast(99);
        list.insert(4, 3);
        System.out.println(list.deleteFirst());
        list.display();
    }
}
