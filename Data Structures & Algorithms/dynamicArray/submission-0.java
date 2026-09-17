class DynamicArray {
    List<Integer> l;
    int cap = 0;
    public DynamicArray(int capacity) {
        cap = capacity;
        l = new ArrayList<>();
    }

    public int get(int i) {
        return l.get(i);
    }

    public void set(int i, int n) {
        l.set(i,n);
    }

    public void pushback(int n) {
        if(cap == l.size()) resize();
        l.add(n);
    }

    public int popback() {
        if(cap > 0) return l.removeLast();
        return -1;
    }

    private void resize() {
        cap = cap*2;
    }

    public int getSize() {
        return l.size();
    }

    public int getCapacity() {
        return cap;
    }
}
