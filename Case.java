public class Case {
    public static void main(String[] Args) {
        long moneyCount = 5845;
        long hundredProportion = moneyCount % 100;
        long tenProportion = hundredProportion % 10;
        if (hundredProportion >= 21) {
            if (tenProportion != 0) {
                if (tenProportion != 1) {
                    if (tenProportion <= 4) {
                        System.out.println(+moneyCount + " рубля");
                    } else
                        System.out.println(+moneyCount + " рублей");
                } else
                    System.out.println(+moneyCount + " рубль");
            }
        } else if (hundredProportion >= 5) {
            if (tenProportion >= 5) {
                System.out.println(+moneyCount + " рублей");
            }
        } else if (tenProportion != 0) {
            if (tenProportion != 1) {
                System.out.println(+moneyCount + " рубля");
            } else
                System.out.println(+moneyCount + " рубль");
        } else
            System.out.println(+moneyCount + " рублей");
    }
}
