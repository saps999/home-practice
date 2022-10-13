class CellPhone{
    String ring;
    String vibrate;
    public String getRing(){
        return "Ringing...";
    }
    public String getVibrate(){
        return "Vibrating...";
    }
}
public class Question2 {
    public static void main(String[] args) {
        CellPhone nokia =new CellPhone();
        System.out.println(nokia.getRing());
        System.out.println(nokia.getVibrate());

    }
}
