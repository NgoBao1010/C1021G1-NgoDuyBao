//package ss10_DSA_List.Bai_tap;
//
//public class MyLinkedList<E> {
//    private Node head;
//    private int numNodes;
//
//    public MyLinkedList(){
//        head = new Node(head.data);
//    }
//    private class Node{
//        private Node next;
//        private Object data;
//        public Node(Object data){
//            this.data = data;
//        }
//        public Object getData(){
//            return this.data;
//        }
//
//    }
//    public void add(int index,E element){
//        Node temp = head;
//        Node holder;
//
//        for (int i = 0;i < index-1 && temp.next != null;i++){
//            temp = temp.next;
//        }
//        holder = temp.next;
//        temp.next = new Node();
//        temp.next.next = holder;
//        numNodes++;
//    }
//    public void addFirst(E e){
//
//    }
//    public void addLast(E e){
//
//    }
//    public E remove(int index){
//
//    }
//    public boolean remove(Object e){
//
//    }
//    public int size(){
//
//    }
//    public E clone(){
//
//    }
//    public boolean contains(E e){
//
//    }
//    public int indexOf(E o){
//
//    }
//    public boolean add(E e){
//
//    }
//    public void ensureCapa(int minCapa){
//
//    }
//    public E get(int i){
//
//    }
//    public E getFirst(){
//
//    }
//    public E getLast(){
//
//    }
//    public void clear(){
//
//    }
//
//}
