import java.util.ArrayList;

public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T>{
    public OrderedArrayList(){
        super();
    }

    public OrderedArrayList(int startingCapacity){
        super(startingCapacity);
    }

    public boolean add(T element){
        if(element == null){
            throw new IllegalArgumentException("Null cannot be taken as a value");
        }
        super.add(correctIndex(element), element);
        return true;
    }

    public void add(int index, T element){
        if(element == null){
            throw new IllegalArgumentException("Null cannot be taken as a value");
        }
        super.add(correctIndex(element), element);
    }

    public T set(int index, T value){
        if(value == null){
            throw new IllegalArgumentException("Null cannot be taken as a value");
        }
        remove(index);
        add(value);
        return value;
    }

    public int correctIndex(T element){
        int temp = 0;
        for(int i = 0; i < super.size(); i++){
            if(element.compareTo(super.get(i)) == -1){
                temp = i;
                break;
            }
        }
        return temp;
    }
}