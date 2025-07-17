public class D51Q21kadai {
    public static void main(String[] args) {
        // 8進数リテラル：先頭0 → octal
        int oct = 021;    // 8進数 21 = 17（10進数）
        // 16進数リテラル：先頭0x → hex
        int hex = 0x21;   // 16進数 21 = 33（10進数）

        // 合計を計算
        int sum = oct + hex; // 17 + 33 = 50

        // 結果を出力（10進数で表示）
        System.out.println("8進数 021（=" + oct + "） + 16進数 0x21（=" + hex + "） = " + sum);
    }
}
