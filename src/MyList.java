public class MyList<T> {
    private int size;
    private int capacity;
    private T[] data;

    public MyList() {
        this(10);
    }

    public MyList(int capacity) {
        this.size = 0;
        this.capacity = capacity;
        this.data = (T[]) new Object[capacity];
    }

    public int size() {
        int count=0;
        for(int i=0;i<data.length;i++){
            if(data[i]!=null){
                count++;
            }
        }
        return count;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public void add(T data) {
        if (this.size == this.capacity) {
            this.capacity *= 2;
            T[] newData = (T[]) new Object[this.capacity];
            System.arraycopy(this.data, 0, newData, 0, this.size);
            this.data = newData;
        }
        this.data[this.size++] = data;
    }

    public T get(int index){
        if(index < 0 || index >= this.size){
            return null;
        }
        return this.data[index];
    }

    public T remove(int index){
        if(index < 0 || index >= this.size){
            return null;
        }
        T removedElement = this.data[index];
        for(int i = index; i < this.size-1;i++){
            this.data[i] = this.data[i+1];
        }
        this.data[--this.size] = null;
        return removedElement;
    }

    public void set(int index, T data){
        if(index < 0 || index >= this.size){
            throw new IndexOutOfBoundsException();
        }
        this.data[index] = data;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < this.size; i++) {
            sb.append(this.data[i]);
            if (i != this.size - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public int indexOf(T data){
        for(int i=0;i<size();i++){
            if(data.equals(this.data[i])){
                return i;
            }
        }
        return -1;
    }

    public int lastIndexOf(T data){
        for(int i=size()-1;i>=0;i--){
            if(data.equals(this.data[i])){
                return i;
            }
        }
        return -1;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public T[] toArray() {
        T[] result = (T[]) new Object[size()];
        for(int i=0;i<size;i++){
            result[i] = this.data[i];
        }
        return result;
    }

    public void clear(){
        size = 0;
        data = (T[]) new Object[size];
    }

    public MyList<T> sublist(int start, int finish){
        if(start<0 || finish > size() || start > finish) {
            throw new IndexOutOfBoundsException();
        }
        MyList<T> result = new MyList<>(finish - start);
        for (int i = start; i < finish; i ++){
            result.add(this.data[i]);
        }
        return result;
    }

    public boolean contains(T data){
        return indexOf(data) != -1;
    }
    
}
