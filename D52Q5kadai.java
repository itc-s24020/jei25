public class D52Q5kadai {
    public static void main(String[] args) {
        if (args.length == 0) return; // 引数がない場合は終了

        int LIMIT = 400;
        int[] data = new int[args.length];
        int max = 0;

        // データ読み込み & 最大値確認
        for (int i = 0; i < args.length; i++) {
            data[i] = Integer.parseInt(args[i]);
            if (data[i] <= 0 || data[i] >= LIMIT) {
                System.out.println("0 < 値 < " + LIMIT + " の範囲で入力してください");
                return;
            }
            if (data[i] > max) max = data[i];
        }

        // 目盛り単位
        int scale = 10;
        int scaleMax = (max + scale - 1) / scale; // 目盛りの段数

        // 目盛り表示
        System.out.print("     ");
        for (int i = 1; i <= scaleMax; i++) {
            System.out.printf("%2d ", i * scale);
        }
        System.out.println();

        // データごとのヒストグラム表示
        for (int value : data) {
            int stars = (value + scale - 1) / scale; // 目盛り単位で星の数
            System.out.printf("%4d: ", value);
            for (int i = 0; i < stars; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
