import java.util.NoSuchElementException;

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
            newNode.previous = tail;
        }
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

    public void insertFirst(int value){
        ListNode newNode = new ListNode(value);
        if (isEmpty()){
            tail = newNode;
        }else {
            head.previous = newNode;
        }
        newNode.next = head;
        head = newNode;
        length++;
    }

    public ListNode deleteFirst(){
        if (isEmpty()){
            throw new NoSuchElementException();
        }
        ListNode temp = head;
        if (head == tail){
            tail = null;
        }else {
            head.next.previous = null;
        }
        head = head.next;
        temp.next = null;
        length--;
        return temp;
    }

    public ListNode deleteLast(){
        if (isEmpty()){
            throw new NoSuchElementException();
        }
        ListNode temp = tail;
        if (tail == head){
            head = null;
        }else {
            tail.previous.next = null;
        }
        tail = tail.previous;
        temp.previous = null;
        length--;
        return temp;
    }
    public static void main(String[] args) {

        Main sll = new Main();
        sll.insertLast(1);
        sll.insertLast(10);
        sll.insertLast(15);
        sll.insertLast(25);
        try{
            Thread.sleep(2000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        //sll.displayForward();
        //sll.deleteFirst();
        sll.deleteLast();
        sll.displayForward();


    }
}