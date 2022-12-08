package a5;

import java.util.*;

public class NodeImpl implements Node {
    private String name;
    private Map<String, Edge> edges = new HashMap<String, Edge>();
    public double length = Double.POSITIVE_INFINITY;

    public NodeImpl(String name) {
        this.name = name;
    }

    public void insertLength(int length) {
        this.length = length;
    }

    public double getLength() {
        return this.length;
    }

    public void addEdge(Edge e) {
        edges.put(e.getDest(), e);
    }

    public void deleteEdge(String dest) {
        edges.remove(dest);
    }

    public Map<String, Edge> getEdges() {
        return edges;
    }

    public String getName() {
        return name;
    }

    public void setLength(double length) {
        this.length = length;
    }
    }



