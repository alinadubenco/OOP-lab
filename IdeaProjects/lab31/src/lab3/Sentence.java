package lab3;

import java.util.Arrays;

public class Sentence {
    String sentence;
    int nrOfWords;
    Sentence(String s)
    {
        this.sentence=s;
    }
    public Word[] split()
    {
        String[] array = this.sentence.split ("\\W+");
        System.out.println( Arrays.toString( array ) );
        Word[] wordArray=new Word[array.length];
        nrOfWords=array.length;
        for (int i =0;i<array.length;i++)
        {
            wordArray[i]= new Word (array[i]);
        }
        return wordArray;
    }
}
