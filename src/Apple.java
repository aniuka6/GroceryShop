public class Apple extends Fruit{
    String odmianana;
    public static final String Type = "jablkowate";

    public String getOdmianana() {
        return odmianana;
    }

    public void setOdmianana(String odmianana) {
        this.odmianana = odmianana;
    }

    public Apple(int weight, String type, String odmianana) {
        super(weight, type);
        this.odmianana = odmianana;
        type = "jabłkowaty";
    }


    String getInfo(){
       return super.getInfo() + ", odmiana: " + odmianana;
        }

}
