public class D51Q5kada {
        public static void main(String[] args) {
            if (args.length != 1) {
                System.out.println("使用量（m³）を1つ指定してください。");
                return;
            }

            try {
                double usage = Double.parseDouble(args[0]);

                // 値上げ後の料金設定
                int basicFee = 800; // 基本料金（100円値上げ）
                int unitPrice = 15; // 従量単価（1円値上げ）

                // ガス代金の計算
                int totalFee = basicFee + (int)Math.round(usage * unitPrice);

                System.out.println("今月のガス代金は" + totalFee + "円");
            } catch (NumberFormatException e) {
                System.out.println("数値として解釈できませんでした。正しい数値を入力してください。");
            }
        }
    }

