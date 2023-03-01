package ACHashSet;

public class MyHashMap<K, V> {
    private static int DEFAULT_CAPACITY = 16;

    private Node<K, V>[] table;
    private int capacity;

    MyHashMap() {
        this(DEFAULT_CAPACITY);
    }

    MyHashMap(int capacity) {
        this.capacity = capacity;
        this.table = new Node[capacity];
    }

    static class Node<K, V> {
        K key;
        V value;
        Node<K, V> next;

        Node(K key, V value) {
            this.key = key;
            this.value = value;
        }

        Node(K key, V value, Node<K, V> next) {
            this.key = key;
            this.value = value;
            this.next = next;
        }
    }

    public void put(K key, V value) {
        if (key == null) {
            return;
        }
        // Create a key-value pair
        Node<K, V> newNode = new Node<>(key, value);

        // Find the right Bucket by hashing the key
        int hash = hash(key);

        // if - Empty Bucket
        if (table[hash] == null) {
            table[hash] = newNode;

            // else - "Hash Bucket" is not Empty, Known as "Hash Collision"
            // New Node is created and linked to Previous Node in Same Bucket
        } else {
            Node<K, V> current = table[hash];
            Node<K, V> previous = null;
            while (current != null) {
                if (current.key.equals(key)) {//
                    current.value = newNode.value;
                    return;
                }
                previous = current;
                current = current.next;
            }
            previous.next = newNode;
        }
    }

    public V get(K key) {
        if (key == null) {
            return null;
        }

        // Find the right Bucket by hashing the key
        int hash = hash(key);

        // if - "Hash Bucket" is Empty, Return null
        if (table[hash] == null) {
            return null;
        }
        // else - "Hash Bucket" is not Empty
        // Traverse through all the linked Nodes in the Bucket
        // Use `equals` method to find the correct key-value pair
        else {
            Node<K, V> current = table[hash];
            while (current != null) {
                if (current.key.equals(key)) {
                    return current.value;
                }
                current = current.next;
            }
        }
        return null;
    }

    private int hash(K key) {
        // Using modulo "% capacity" to make sure that returned hash in the range of
        // underlying Array size
        return Math.abs(key.hashCode()) % capacity;
    }

    public static void main(String[] args) {
        MyHashMap<String, Integer> Countries = new MyHashMap<>();
        Countries.put("Aryan", 24);
        Countries.put("Mohit", 23);
        Countries.put("Sidhu", 22);
        Countries.put("Aryan", 21);
        System.out.println(Countries.get("Mohit"));
    }
}
