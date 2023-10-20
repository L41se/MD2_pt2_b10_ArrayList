package Demo;

public class MyNode<E> {
    public E data;
    public MyNode<E> link = null;

    MyNode(E data){
        this.data = data;
    }
}
