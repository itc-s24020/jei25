public class D52Q6 {
        public static void main(String[] args) {
            Drink[] dr = {
                    new Drink("Coca cola", 150),
                    new Drink("Pett Pepper", 130),
                    new Drink("Salt Water", 200)
            };

            VendingMachine vm = new VendingMachine(dr);
            vm.display();
            vm.execCom("100");
            vm.execCom("2");
            vm.execCom("3");
            vm.execCom("9");
            vm.display();
        }
    }

    class Drink {
        private String name;
        private int price;

        public Drink(String name, int price) {
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

    class VendingMachine {
        private Drink[] drinks;
        private int cash = 0;
        private int[] coin = {500, 100, 50, 10};

        VendingMachine(Drink[] drinks) {
            this.drinks = drinks;
        }

        public void display() {
            int idx = 0;
            for (Drink drink : drinks) {
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
                    break;
            }
        }

        private boolean isCoin(String s) {
            try {
                int c = Integer.parseInt(s);
                for (int x : coin) if (c == x) return true;
            } catch (NumberFormatException e) {
            }
            return false;
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


