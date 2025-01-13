package Collections;

public class Enums {
    enum Week{

        //enums Constant
        //public static and final
        //since its final you can create final enums
        //type is week

        Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday;

       Week(){

           // this is not public or protected ,only private or default..
           //Why? we do not want to create objects..

            System.out.println("Constructor called " + this);
       }
    }

    public static void main(String[] args) {

        Week week;
        week = Week.Monday;

        for(Week day : Week.values()){
            System.out.println(day);
        }
        System.out.println(week);
    }
}
