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
        if(super.isEmpty() == true){
            super.add(element);
        }
        else if(element.compareTo(super.get(super.size() - 1)) == 1){
            super.add(element);
        }else{
        super.add(correctIndex(element), element);
        }
        return true;
    }

    public void add(int index, T element){
        if(element == null){
            throw new IllegalArgumentException("Null cannot be taken as a value");
        }
        if(super.isEmpty() == true){
            super.add(element);
        }
        else if(element.compareTo(super.get(super.size() - 1)) == 1){
            super.add(element);
        }else{
        super.add(correctIndex(element), element);
        }
    }

    public T set(int index, T value){
        if(value == null){
            throw new IllegalArgumentException("Null cannot be taken as a value");
        }
        T x = super.get(index);
        remove(index);
        add(value);
        return x;
    }

    public int correctIndex(T element){
        int x = 0;
        for(int i = 0; i < super.size(); i++){
            if(element.compareTo(super.get(i)) == 1){
            }else if(element.compareTo(super.get(i)) == 0){
                x = i;
                break;
            }
            else if(element.compareTo(super.get(i)) == -1){
                x = i;
                break;
            }
        }return x;
    }
}