public class D50Q23kadai {
    private String codo;

    public void setCodo(String c) {
        codo = c;
    }

    public String getCodo() {
        return codo;
    }

    public static void main(String[] args) {
        D50Q23kadai obj = new D50Q23kadai();
        obj.setCodo("codo");
        System.out.println(obj.getCodo());
    }
}

