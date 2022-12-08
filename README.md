# <img src = "https://ars.els-cdn.com/content/image/3-s2.0-B9781558608610500067-f04-13-9781558608610.jpg"/> <img src = "https://img.shields.io/badge/Dijkstra's%20Algorithm%20in%20Java-davisatwell-important"/>

created my own Directed Graph and performed Dijkstra's Algorithm
on the graph. 

## Algorithm Defined
1. Let i = 0, V<sub>0</sub> = {p<sub>0</sub>}, D(p<sub>0</sub>) = 0, and D(q) = ∞ for q ≠ p<sub>0</sub>. If α<sub>0</sub> = 1, then stop; otherwise, go to Step 2.

2. For each q ∈ S/V<sub>i</sub>, update D(q) by min{D(q),D(p<sub>i</sub>) + w(q,p<sub>i</sub>)}.If D(q) is replaced, put a label [D(q),p<sub>i</sub>] on q. (This allows for the tracking of shortest paths.) Overwrite the previous label, if there is one.

3. Let p<sub>i</sub>+1 be a node that minimizes {D(q): q ∈ S/V<sub>i</sub>}.

4. Let V<sub>i</sub>+1 = V<sub>i</sub> ∪ {p<sub>i</sub>+1}.

5. Replace i with i + 1. If i = α<sub>0</sub> −1, then stop; otherwise, go to Step 2.


## Methods used in Graph.java
```
    boolean addNode(String label);   
```
```
    boolean addEdge(String src, String dest, double weight);
```
```
    boolean deleteNode(String label);
```
```
    boolean deleteEdge(String src, String dest);
```
```
    int numNodes();
```
```
    int numEdges();
```
```
    Map<String, Double> dijkstra(String start);
```
### License
GNU-3.0-or-later
