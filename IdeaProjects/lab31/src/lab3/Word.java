package lab3;

public class Word {
    String word;
    int vowels;
    int consonants;
    int letters;

    Word(String s)
    {
        this.word= s;
        for (int i=0;i<s.length ();i++)
        {

            if (s.charAt (i)=='a'||s.charAt (i)=='e'||s.charAt (i)=='i'||s.charAt (i)=='o'||s.charAt (i)=='u'||s.charAt (i)=='y'||
                    s.charAt (i)=='A'||s.charAt (i)=='E'||s.charAt (i)=='I'||s.charAt (i)=='O'||s.charAt (i)=='U'||s.charAt (i)=='Y'
            )
                vowels++;


            else if ((s.charAt(i)>=65 && s.charAt (i)<=90)||(s.charAt (i)>=97 && s.charAt (i)<=122))
                consonants++;
        }
        letters=vowels+consonants;



    }
}
