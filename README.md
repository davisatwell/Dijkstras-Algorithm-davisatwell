# A5-Dijkstra

For this assignment you will be creating your own Directed Graph and performing Dijkstra's Algorithm
on the graph. This assignment is less structured than others and gives you the freedom to implement
the graph however you choose. The graded portion of the assignment will be the GraphImpl.java class. 
The behind the scenes of your graph are not tested, as long as the methods in GraphImpl.java function correctly.
You are encouraged to create tests in Main.java to test your code. 

## Task: Implement the methods in Graph.java
These include the following.
```
    boolean addNode(String label);
    boolean addEdge(String src, String dest, double weight);
    boolean deleteNode(String label);
    boolean deleteEdge(String src, String dest);
    int numNodes();
    int numEdges();
    Map<String, Double> dijkstra(String start);
```

> **Hint:** Try to implement and test basic functionality (e.g., creating a graph, adding nodes, adding edges, etc)
> before you implement more complex methods.
## Info and hints on files 

You are graded based on your implementation in GraphImpl.java of the Graph.java methods.  However, you 
should expect to also modify Edge.java, EdgeImpl.java, Node.java, and NodeImpl.java to define node and edge objects and 
provide helper methods as you see fit to make your implementation of the graph methods easier. 

> **Hint:** Look at the classes from previous assigments to see examples of fields and their usage.  You may need to create constructors
> for edge and node objects.   

### Edge.java

The Edge interface is empty. It is your job to come up with the methods that you think an Edge object
should have in order to create a graph and run Dijkstra. Write out the method signatures in
the Edge.java interface and implement those methods in EdgeImpl.java. 
To know what properties an Edge contains, take a look at the createEdge method in GraphImpl.java
 
 > **Hint:** What fields do you need to describe an edge?
 
### Node.java

The Node.java interface currently only has one method, getName(). This method should return the name
associated with the Node. Do not remove this method since it is used for testing. Your task is to
add the remaining methods that you think a Node needs in order to complete Dijkstra's Algorithm.
The addNode() method in GraphImpl.java shows what fields a Node has. These fields are the minimum
required, you may add any other fields that you may think are useful. 

> **Hint:** Remember that we identify nodes based on a String label.  Look at the "nodes" map in 
> GraphImpl.java and make sure you understand it.

### Graph.java

The interface Graph.java has all the methods needed for a graph. This interface is complete; do not 
change any of the methods within it. You may add helper methods if needed in GraphImpl.java. You 
must implement all the methods in this interface.  

> **Hint:** Read Graph.java carefully.  Some of the methods (e.g., addEdge) return false for several different cases.

> **Hint:** Consider writing a small helper method that prints the nodes and edges in a graph to help you debug.
