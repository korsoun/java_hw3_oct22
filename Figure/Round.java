public class Round extends Figure{
    
    public int radius;
    public Round (int r) {
        this.description = "круг";
        this.radius = r;
    }

    public Double getArea() {
        String res = (String.format("%.3f", Math.PI * radius * radius));
        return Double.parseDouble(res.replace(",", "."));
    }

    public Double getPerimeter () {
        String res = String.format("%.3f", 2 * Math.PI * radius);
        return Double.parseDouble(res.replace(",", "."));
    }

    public String info() {
        return description + " радиусом " + radius;
    }
}
