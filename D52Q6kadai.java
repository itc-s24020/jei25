public class D52Q6kadai {
    public static void main(String[] args) {
        Drink2[] dr = {
                new Drink2("Coca cola", 150),
                new Drink2("Pepsi", 130),
                new Drink2("Salt Water", 200)
        };

        VendingMachine2 vm = new VendingMachine2(dr);
        vm.display();

        // コマンドを配列にまとめる
        String[] scenario = {
                "i 100",
                "i 50",
                "s 1",
                "i 200",
                "s 3",
                "c"
        };

        // 配列の各コマンドを順に実行
        for (String cmd : scenario) {
            vm.execCom(cmd);
        }

        vm.display();
    }
}

class Drink2 {
    private String name;
    private int price;

    public Drink2(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String toString() {
        return "[" + name + "," + price + "¥]";
    }
}

class VendingMachine2 {
    private Drink2[] drinks;
    private int cash = 0;
    private int[] coin = {500, 100, 50, 10};

    VendingMachine2(Drink2[] drinks) {
        this.drinks = drinks;
    }

    public void display() {
        int idx = 0;
        for (Drink2 drink : drinks) {
            System.out.println(idx + " : " + drink);
            idx++;
        }
    }

    public void execCom(String command) {
        String[] s = command.split(" ");
        switch (s[0]) {
            case "i":
                if (s.length == 2)
                    cash += Integer.parseInt(s[1]);
                break;
            case "s":
                if (s.length == 2) {
                    int sel = Integer.parseInt(s[1]) - 1;
                    if (sel < 0 || sel >= drinks.length) {
                        System.out.println("選択番号が不正です");
                        break;
                    }
                    int price = drinks[sel].getPrice();
                    if (price <= cash) {
                        cash -= price;
                        dispense(sel);
                    } else {
                        System.out.println("投入金額不足");
                    }
                }
                break;
            case "c":
                payChange();
                break;
            default:
                System.out.println("不明なコマンド: " + command);
                break;
        }
    }

    private void dispense(int idx) {
        System.out.println(drinks[idx] + "が排出されました");
    }

    private void payChange() {
        if (cash > 0) {
            System.out.print("お釣り ");
            int remain = cash;
            for (int c : coin) {
                int count = remain / c;
                if (count > 0) {
                    System.out.print(c + "円 x " + count + "; ");
                    remain -= c * count;
                }
            }
            System.out.println();
            cash = 0;
        }
        System.out.println("終了");
    }
}

