public class Main {

    private ListNode head;
    private ListNode tail;
    private int length;

    private static class ListNode{
        private int data;
        private ListNode previous;
        private ListNode next;

        public ListNode(int data){
            this.data = data;
        }

    }

    public boolean isEmpty(){
        return length ==0;
    }

    public int length(){
        return length;
    }

    public void insertLast(int value){
        ListNode newNode = new ListNode(value);
        if (isEmpty()){
            head = newNode;
        }else {
            tail.next = newNode;
        }
        newNode.previous = tail;
        tail = newNode;
        length++;
    }

    public void displayForward(){
        if (head == null){
            return;
        }
        ListNode temp = head;
        while(temp!=null){
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.print("null");
    }

    public void displayBackward(){
        if (tail == null){
            return;
        }
        ListNode temp = tail;
        while(temp!=null){
            System.out.print(temp.data + "-->");
            temp = temp.previous;
        }
        System.out.print("null");
    }

    public static void main(String[] args) {

        Main sll = new Main();
        sll.insertLast(1);
        sll.insertLast(10);
        sll.insertLast(15);
        sll.insertLast(25);

        //sll.displayForward();
        sll.displayBackward();


    }
}