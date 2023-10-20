package Demo;

public class Demo<E> {
    public MyNode<E> head = null;
    public MyNode<E> tail = null;

    public int size = 0;

    void insertFirstNode(E data){
        MyNode<E> node = new MyNode<>(data);
        if (this.head == null){
            this.head = node;
            this.tail = node;
        } else {
            node.link = this.head;
            this.head = node;
        }
        this.size++;
    }
    public void readList(){
        MyNode<E> currentNode = this.head;
        while (currentNode!= null){
            System.out.println(currentNode.data);
            currentNode = currentNode.link;
        }
    }
    public void insertLastNode(E data){
        MyNode<E> node = new MyNode<>(data);
        if (this.head == null){
            this.head = node;
            this.tail = node;
        } else {
            this.tail.link = node;
            this.tail = node;
        }
        this.size++;
    }
    public void removeList(int index){
        int i = 0;
        MyNode<E> previous = this.head;
        MyNode<E> current = this.head;

        while (i < index){
            previous = current;
            current = current.link;
            i++;
        }

        previous.link = current.link;
        size--;
    }
    public void insert(E data, int index){
        MyNode<E> node = new MyNode<E>(data);
        int i = 0;
        MyNode<E> previous = this.head;
        MyNode<E> current = this.head;

        while (i < index){
            previous = current;
            current = current.link;
            i++;
        }
        previous.link = node;
        node.link = current;
        size++;
    }
}
