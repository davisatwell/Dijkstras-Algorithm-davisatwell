package a5;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public interface Graph {

    /**
     * @param label - string for name of a5.Node, must be unique
     *                  (cannot be the same as an existing node in the graph)
     * @return false if label is not unique (or is null)
     *         true if node is successfully added
     */
    boolean addNode(String label);

    /**
     * @param src - label of source node
     * @param dest - label of destination node
     * @param weight - weight for new edge (use 1 by default)
     * @return false if edge weight is less than 0
     *         false if source node is not in graph
     *         false if destination node is not in graph
     *         false is there already is an edge between these 2 nodes
     *         true if edge is successfully added
     */
    boolean addEdge(String src, String dest, double weight);

    /**
     * @param label - label of node to remove
     * @return false if the node does not exist
     *         true if the node is found and successfully removed
     */
    boolean deleteNode(String label);

    /**
     * @param src - label for source node
     * @param dest - label from destination node
     * @return false if the edge does not exist
     *         true if the edge is found and successfully removed
     */
    boolean deleteEdge(String src, String dest);

    /**
     * reports how many nodes are in the graph
     * @return - integer 0 or greater that is the number of nodes in the graph
     */
    int numNodes();

    /**
     * reports how many edges are in the graph
     * @return - integer 0 or greater that is the number of edges in the graph
     */
    int numEdges();

    /**
     * Runs Dijkstra's algorithm on the graph, starting at the node specified by the start parameter.
     * Return a map where the key is the name of the node and the value is the distance from the start node.
     * The start node should be included in the returned map, with the value 0 as the distance.
     *
     * @param start - a5.Node to start Dijkstra's algorithm at
     * @return Map of all the nodes in the graph and the distance to the start a5.Node.
     */
    public Map<String, Double> dijkstra(String start);



}
