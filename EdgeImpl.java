package a5;

public class EdgeImpl implements Edge {
    private String src;
    private String dest;
    private double weight;

    public EdgeImpl(String src, String dest, double weight) {
        this.src = src;
        this.dest = dest;
        this.weight = weight;
    }

    public String getSrc() {
        return src;
    }

    public String getDest() {
        return dest;
    }

    public double getWeight() {
        return weight;
    }
    }



