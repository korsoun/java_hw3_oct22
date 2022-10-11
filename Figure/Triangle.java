public class Triangle extends Figure {
    
    int sideA;
    int sideB;
    int sideC;

    public Triangle(int a, int b, int c) {
        this.description = "треугольник";
        this.sideA = a;
        this.sideB = b;
        this.sideC = c;
    }

    public Double getPerimeter() {
        return 1.0 * sideA + sideB + sideC;
    }

    public Double getArea() {
        double semiper = this.getPerimeter();
        String res = String.format("%.3f", Math.sqrt(semiper * (semiper - sideA) * (semiper - sideB) * (semiper - sideC)));
        return Double.parseDouble(res.replace(",", "."));
    }

    public String info() {
        return description + " со сторонами " + sideA + ", " + sideB + ", " + sideC;
    }
}
