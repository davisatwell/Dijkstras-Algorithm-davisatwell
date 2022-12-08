package a5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.*;


public class GraphImpl implements Graph {
    Map<String, Node> nodes; //Do not delete.  Use this field to store your nodes.
    // key: name of node. value: a5.Node object associated with name
    public GraphImpl() {
        nodes = new HashMap<>();
    }

    @Override
    public boolean addNode(String name) {
        if (nodes.containsKey(name) || name == null) {return false;}
        Node node = new NodeImpl(name);
        nodes.put(name, node);
        return true;
    }

    @Override
    public boolean addEdge(String src, String dest, double weight) {
        if (weight < 0 || src == null || dest == null) {return false;}
        if (!nodes.containsKey(src) || !nodes.containsKey(dest)) {return false;}
        if (nodes.get(src).getEdges().containsKey(dest)) {return false;}
        Edge edge = new EdgeImpl(src, dest, weight);
        Node node = nodes.get(src);
        node.addEdge(edge);
        return true;
    }

    @Override
    public boolean deleteNode(String name) {
        if (!nodes.containsKey(name)) {return false;}
        Node node = nodes.remove(name);
        return true;
    }

    @Override
    public boolean deleteEdge(String src, String dest) {
        if (!nodes.get(src).getEdges().containsKey(dest)) {return false;}
        nodes.get(src).deleteEdge(dest);
        return true;
    }

    @Override
    public int numNodes() {
        return this.nodes.size();
    }

    @Override
    public int numEdges() {
        int count = 0;
        for (String node : this.nodes.keySet()) {
            count += nodes.get(node).getEdges().size();
        }
        return count;
    }

    @Override
    public Map<String, Double> dijkstra(String start) {
        Map<String, Double> nodePathLength = new HashMap<>();
        Comparator<Node> lengthCompare = Comparator.comparingDouble(Node::getLength);
        PriorityQueue<Node> pq = new PriorityQueue<>(lengthCompare);
        Set<String> completed = new HashSet<String>();
        nodes.get(start).setLength(0.0);
        pq.add(nodes.get(start));
        while (pq.size() != 0) {
            Node minNode = pq.remove();
            completed.add(minNode.getName());
            Map<String, Edge> edges = minNode.getEdges();
            for (String edgeName : edges.keySet()) {
                Edge edge = edges.get(edgeName);
                if (nodes.get(edge.getDest()) != null) {
                    if (completed.contains(edge.getDest()) == false) {
                        double newPath = minNode.getLength() + edge.getWeight();
                        if (newPath < nodes.get(edge.getDest()).getLength()) {
                            nodes.get(edge.getDest()).setLength(newPath);
                        }
                        pq.add(nodes.get(edge.getDest()));
                    }
                }

            }
        }




        for (String nodeName : nodes.keySet()) {

            if (nodes.get(nodeName).getLength() != Double.POSITIVE_INFINITY) {
                nodePathLength.put(nodeName, nodes.get(nodeName).getLength());
            }
        }
        return nodePathLength;
    }
}



