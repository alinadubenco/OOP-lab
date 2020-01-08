package JClass;

import Dates.*;
import java.util.Date;

public class Person{
    String title;
    String givenName;
    String middleName;
    String familyName;
    private Name name;
    Date birthDate;
    Gen gender;
    Address homeaddress;
    PhoneNumber phone;
    Hospital[] hospitalsVisited;

    public Person(String title,String givenName,String middleName,String familyName,Date birthDate,Gen gender,Address homeaddress,PhoneNumber phone){
        this.title=title;
        this.givenName=givenName;
        this.middleName=middleName;
        this.familyName=familyName;
        this.name=new Name(givenName,middleName,familyName);
        this.birthDate=birthDate;
        this.gender=gender;
        this.homeaddress=homeaddress;
        this.phone=phone;
    }
    public void isVizitingTheHospital(Hospital hospital){

        Hospital[] tempHospital= new Hospital[hospitalsVisited.length+1];  // alocated + 1 element space
        for (int i=0;i<hospitalsVisited.length;i++)  // copy the array
        {
            if(hospitalsVisited[i].address==hospital.address)
            {
                return;
            }
            tempHospital[i]=hospitalsVisited[i];
        }

        tempHospital[tempHospital.length-1]=hospital;   // sets the last value with the new added
        hospitalsVisited=tempHospital;
        hospital.gotVisited(this);
    }
    public void displayListOfHospitalsVizited(){
        for (int i = 0;i<hospitalsVisited.length;i++)
        {
            System.out.println(hospitalsVisited[i].name);
        }
    }
}