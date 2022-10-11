public class Executor {
    public static void execute () {
        ParalelTetragon abcd = new Rectangle(6, 3);
        System.out.println(abcd.description);
        System.out.println(abcd.getArea());
        System.out.println(abcd.getPerimeter());
        System.out.println(abcd.info());
        ParalelTetragon zxcv = new Square(6);
        System.out.println(zxcv.description);
        System.out.println(zxcv.getArea());
        System.out.println(zxcv.getPerimeter());
        System.out.println(zxcv.info());
        Figure rnd = new Oval(6, 3);
        System.out.println(rnd.description);
        System.out.println(rnd.getArea());
        System.out.println(rnd.getPerimeter());
        System.out.println(rnd.info());
    }
}
