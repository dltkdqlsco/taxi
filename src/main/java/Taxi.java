public class Taxi {
    String taxiName;
    int money;

    public Taxi(String taxiName){
        this.taxiName = taxiName;
    }

    public void take(int pay){
        this.money += pay;
    }

    public void showTaxiInfo(){
        System.out.println(taxiName + " 수입은 " + money + "원 입니다.");
    }
}
