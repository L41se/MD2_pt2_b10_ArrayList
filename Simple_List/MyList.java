package Simple_List;

import java.util.Arrays;

public class MyList {
    private int size;
    private int default_capacity;
    private Object elements[];

    public MyList(){
        elements = new Object[default_capacity];
    }

    public void EnsureCapa(){
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    public void add(Integer e){
        if (size == elements.length){
            EnsureCapa();
        }
        elements[size++] = e;
    }

    public Integer get(int i){
        if (i >= size || i < 0){
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i );
        }
        return (Integer) elements[i];
    }

}
