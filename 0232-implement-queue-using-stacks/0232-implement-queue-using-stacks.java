class MyQueue {

    private List<Integer> writeList = new ArrayList<>();

    public MyQueue() {

    }

    public void push(int x) {
        writeList.add(x);
    }

    public int pop() {
        int element = writeList.get(0);
        writeList.remove(0);
        return element;
    }

    public int peek() {
        return writeList.get(0);
    }

    public boolean empty() {
        return writeList.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */