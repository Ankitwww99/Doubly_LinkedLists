class Node{
    public int data;
    public Node previous;
    public Node next;

    public Node() {
        data = 0;
        previous = null;
        next = null;
    }
    public Node(int data, Node previous, Node next) {
        this.data = data;
        this.previous = previous;
        this.next = next;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getPrevious() {
        return previous;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
class mylist{
    Node start;
    Node tail;

    public mylist() {
        start = null;
        tail = null;
    }

    public void Insert(int val){
        Node n=new Node();
        n.setData(val);
        Node temp=start;
        if(temp==null){
            start=n;
        }
        else {
            while (temp.getNext() != null){
                temp = temp.getNext();
            }
            temp.setNext(n);
            n.setPrevious(temp);
        }
    }

    public void InsertBegn(int val){
        Node n;
        n=new Node();
        n.setData(val);
        n.setNext(start);
        start.setPrevious(n);
        start=n;

    }

    public boolean isEmpty(){
        if(start==null)
            return true;
        return false;
    }

    public void deletelast(){
        tail=tail.getPrevious();
        tail.setNext(null);
    }
    public void deletestart(){
        start=start.getNext();
        start.setPrevious(null);
    }
    public int count(){
        Node temp=start;
        int c=0;
        while(temp!=null){
            c++;
            temp=temp.getNext();
        }
        return c;
    }
    public void display(){
        Node temp=start;
        if(isEmpty()){
            System.out.println("empty list");
        }
        else{
            while(temp!=null){
                System.out.println(temp.data);
                temp=temp.getNext();
            }
        }
    }
    public void search(int val){
    }
}
public class dob{
    public static void main(String[] args) {
        mylist obj= new mylist();
        obj.Insert(12);
        obj.Insert(13);
        obj.Insert(15);
        obj.Insert(17);
        obj.InsertBegn(56);
        obj.display();
        System.out.println("count="+obj.count());
        obj.deletestart();
        System.out.println("delete start");
        obj.display();
    }
}