public class Main {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "Vasile";
        student1.age = 18;
        student1.mark = 7.5;

        Student student2 = new Student();
        student2.name = "Ion";
        student2.age = 19;
        student2.mark = 10;

        Student student3 = new Student();
        student3.name = "Maria";
        student3.age = 20;
        student3.mark = 5.4;

        Student student4 = new Student();
        student4.name = "Stefan";
        student4.age = 21;
        student4.mark = 6.25;

        Student student5 = new Student();
        student5.name = "Livia";
        student5.age = 19;
        student5.mark = 7.85;

        Student student6 = new Student();
        student6.name = "Kesha";
        student6.age = student4.age;
        student6.mark = 8.2;

        Student student7 = new Student();
        student7.name = "Petru";
        student7.age = student5.age;
        student7.mark = 9.57;

        Student student8 = new Student();
        student8.name = "Mirela";
        student8.age = student1.age;
        student8.mark = 7.6;

        Student student9 = new Student();
        student9.name = "Andrei";
        student9.age = 24;
        student9.mark = 9.86;


        University university1 = new University();
        university1.name1 = "TUM";
        university1.FoundationYear = 1990;

        University university2 = new University();
        university2.name1 = "USM";
        university2.FoundationYear = 1700;

        University university3 = new University();
        university3.name1 = "ULIM";
        university3.FoundationYear = 2000;


        Student[] tumstudentArray = {student1, student2, student3};
        Student[] usmstudentArray = {student4, student5, student6};
        Student[] ulimstudentArray = {student7, student8, student9};


        double sum1 = 0;
        double average1 = 0;
        for (int i = 0; i<3; i++){
         sum1 +=  tumstudentArray[i].mark ;
        }
        average1 = sum1/3;
        System.out.println("The TUM average is " + average1);


        double sum2 = 0;
        double average2 = 0;
        for (int i = 0; i<3; i++){
            sum2 +=  usmstudentArray[i].mark ;
        }
        average2 = sum2/3;
        System.out.println("The USM average is " + average2);


        double sum3 = 0;
        double average3 = 0;
        for (int i = 0; i<3; i++){
            sum3 +=  ulimstudentArray[i].mark ;
        }
        average3 = sum3/3;
        System.out.println("The ULIM average is " + average3);

    }

}
