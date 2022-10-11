public class Rhombus extends ParalelTetragon {
    
    /***
    
     * @param a - сторона ромба
     * @param h - высота
     */
    public Rhombus (int a, int h) {
        super(a, a, h);
        this.description = "ромб";
        this.sideA = this.sideB = this.sideC = this.sideD = a;
        this.heigth = h;
    }

    public Double getPerimeter() {
        return (double) sideA * 4;
    }

    public String info() {
        return description + " со сторонами по " + sideA;
    }
}
