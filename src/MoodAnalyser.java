public class MoodAnalyser {
    String message;
    public MoodAnalyser(String message) {
        this.message=message;
    }

    public static String analyseMood(String message) {
        try {
            message.contains(null);
            System.out.println("SAD");
            return "SAD MOOD";
        }
        catch (NullPointerException e){
            System.out.println("HAPPY");
            return "HAPPY MOOD";
        }
    }
    public void analyse(){
        MoodAnalyser.analyseMood(message);
    }


    public static void main(String[] args) {
       new MoodAnalyser("").analyse();
    }
}
