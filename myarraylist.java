import java.util.Arrays;
import java.lang.Double;
import java.lang.Integer;

public class myarraylist <arr extends Double & Integer> {
    private int size;
    private arr[]element;
    public int size(){
        return size;
    }
    public boolean isEmpty(){
        return size == 0;
    }
    public myarraylist(){
        this(10);
    }
    public myarraylist(int a) {
        if (a < 0) {
            try{
                throw new Exception();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        this.element= (arr[]) new Object[a];
    }
    public void check(int index){
        if(index>=size||index<0){
            try{
                throw new Exception();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
    public arr get(int index){
        check(index);
        return element[index];
    }
    public void set(int index,arr value){
        check(index);
        element[index]= value;
    }
    public void enlarge(int capacity){
        if(capacity>element.length){
            int newcapcity=element.length*2+1;
            if(capacity>newcapcity){
                newcapcity=capacity;
            }
            element= Arrays.copyOf(element,capacity);
        }
    }
    public void add(arr value){
        enlarge(size+1);
        element[size]=value;
        size++;
    }
    public void add(int index,arr value){
        enlarge(size+1);
        for (int i =size;i>index;i--){
            element[i]=element[i-1];
        }
        element[index]=value;
    }
    public void remove(int index){
        check(index);
        for (int i = index;i<size-1;i++){
            element[i]=element[i+1];
        }
        size--;
    }
}
