public class D49Q25kadai {
    public static  void main(String[] args) {
        double a = 12.3;
        double b = 4.5;
        D49Q25kadai  o = new D49Q25kadai();
        int c = o.number(a,b);
        System.out.println(c);
    }
    int number(double v1, double v2){
        return (int)(v1/v2);
    }
}
