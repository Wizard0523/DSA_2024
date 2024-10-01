Node currentNode;

Class Node<T> {
    T value;
    List<Node> nextNodes = new ArrayList<Node>();
    boolean explored = false;

    Node getNextNode(List<Node> stack) {
        Node nextNode;

        for (int i = 0; i < nextNodes.length(); ++i) {
            if (!nextNodes[i].explored) {
                nextNode = nextNodes[i];
            }
        }
        if (nextNode == null) {
            nextNode = stack.pop();
            currentNode.explored = true;
        }

        return nextNode;
    }

    
}

Main() {
    currentNode = new Node();

    List<Node> nodeStack = new ArrayList<Node>();
    nodeStack.add(currentNode);
    Node nextNode = currentNode.getNextNode(nodeStack);
    currentNode = nextNode;

}


//I could add and pop 


//DFS
//1. pick a node from list of next nodes -- each node has a list. How are the next nodes generated?
//2. 