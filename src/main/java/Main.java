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

    public Hashmap(final int[] Arr, final int size) {
        this.size = size;
        hashTable = new int[size];
        countTable = new int[size];
        stateTable = new int[size];

        Arrays.fill(countTable, 0);
        Arrays.fill(stateTable, 0);
    }

    public void insert(int value) {

        if (Arrays.stream(stateTable).sum() == size) {
            System.out.println("Hashmap is full");
            return;
        }

        key = value % size;
        if (stateTable[key] == 0 || stateTable[key] == -1) {
            hashTable[key] = value;
            countTable[key]++;
            stateTable[key] = 1;
        } else if (stateTable[key] == 1) {
            while (stateTable[key] == 1) {
                if (hashtable[key] == value) {
                    break;
                }
                key = (key + 1) % size;
            }
            hashTable[key] = value;
            countTable[key]++;
            stateTable[key] = 1;
        }
    }

		public void delete(int value) {
			if (noOfElement == 0){
				System.out.println("Hashmap is empty");
				return;
			}
			key = value % size;
			if (stateTable[key] == 0){
				System.out.println("Value not found");
				return;
			} else if (stateTable[key] == 1){
				if (hashTable[key] == value){
					countTable[key]--;
					stateTable[key] = (counTable[key] == 0) ? -1 : 0;
				} else {
					while (stateTable[key] != 0){
					key = (key + 1) % size;
					if (hashTable[key] == value){
						countTable[key]--;
						stateTable[key] = (counTable[key] == 0) ? -1 : 0;
						break;
					}
				}
			}
		}

    public boolean search(int value) {
        // implementation
    }

    public int noOfElements() {
        return Arrays.stream(countTable).sum();
    }
}

// [1,2,3,4,5,6,7,8] 9,10,11,12,13
public class Main {
    public static void main(String[] args) {
        Hashmap myMap = new Hashmap(10); // Instantiate the Hashmap
        myMap.insert(5); // Example value for insertion
        myMap.search(5); // Example value for search
        myMap.delete(5); // Example value for deletion
        System.out.println(""); // Example code without context
    }
}
