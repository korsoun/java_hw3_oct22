public class Tetragon extends Figure {
    
    int sideA;
    int sideB;
    int sideC;
    int sideD;

    public Tetragon (int a, int b, int c, int d) {
        this.description = "четырехугольник";
        this.sideA = a;
        this.sideB = b;
        this.sideC = c;
        this.sideD = d;
    }

    public Double getArea() {
        double semiper = this.getPerimeter() / 2 + this.getPerimeter() % 2;
        return Math.sqrt((semiper - sideA) * (semiper - sideB) * (semiper - sideC) * (semiper - sideD));
    }

    public Double getPerimeter() {
        return (double) (sideA + sideB + sideC + sideD);
    }
    
    public String info() {
        return this.description + " со сторонами " + this.sideA + ", " + this.sideB + ", " + this.sideC + ", " + this.sideD + ".";
    }
}
