package ss11_DSA_Stack_Queue.Bai_tap.B2;

public class Solution {
    public static void enQueue(Queue q,int value){
        Node temp = new Node();
        temp.data = value;
        if (q.front == null){
            q.front = temp;
        }else {
            q.rear.link = temp;
        }
        q.rear = temp;
        q.rear.link = q.front;
    }
    public static int deQueue(Queue q){
        if (q.front == null){
            System.out.println("Queue rỗng");
            return Integer.MIN_VALUE;
        }
        int value;
        if (q.front == q.rear){
            value = q.front.data;
            q.front = null;
            q.rear = null;
        }else {
            Node temp = q.front;
            value = temp.data;
            q.front = q.front.link;
            q.rear.link = q.front;
        }
        return value;
    }
    public static void displayQueue(Queue q){
        Node temp = q.front;
        System.out.print("Các phần tử trong Queue hình tròn là: ");
        while (temp.link != q.front){
            System.out.print(temp.data);
            temp = temp.link;
        }
        System.out.print(temp.data);
        System.out.println("");
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.front = q.rear = null;

        enQueue(q,10);
        enQueue(q,10);
        enQueue(q,1995);

        displayQueue(q);
        System.out.println("Xóa: " + deQueue(q));
        System.out.println("Xóa: " + deQueue(q));

        displayQueue(q);

        enQueue(q,6);
        enQueue(q,9);
        displayQueue(q);
    }
}
