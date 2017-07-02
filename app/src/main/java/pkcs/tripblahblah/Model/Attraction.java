package pkcs.tripblahblah.Model;

import java.util.List;

/**
 * Created by bgh29 on 2017-07-02.
 */

public class Attraction {
    private String name;
    private String address;
    private AttractionType type;
    private List<String> imagePath;

    public Attraction(String name, String address, AttractionType type, List<String> imagePath){
        this.name = name;
        this.address = address;
        this.type = type;
        this.imagePath = imagePath;
    }

    public String getName() {return name;}
    public List<String> getImagePath() {return imagePath;}
    public String getAddress() {return address;}
    public AttractionType getType() {return  type;}
}
