public class Square extends Rectangle {

    public Square (int a) {
        super(a, a);
        this.description = "Квадрат";
    }

    public String info() {
        return description + " со сторонами по " + sideA;
    }
}