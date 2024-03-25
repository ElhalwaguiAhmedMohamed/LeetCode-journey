class Node {
    public int key;
    public int val;
    public Node next;
    public Node prev;
    Node(int key, int val){
        this.key = key;
        this.val = val;
        this.next = null;
        this.prev = null;
    }
}
class LRUCache {
    private int capacity;
    private Map<Integer,Node> cache;
    private Node left;
    private Node right;
    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.cache = new HashMap<>();
        this.left = new Node(-1,-1);
        this.right = new Node(-1,-1);
        this.left.next = right;
        this.right.prev = left;
    }
    
    public int get(int key) {
        if(cache.containsKey(key)){
            Node node = cache.get(key);
            this.remove(node);
            this.insert(node);
            return node.val;
        }
        return -1;
    }

    public void insert(Node node){
        Node prev = this.right.prev;
        node.next = this.right;
        prev.next = node;
        node.prev = prev;
        this.right.prev = node; 
    }

    public void remove(Node node){
        Node prev = node.prev, next = node.next;
        prev.next = next;
        next.prev = prev;
    }
    
    public void put(int key, int value) {
        if(cache.containsKey(key)){
            this.remove(cache.get(key));
        }
        Node newNode = new Node(key,value);
        this.cache.put(key, newNode);
        this.insert(newNode);

        if(this.cache.size() > this.capacity){
            Node lru = this.left.next;
            this.remove(lru);
            this.cache.remove(lru.key);
        }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */