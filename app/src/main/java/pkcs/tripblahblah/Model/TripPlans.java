package pkcs.tripblahblah.Model;

import java.util.Date;
import java.util.List;

/**
 * Created by bgh29 on 2017-07-02.
 */

public class TripPlans {
    private String title;
    private Date startDate;
    private Date finishDate;
    private List<Attraction> attractionList;
    private List<Date> dateList;

    public TripPlans(String title, Date startDate, Date finishDate, List<Attraction> attractionList, List<Date> dateList) {
        this.title = title;
        this.startDate = startDate;
        this.finishDate = finishDate;
        this.attractionList = attractionList;
        this.dateList = dateList;
    }

    public String getTitle() {return title;}
    public Date getStartDate() {return startDate;}
    public Date getFinishDate() {return finishDate;}
    public List<Attraction> getAttractionList() {return attractionList;}
    public List<Date> getDateList() {return dateList;}
}