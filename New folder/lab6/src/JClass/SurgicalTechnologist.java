package JClass;

import JClass.Person;

import java.util.Date;

public class SurgicalTechnologist extends Technologist{
    public SurgicalTechnologist(Person person, Date joined, String[] education, String[] certification, String[] languages ) {
        super( person, joined, education, certification, languages );
    }
}