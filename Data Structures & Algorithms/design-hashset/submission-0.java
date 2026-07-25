class Bucket {
    private LinkedList<Integer> container; // Specific type for addFirst()

    public Bucket() {
        this.container = new LinkedList<Integer>();
    }

    public void insert(Integer val) {
        int index = this.container.indexOf(val);
        if (index == -1) {
            this.container.addFirst(val);
        }
    }

    public void remove(Integer val) {
        // Explicitly use the Object version of remove
        this.container.remove(val);
    }

    // Renamed from 'container' to 'contains'
    public boolean contains(Integer val) {
        int index = this.container.indexOf(val);
        return index != -1;
    }
}

class MyHashSet {
    private int numBuckets = 769;
    private Bucket[] buckets;

    public MyHashSet() {
        this.buckets = new Bucket[this.numBuckets];
        for (int i = 0; i < numBuckets; i++) {
            this.buckets[i] = new Bucket();
        }
    }

    private int getIndex(int key) {
        return key % numBuckets;
    }

    public void add(int key) {
        int bucketIndex = this.getIndex(key);
        this.buckets[bucketIndex].insert(key);
    }

    public void remove(int key) {
        int bucketIndex = this.getIndex(key);
        this.buckets[bucketIndex].remove(key);
    }

    public boolean contains(int key) {
        int bucketIndex = this.getIndex(key);
        return this.buckets[bucketIndex].contains(key);
    }
}