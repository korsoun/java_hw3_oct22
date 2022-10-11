public class Foo {
    String arg1;  
    String arg2;  
    String arg3;  // Необязательный
    int arg4; 
    int arg5;  // Необязательный
    int arg6;
    int arg7;  // Необязательный
    boolean arg8;  // Важный, но будет иметь значение по умолчанию
    double arg9;
    double arg10;  // Необязательный

    public Foo (String arg1, String arg2, String arg3,
                int arg4, int arg5, int arg6, int arg7,
                boolean arg8, double arg9, double arg10) {
                    this.arg1 = arg1;
                    this.arg2 = arg2;
                    this.arg3 = arg3;
                    this.arg4 = arg4;
                    this.arg5 = arg5;
                    this.arg6 = arg6;
                    this.arg7 = arg7;
                    this.arg8 = arg8;
                    this.arg9 = arg9;
                    this.arg10 = arg10;
                }

    public Foo (String arg1, String arg2, String arg3, int arg4, int arg6,
                boolean arg8, double arg9, double arg10) {
                    this.arg1 = arg1;
                    this.arg2 = arg2;
                    this.arg3 = arg3;
                    this.arg4 = arg4;
                    this.arg5 = 0;
                    this.arg6 = arg6;
                    this.arg7 = 0;
                    this.arg8 = arg8;
                    this.arg9 = arg9;
                    this.arg10 = arg10;
    }

    public Foo (String arg1, String arg2, int arg4, int arg6, double arg9) {
            this.arg1 = arg1;
            this.arg2 = arg2;
            this.arg3 = "-";
            this.arg4 = arg4;
            this.arg5 = 0;
            this.arg6 = arg6;
            this.arg7 = 0;
            this.arg8 = true;
            this.arg9 = arg9;
            this.arg10 = 0;
    }

    @Override
    public String toString() {
        String res = String.format("%s, %s, %s, %d, %d, %d, %d, %s, %f, %f", 
        arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10);
        return res;
    }
}