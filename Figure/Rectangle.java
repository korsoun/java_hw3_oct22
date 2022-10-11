public class Rectangle extends ParalelTetragon {
    
    public Rectangle (int a, int c) {
        super(a, c, c);
        this.description = "Прямоугольник";
        this.sideB = this.sideA;
        this.sideD =this.heigth = this.sideC;
    }
}
