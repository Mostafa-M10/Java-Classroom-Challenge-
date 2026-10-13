public class ArrayBag implements BagInterface {

    private String bag[];
    private int numberOfEntries;
    private static final int DEFAULT_CAPACITY = 100;

    public ArrayBag(){
        this(ArrayBag.DEFAULT_CAPACITY);
    }

    public ArrayBag(int capacity){
        this.bag = new String[capacity];
        this.numberOfEntries = 0;
    }




    public int getCurrentSize(){
        return this.numberOfEntries;
    }


    public boolean isEmpty(){
        return this.numberOfEntries == 0;
    }


    public boolean isArrayFull(){
        return this.numberOfEntries == this.bag.length;
    }


    public boolean addNewEntry(String newEntry){
        if(isArrayFull()) return false;
        else{
            this.bag[this.numberOfEntries++] = newEntry;
            return true;
        }
    }


    public String removeElementAt(int index){
        String result = null;
        if(!isEmpty() && index >= 0 && index < this.numberOfEntries){
            result = this.bag[index];
            this.bag[index] = this.bag[this.numberOfEntries - 1];
            this.bag[this.numberOfEntries - 1] = null;
            this.numberOfEntries--;

        }
        return result;
    }


    public String remove(){
        return removeElementAt(this.numberOfEntries -1);
    }

    public boolean remove(String anEntry){
        boolean found = false;
        int index = 0;
        while(!found && index <this.numberOfEntries -1) {
            if (this.bag[index].equals(anEntry)) found = true;
            else
                index++;
        }
        if (found) removeElementAt(index);

        return found;
    }


    public void clear(){
    while(!isEmpty()) remove();
    }

    public int getFrequencyOf(String anEntry){
        int count = 0;
        for(int i =0; i < this.numberOfEntries; i++){
            if(this.bag[i].equals(anEntry))
                count++;
        }
        return count;
    }

    public boolean contains(String anEntry){
        boolean found = false;
        int index = 0;
        while(!found && index < this.numberOfEntries){
            if(this.bag[index++].equals(anEntry))
                found = true;
        }
        return found;
    }

    public String toString(){
        String strResult = "Bag [\n";
        for(int i = 0; i < this.numberOfEntries; i++){
            strResult += this.bag[i] + "\n";

        }
        strResult += "]\n";
        return strResult;
    }

}
