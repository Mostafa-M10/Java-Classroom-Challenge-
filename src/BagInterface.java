public interface BagInterface {

    public int getCurrentSize();


    public boolean isEmpty();

    public boolean addNewEntry(String newEntry);

    public String remove();

    public boolean remove(String anEntry);


    public void clear();

    public int getFrequencyOf(String anEntry);

    public boolean contains(String anEntry);

    public String toString();



}