package DSA_Questions;

public class LL {
    public Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size = 0;
    }

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;
        if (tail == null) {
            tail = head;
        }
        size += 1;
    }

    public void insert(int val, int index) {
        if (index == 0) {

            insertFirst(val);
            return;
        }
        if (index == size) {
            insertLast(val);
            return;
        }
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        Node node = new Node(val, temp.next);
        temp.next = node;
    }

    public int deleteLast(){
        if(size<=1){
            return deleteFirst();
        }
        Node secondLast=get(size-2);
        int val=tail.value;
        tail=secondLast;
        tail.next=null;
        return val;
        
    }

    // public int deleteIndex(int index){
    //     if(index==0){
    //         return deleteFirst();
    //     }
    //     if(index==size-1){
    //         return deleteLast();
    //     }
    //     Node iNode=get(index-1);
        
    //     int val=prev.next.value;

    //     return val;


    // }

public Node get(int index){
    Node node =head;
    for(int i=0;i<index;i++){
        node=node.next;
    }
    return node;
}
    public int deleteFirst(){ 
        int val=head.value;
        head=head.next;
        if(head==null)
        tail=null;
        size--;
        return val;
    }   


    public void insertLast(int val) {
        if (tail == null) {
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + "->");
            temp = temp.next;
        }
        System.out.println("END");
    }

    private class Node {
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

    public static LL merge(LL first, LL second){
        Node f=first.head;
        Node s = second.head;
        LL ans= new LL();
        while(f!=null && s!=null){
            if(f.value<s.value){
                ans.insertLast(f.value);
                f=f.next;
            }else{
                ans.insertLast(s.value);
                s=s.next;
            }
        }
        while(f!=null){
            ans.insertFirst(f.value);
            f=f.next;
        }
        while(s!=null){
            ans.insertFirst(s.value);
            s=s.next;
        }
        return ans;
    }

    public void duplicates(){
        Node node =head;
        while(node.next!=null){
            if(node.value==node.next.value){
                node.next=node.next.next;
                size--;
            }else{
                node=node.next;
            }
        }
        tail=node;
        tail.next=null;
    }
}