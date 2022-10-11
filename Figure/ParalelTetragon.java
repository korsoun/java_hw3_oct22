public class ParalelTetragon extends Tetragon{
    
    int heigth;
    /***
     * @param a - большая сторона
     * @param c - меньшая сторона
     * @param h - высота к большей стороне
     */
    public ParalelTetragon (int a, int c, int h) {
        super(a, a, c, h);
        description = "параллелограмм";
        this.sideA = this.sideB = a;
        this.sideC = this.sideD = c;
        this.heigth = h;
    }

    public Double getPerimeter() {
        return (double) sideA * 2 + sideC * 2;
    }

    // @Override
    public Double getArea() {
        return (double) sideA * heigth;
    }

    public String info() {
        return this.description + " со сторонами " + this.sideA + " и " + this.sideC + ".";
    }
}
