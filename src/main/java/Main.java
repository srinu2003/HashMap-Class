import java.util.Arrays;

public class Hashmap {
    private final int size;
    int hashTable[];
    int countTable[];
    int stateTable[];

    Hashmap(final int size) {
        this.size = size;
        hashTable = new int[size];
        countTable = new int[size];
        stateTable = new int[size];
        Arrays.fill(countTable, 0);
    }

    public void insert() {
        // implementation
    }

    public void delete() {
        // implementation
    }

    public void search() {
        // implementation
    }

    public void size() {
        // implementation
    }
}

public class Main {
    public static void main(final String[] args) {
        System.out.println("Hello world!");
    }
}
