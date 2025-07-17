// 信号機の色を定義する列挙型
enum SignalColor {
    RED,    // 赤
    YELLOW, // 黄
    GREEN   // 青
}

public class D51Q27kadai {
    public static void main(String[] args) {
        // 青信号を選択
        SignalColor color = SignalColor.GREEN;
        // 結果を出力
        System.out.println(color);
    }
}

