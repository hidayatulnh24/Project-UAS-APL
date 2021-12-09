package APL;

import java.util.Scanner;

interface BuyHandphone {

    public void PriceHandphone();
}

class PhoneStoreA implements BuyHandphone {

    @Override
    public void PriceHandphone() {
        System.out.println("Samsung Note 8 Rp 8.500.000");
        System.out.println("Samsung Galaxy A03s Rp 1.700.000");
        System.out.println("Samsung Galaxy A72 Rp 5.800.000");
    }

}

class PhoneStoreB implements BuyHandphone {

    @Override
    public void PriceHandphone() {
        System.out.println("Samsung Note 8 Rp 8.900.000");
        System.out.println("Samsung Galaxy A03s Rp 1.650.000");
        System.out.println("Samsung Galaxy A72 Rp 5.675.000");
    }

}

class PhoneStoreC implements BuyHandphone {

    @Override
    public void PriceHandphone() {
        System.out.println("Samsung Note 8 Rp 8.800.000");
        System.out.println("Samsung Galaxy A03s Rp 1.750.000");
        System.out.println("Samsung Galaxy A72 Rp 5.850.000");
    }

}

class PhoneStore {

    private BuyHandphone buyHandphone;

    public void setBuyHandphone(BuyHandphone phoneStore) {
        this.buyHandphone = phoneStore;
    }

    public BuyHandphone getBuyHandphone() {
        return buyHandphone;
    }

    public void PriceHandphone() {
        buyHandphone.PriceHandphone();
    }
}

public class ProjectAPL {

    private static Scanner scanner;

    public static void main(String[] args) {

        System.out.println("Choose Phone Store : 'PhoneStoreA' or 'PhoneStoreB' or 'PhoneStoreC' ");
        scanner = new Scanner(System.in);
        String ps = scanner.next();
        System.out.println("Pilihan Phone Store Yang Di Tuju : " + ps);

        PhoneStore phoneStore = null;
        phoneStore = new PhoneStore();

        if ("PhoneStoreA".equalsIgnoreCase(ps)) {
            phoneStore.setBuyHandphone(new PhoneStoreA());
            phoneStore.PriceHandphone();
            System.out.println("Metode Pembayaran");
            System.out.println("1.Cicilan AkuLaku Diskon 5%");
            System.out.println("2.Cicilan ShopeePayLatter Diskon 4%");
            System.out.print("Pilih Pembayaran : ");
            scanner = new Scanner(System.in);
            int byr = scanner.nextInt();
            switch (byr) {
                case 1:
                    Diskon akulaku = new AkuLaku();
                    DiskonAdapter dAakuLaku = new DiskonAdapterImpl(akulaku);
                    System.out.println("Samsung Note 8 " + dAakuLaku.getDiskon1());
                    System.out.println("Samsung Galaxy A03s " + dAakuLaku.getDiskon2());
                    System.out.println("Samsung Galaxy A72 " + dAakuLaku.getDiskon3());
                    break;
                case 2:
                    Diskon shoppepaylatter = new ShopeePayLatter();
                    DiskonAdapter dashopeepaylatter = new DiskonAdapterImpl(shoppepaylatter);
                    System.out.println("Samsung Note 8 " + dashopeepaylatter.getDiskon1());
                    System.out.println("Samsung Galaxy A03s " + dashopeepaylatter.getDiskon2());
                    System.out.println("Samsung Galaxy A72 " + dashopeepaylatter.getDiskon3());
                    break;
            }
        } else if ("PhoneStoreB".equalsIgnoreCase(ps)) {
            phoneStore.setBuyHandphone(new PhoneStoreB());
            phoneStore.PriceHandphone();
            System.out.println("Metode Pembayaran");
            System.out.println("1.Cicilan AkuLaku Diskon 5%");
            System.out.println("2.Cicilan ShopeePayLatter Diskon 4%");
            System.out.print("Pilih Pembayaran : ");
            scanner = new Scanner(System.in);
            int byr = scanner.nextInt();
            switch (byr) {
                case 1:
                    Diskon akulaku = new AkuLaku();
                    DiskonAdapter dAakuLaku = new DiskonAdapterImpl(akulaku);
                    System.out.println("Samsung Note 8 " + dAakuLaku.getDiskon4());
                    System.out.println("Samsung Galaxy A03s " + dAakuLaku.getDiskon5());
                    System.out.println("Samsung Galaxy A72 " + dAakuLaku.getDiskon6());
                    break;
                case 2:
                    Diskon shoppepaylatter = new ShopeePayLatter();
                    DiskonAdapter dashopeepaylatter = new DiskonAdapterImpl(shoppepaylatter);
                    System.out.println("Samsung Note 8 " + dashopeepaylatter.getDiskon4());
                    System.out.println("Samsung Galaxy A03s " + dashopeepaylatter.getDiskon5());
                    System.out.println("Samsung Galaxy A72 " + dashopeepaylatter.getDiskon6());
                    break;
            }
        } else if ("PhoneStoreC".equalsIgnoreCase(ps)) {
            phoneStore.setBuyHandphone(new PhoneStoreC());
            phoneStore.PriceHandphone();
            System.out.println("Metode Pembayaran");
            System.out.println("1.Cicilan AkuLaku Diskon 5%");
            System.out.println("2.Cicilan ShopeePayLatter Diskon 4%");
            System.out.print("Pilih Pembayaran : ");
            scanner = new Scanner(System.in);
            int byr = scanner.nextInt();
            switch (byr) {
                case 1:
                    Diskon akulaku = new AkuLaku();
                    DiskonAdapter dAakuLaku = new DiskonAdapterImpl(akulaku);
                    System.out.println("Samsung Note 8 " + dAakuLaku.getDiskon7());
                    System.out.println("Samsung Galaxy A03s " + dAakuLaku.getDiskon8());
                    System.out.println("Samsung Galaxy A72 " + dAakuLaku.getDiskon9());
                    break;
                case 2:
                    Diskon shoppepaylatter = new ShopeePayLatter();
                    DiskonAdapter dashopeepaylatter = new DiskonAdapterImpl(shoppepaylatter);
                    System.out.println("Samsung Note 8 " + dashopeepaylatter.getDiskon7());
                    System.out.println("Samsung Galaxy A03s " + dashopeepaylatter.getDiskon8());
                    System.out.println("Samsung Galaxy A72 " + dashopeepaylatter.getDiskon9());
                    break;
            }
        }

    }
}
