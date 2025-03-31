class BrowserHistory {

    String homepage;
    LinkedList<String> history;
    int curPoint;

    public BrowserHistory(String homepage) {
        this.homepage = homepage;
        history = new LinkedList<>();
        history.add(homepage);
        curPoint = 0;
    }

    public void visit(String url) {
        curPoint++;
        if(curPoint == history.size()) {
            history.add(url);
        } else {
            history.set(curPoint ,url);
        }

        while(curPoint < history.size() -1) {
            history.removeLast();
        }
    }

    public String back(int steps) {
        curPoint = curPoint - steps < 0 ? 0 : curPoint - steps;
        return history.get(curPoint);
    }

    public String forward(int steps) {
        curPoint = curPoint + steps > history.size() - 1 ? history.size() -1 : curPoint + steps;
        return history.get(curPoint);
    }
    
  
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */