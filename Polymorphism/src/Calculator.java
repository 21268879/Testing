import org.joda.time.DateTime;
import org.joda.time.Duration;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import java.util.Date;


public class Calculator {


    public double calculateWeb(){
        WebBasedAdvert testWeb = new WebBasedAdvert();
        double webBased = 300.50;
        return webBased;
    }

    public double calculateEmail(){
        double emailAd = 100.50;
        return emailAd;
    }
    public double calculateTV(){
        double tvAd = 1200.50;
        return tvAd;
    }
    public double calculateRadio(){
        double radioAd = 400.50;
        return radioAd;
    }
    public double calculateNewspaper(){
        double newspaperAd = 50.50;
        return newspaperAd;
    }
    public double calculateMagasine(){
        double magasineAd = 150.50;
        return magasineAd;
    }

/*    public Duration calculatesDates(Date startDate, Date endDate){
        Duration diffDuration = new Duration(startDate, endDate);
        return diffDuration;
    }*/
}
