import java.util.ArrayList;

public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T>{
    public OrderedArrayList(){
        super();
    }

    public OrderedArrayList(int startingCapacity){
        super(startingCapacity);
    }

    public boolean add(T element){
        for(int i = 0; i < size(); i++){
            int x = element.compareTo(data.get(i));
            if(x > 0){
                super.add(i, element);
            }
        }return true;
    }

    public void add(int index, T element){
        for(int i = 0; i < size(); i++){
            int x = element.compareTo(data.get(i));
            if(x > 0){
                super.add(i, element);
            }
        }
    }

    public T set(int index, T value){
        remove(index);
        add(value);
        return value;
    }
}