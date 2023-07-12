public class SecondsAndMinutes {

    public static void main(String [] args){

        System.out.println(getDuration(3700));
     //   System.out.println(getDuration(130,55));
    }

    public static String getDuration(int seconds){

       if(seconds<0){
           System.out.println("Seconds cant be negative");
       }
        int minutes= seconds/60;


       // int remainingMinutes= minutes % 60;
       // int remainingSeconds= seconds %60;

        return getDuration(minutes /60,seconds %60);
    }

    public static String getDuration(int minutes, int seconds){

        if(seconds<0 || seconds>59){
            System.out.println("Invalid operation seconds can take only 0 to 59");
        }
            int hours = minutes % 60;

            int remainingMinutes = minutes % 60;
            int Seconds1 = seconds;

        return hours + "h" + remainingMinutes + "m" + Seconds1 + "s";
    }
}
