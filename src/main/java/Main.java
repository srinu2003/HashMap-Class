import java.util.Arrays;
import java.util.Scanner;

// H(x) = (f0(x) + f1(x) + f2(x) + ...) mod m)
// m : Size

public class Hashmap {
    private final int size; // represents the size(Capacity) of the hashmap
    int hashTable[];
    int countTable[];
    int stateTable[];

    public Hashmap(final int size) {
        this.size = size;
        hashTable = new int[size];
        countTable = new int[size];
        stateTable = new int[size];
        
        Arrays.fill(countTable, 0);
        Arrays.fill(stateTable, 0);
    }
    public Hashmap(final int[] Arr, final int size){
        this.size = size;
        hashTable = new int[size];
        countTable = new int[size];
        stateTable = new int[size];
        
        Arrays.fill(countTable, 0);
        Arrays.fill(stateTable, 0);
    }
    
    public void insert(int value) {
        key = value % size;
        // implementation
    }

    public void delete(int value) {
        // implementation
    }

    public boolean search(int value) {
        // implementation
    }

    public int size() {
        // implementation
      return this.size;
    }
}
// [1,2,3,4,5,6,7,8] 9,10,11,12,13
public class Main {
    public static void main(String[] args) {
        Hashmap myMap = new Hashmap(10); // Instantiate the Hashmap
        myMap.insert();
        myMap.search();
        myMap.delete();
        System.out.println("");
    }
}

