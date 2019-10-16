package lab3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class Text{

    String s;
    int nrOfSentences;
    public Sentence[] textArray;
    private List<Word> words = new ArrayList<>();
    int nrOfWords = 0;
    int nrOfLetters = 0;

    String[] top5;
    int nrOfVowels = 0;
    int nrOfconsonants = 0;
    public Word[] splitedScentence;
    HashMap<String, Integer> hashMap = new HashMap<>();
    String longest;
    int maxString=0;


    public  Text( String s ) {
        this.s = s;
        textArray = split();
        nrOfSentences = textArray.length;

        for ( int i = 0 ; i < textArray.length ; i++ ){
            splitedScentence = textArray[ i ].split();
            for ( int j = 0 ; j < splitedScentence.length ; j++ ){
                words.add( splitedScentence[ j ] );
                nrOfconsonants += splitedScentence[ j ].consonants;
                nrOfVowels += splitedScentence[ j ].vowels;
                nrOfLetters += splitedScentence[ j ].letters;
            }
            nrOfWords += splitedScentence.length;
        }


        for ( int i = 0 ; i < words.size() ; i++ ){

            if (maxString<words.get( i ).word.length())
            {
                longest=words.get( i ).word;
                maxString=words.get( i ).word.length();
            }

            if (hashMap.containsKey( words.get( i ).word.toLowerCase() )) {
                hashMap.put( words.get( i ).word.toLowerCase(), hashMap.get( words.get( i ).word.toLowerCase() ) + 1 );    // if the hashmap contains the string it will override that string with itself but with a value greater with 1
            } else {
                hashMap.put( words.get( i ).word.toLowerCase(), 1 );
            }
        }
    }

    private Sentence[] split() {
        String[] array = this.s.split( "\\.+\\s+|!\\s+|\\?\\s+|;\\s+" );
        Sentence[] sentencearray = new Sentence[ array.length ];
        for ( int i = 0 ; i < array.length ; i++ ){
            sentencearray[ i ] = new Sentence( array[ i ] );
        }
        return sentencearray;
    }
    public  String[] getTop5()
    {
        String[] top= new String[5];

        //1array - stores the string
        //2array - stores the nr of words
        String[] strArr= new String[hashMap.size()];
        int[] int2Arr= new int[hashMap.size()];
        Iterator iterator= hashMap.keySet().iterator();
        for (int i=0; iterator.hasNext();i++)
        {
            strArr[i]=(String) iterator.next();
            int2Arr[i]=hashMap.get( strArr[i] );

        }
        bubbleSort(strArr,int2Arr);
        if(strArr.length>=5) {
            for ( int i = 0 ; i < 5 ; i++ ){
                top[ i ] = strArr[ strArr.length - i-1 ];
            }
        } else {
            for ( int i = 0 ; i < strArr.length ; i++ ){
                top[ i ] = strArr[ strArr.length - i-1 ];
            }
        }
        return  top;
    }
    private void bubbleSort(String[] strArr, int[] intArr){
        int tempint;
        String tempstr;
        for (int i=0;i<strArr.length;i++)
        {
            for ( int j=0;j<strArr.length-i-1;j++ )
            {
                if (intArr[j]>intArr[j+1])
                {
                    tempint=intArr[j];
                    intArr[j]=intArr[j+1];
                    intArr[j+1]=tempint;

                    tempstr=strArr[j];
                    strArr[j]=strArr[j+1];
                    strArr[j+1]=tempstr;
                }
            }
        }
    }

}
