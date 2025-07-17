public class D51kadai {
    public static void main(String[] args) {
        // 引数の数を確認
        if (args.length < 2) {
            System.out.println("エラー: 少なくとも2つの引数を指定してください。");
            return;
        }

        try {
            // 2番目の引数をdoubleに変換
            double value = Double.parseDouble(args[1]);

            // 切り上げ処理
            double result = Math.ceil(value);

            // 結果を表示
            System.out.println(result);
        } catch (NumberFormatException e) {
            System.out.println("エラー: 2番目の引数を実数として解析できません。");
        }
    }
}

