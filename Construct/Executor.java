public class Executor {
    public void execute() {
        Foo Obj1 = new Foo("qwe", "asd", "zxc", 744, 15, 28, 64, true, 17.3, 2.6);
        System.out.println(Obj1.toString());
        Foo Obj2 = new Foo("qwe", "asd", "zxc", 12, 6, false, 12.3, 3.0);
        System.out.println(Obj2.toString());
        Foo Obj3 = new Foo("qwe", "asd", 4, 6, 7.9);
        System.out.println(Obj3.toString());
    }
}
