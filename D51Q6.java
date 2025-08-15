public class D51Q6 {
    public static void main(String[] args) {
        // 引数チェック
        if (args.length == 0) {
            System.out.println("商品コードを指定してください。");
            return;
        }

        String code = args[0];
        if (code.length() < 4) {
            System.out.println("商品コードは4文字以上で指定してください。");
            return;
        }

        // コード分割
        String lcode = code.substring(0, 2);   // 大分類
        String scode = code.substring(2, 4);   // 小分類
        String details = code.substring(4);    // 詳細コード

        // 大分類リスト
        Item[] li = {
                new Item("A4", "魚類"),
                new Item("BB", "肉類")
        };

        // 小分類リスト
        Item[] si = {
                new Item("A1", "サバ"),
                new Item("A2", "さんま"),
                new Item("B1", "牛肉"),
                new Item("B2", "鶏肉"),
                new Item("B3", "豚肉"),
                new Item("B4", "加工肉")  // 新しい小分類
        };

        // マスタ作成
        ItemMaster im = new ItemMaster(li, si);

        // 名前取得
        String lname = im.getItemName(im.MAJOR, lcode);
        String sname = im.getItemName(im.MINOR, scode);

        // 結果出力
        System.out.println("商品コード：" + code);
        System.out.println("大分類：" + lname);
        System.out.println("小分類：" + sname);
        System.out.println("詳細コード：" + details);
    }
}

// 商品クラス
class Item {
    private String code;
    private String name;

    Item(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getCode() { return code; }
    public String getName() { return name; }
}

// 商品マスタ
class ItemMaster {
    public int MAJOR = 0;
    public int MINOR = 1;
    private Item[][] items;

    ItemMaster(Item[] major, Item[] minor) {
        items = new Item[2][];
        items[MAJOR] = major;
        items[MINOR] = minor;
    }

    public String getItemName(int codeLevel, String code) {
        for (int i = 0; i < items[codeLevel].length; i++) {
            if (items[codeLevel][i].getCode().equals(code)) {
                return items[codeLevel][i].getName();
            }
        }
        return "(不明)";
    }
}
