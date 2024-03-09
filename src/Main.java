public class Main {

    private ListNode head;
    private ListNode tail;
    private int length;

    private class ListNode{
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

    public static void main(String[] args) {


    }
}