public class Oval extends Round {
    
    int radiusB;
    public Oval (int radiusA, int radiusB) {
        super(radiusA);
        this.radiusB = radiusB;
        this.description = "овал";
    }

    public Double getArea() {
        String res = (String.format("%.3f", Math.PI * radius * radiusB));
        return Double.parseDouble(res.replace(",", "."));
    }

    public Double getPerimeter () {
        String res = String.format("%.3f", 2 * Math.PI * Math.sqrt((1.0 * radius * radius + radiusB * radiusB)/2));
        return Double.parseDouble(res.replace(",", "."));
    }

    public String info() {
        return description + " с полуосями " + radius + " и " + radiusB;
    }
}
