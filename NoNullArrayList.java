import java.util.ArrayList;

public class NoNullArrayList<T> extends ArrayList<T>{
    
    public NoNullArrayList(){
        super();
    }

    public NoNullArrayList(int s){
        super(startingCapacity);
    }

    public boolean add(T element){
        if(element == null){
            throw new IllegalArgumentException("Null cannot be taken as a value");
        }
        super.add(element);
        return true;
    }

    public void add(int index, T element){
        if(element == null){
            throw new IllegalArgumentException("Null cannot be taken as a value");
        }
        super.add(index, element);    
    }

    public T set(int index, T element){
        if(element == null){
            throw new IllegalArgumentException("Null cannot be taken as a value");
        }
        super.set(index, element);
        return element;
    }
}