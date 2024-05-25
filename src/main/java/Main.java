import java.util.Arrays;

class opAHash {
    private final int size;
    int DEFAULT_VALUE = 0;
    int hashTable[];
    int countTable[];
    int stateTable[];

    public opAHash(final int size) {
        this.size = size;
        hashTable = new int[size]; 
        countTable = new int[size]; 
        stateTable = new int[size];
        Arrays.fill(countTable, 0);
        Arrays.fill(stateTable, 0);
    }
    static int hashFunction(final int value, final int size){
        // TODO: Implement hash function
        return value % size; //return Key
    }
    public void insert(int value) {
        // TODO: Implement value from being inserted if it is already in the hash table
        if (Arrays.stream(stateTable).sum() == size) {
            System.out.println("Hashmap is full");
            return;
        }

        // TODO: Use hash function for key
        int key = hashFunction(value, size);
        if (stateTable[key] == 0 || stateTable[key] == -1) {
            hashTable[key] = value;
            countTable[key]++;
            stateTable[key] = 1;
        } else if (stateTable[key] == 1) {
            while (stateTable[key] == 1) {
                if (hashTable[key] == value) {
                    break;
                }
                key = (key + 1) % size; // For linear probing
            }
            hashTable[key] = value;
            countTable[key]++;
            stateTable[key] = 1;
        }
    }

    public void delete(int value) {
        if (noOfElements() == 0){
            System.out.println("Hashmap is empty");
            return;
        }

        int key = search(value);
        if (key == -1) {
            System.out.println("Value not found");
            return;
        } else {
            hashTable[key] = DEFAULT_VALUE;
            countTable[key]--;
            stateTable[key] = (countTable[key] == 0) ? -1 : 0;
        }
    }

    public int search(int value) {
        int key = hashFunction(value, size);
        
        if (stateTable[key] == 0) {
            System.out.println("Value not found");
            return -1;
        } else if (stateTable[key] != 0){
            if (hashTable[key] == value) {
                return key;
            } else {
                int keyInitial = key;
                while (stateTable[key] != 0) {
                    key = (key + 1) % size; // For linear probing
                    if(key == keyInitial){
                        System.out.println("Value not found");
                        return -1;
                    }
                    if (hashTable[key] == value) { return key; }
                }
            }
        }
        return -1;
    }

    public int noOfElements() {
        return Arrays.stream(countTable).sum();
    }
}

public class Main {

    public static void main(String[] args) {

        opAHash myMap = new opAHash(4);
        myMap.insert(7);
        myMap.insert(2);
        myMap.insert(1);
        myMap.insert(5);
        myMap.insert(3);
        System.out.println(myMap.search(7));
        // myMap.delete(7);
        // myMap.search(7);
        myMap.delete(17);
        System.out.println("myMap"+":"+Arrays.toString(myMap.hashTable));
        System.out.println("countTable"+":"+Arrays.toString(myMap.countTable));
        System.out.println("stateTable"+":"+Arrays.toString(myMap.stateTable));
    }
}   