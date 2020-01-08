package JClass;

import JClass.AdministrativeStaff;
import java.util.Date;

public class FrontDeskStaff extends AdministrativeStaff {
    public FrontDeskStaff(Person person, Date joined, String[] education, String[] certification, String[] languages ) {
        super( person, joined, education, certification, languages );
    }

    public static class History {
    }
}