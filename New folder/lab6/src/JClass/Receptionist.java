package JClass;


import java.util.Date;

public class Receptionist extends FrontDeskStaff {
    public Receptionist(Person person, Date joined, String[] education, String[] certification, String[] languages ) {
        super( person, joined, education, certification, languages );
    }
}