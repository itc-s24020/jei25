public class D50Q5kadai {
    public static void main(String[] args) {
        int[] num = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            num[i] = Integer.parseInt(args[i]);
        }

        for (int i = 1; i < num.length; i++) {
            for (int j = i - 1; j >= 0 && num[j] > num[j + 1]; j--) {
                int tmp = num[j];
                num[j] = num[j + 1];
                num[j + 1] = tmp;
            }
            System.out.print("ソート途中:");
            for (int v : num) System.out.print(v + " ");
            System.out.println();
        }

        System.out.println("-------------------");
        System.out.print("ソート結果:");
        for (int v : num) System.out.print(v + " ");
        System.out.println();
    }
}
