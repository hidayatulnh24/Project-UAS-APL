package APL;

public class DiskonAdapterImpl implements DiskonAdapter{
    private Diskon hp;
    double snA=8500000,sgA=1800000,saA=5800000;
    double snB=8900000,sgB=1650000,saB=5675000;
    double snC=8800000,sgC=1750000,saC=5850000;
    public DiskonAdapterImpl(Diskon hp) {
        this.hp = hp;
    }
    
    @Override
    public double getDiskon1() {
        double pay = hp.getDiskon();
        return convertSetelahDiskon1(pay);
    }
    
    @Override
    public double getDiskon2() {
        double pay = hp.getDiskon();
        return convertSetelahDiskon2(pay);
    }
    
    @Override
    public double getDiskon3() {
        double pay = hp.getDiskon();
        return convertSetelahDiskon3(pay);
    }
    
    @Override
    public double getDiskon4() {
        double pay = hp.getDiskon();
        return convertSetelahDiskon4(pay);
    }
    
    @Override
    public double getDiskon5() {
        double pay = hp.getDiskon();
        return convertSetelahDiskon5(pay);
    }
    
    @Override
    public double getDiskon6() {
        double pay = hp.getDiskon();
        return convertSetelahDiskon6(pay);
    }
    
    @Override
    public double getDiskon7() {
        double pay = hp.getDiskon();
        return convertSetelahDiskon7(pay);
    }
    
    @Override
    public double getDiskon8() {
        double pay = hp.getDiskon();
        return convertSetelahDiskon8(pay);
    }
    
    @Override
    public double getDiskon9() {
        double pay = hp.getDiskon();
        return convertSetelahDiskon9(pay);
    }
    
    private double convertSetelahDiskon1(double pay) {
        double discount1 = snA-(snA*pay);
        return discount1; 
    }
    
    private double convertSetelahDiskon2(double pay) {
        double discount2 = sgA-(sgA*pay);
        return discount2;
    }
    
    private double convertSetelahDiskon3(double pay) {
        double discount3 = saA-(saA*pay);
        return discount3;
    }
    
    private double convertSetelahDiskon4(double pay) {
        double discount4 = snB-(snB*pay);
        return discount4;
    }
    
    private double convertSetelahDiskon5(double pay) {
        double discount5 = sgB-(sgB*pay);
        return discount5;
    }
    
    private double convertSetelahDiskon6(double pay) {
        double discount6 = saA-(saA*pay);
        return discount6;
    }
    
    private double convertSetelahDiskon7(double pay) {
        double discount7 = snC-(snC*pay);
        return discount7;
    }
    
    private double convertSetelahDiskon8(double pay) {
        double discount8 = sgC-(sgC*pay);
        return discount8;
    }
    
    private double convertSetelahDiskon9(double pay) {
        double discount9 = saC-(saC*pay);
        return discount9;
    }
}
