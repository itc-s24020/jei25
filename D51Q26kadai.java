public class D51Q26kadai {
    public static void main(String[] args) {
        int n = 1;
        String s = "";

        switch (n) {
            case 1:
                s += "one";
                break; // case 1 の処理が終わったら switch 文を抜ける
            case 2:
                s += "two";
                break;
            default:
                s += "?";
                break; // default の処理が終わったら switch 文を抜ける
        }

        System.out.println(s); // 出力: one
    }
}
