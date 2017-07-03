package pkcs.tripblahblah.Model;


import java.util.List;

/**
 * Created by bgh29 on 2017-07-02.
 */

public class User {
    private String name;
    private String email;
    private String imagePath;
    private List<TripPlans> ownTrupPlans;
    private Boolean isGuide;

    public User() {
        this.isGuide = false;
    }

    public User(String name, String email, String imagePath){
        this();
        this.name = name;
        this.email = email;
        this.imagePath = imagePath;
    }

    public User(String name, String email, String imagePath, List<TripPlans> tripPlans){
        this(name, email, imagePath);
        this.ownTrupPlans = tripPlans;
    }

    public String getName() { return name; }
    public String getEmail() {return email;}
    public String getImagePath() {return imagePath;}
    public List<TripPlans> getOwnTrupPlans() {return ownTrupPlans;}
    public Boolean getIsGuide() {return isGuide;}
}
