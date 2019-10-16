package lab3;
import java.util.Arrays;

public class Main {
    public static void main (String[] args) {
        String str = "Sometime we can feel a bit dull in the morning and we need to produce our own sunshine energy." +
                " I’m selfish, impatient and a little insecure. I make mistakes, I am out of control and at times hard to handle. But if you can’t handle me at my worst, then you sure as hell don’t deserve me at my best. " ;


        Text text = new Text (str);

        System.out.println("The nr of sentences = "+text.nrOfSentences);
        System.out.println("The nr of consonants = "+text.nrOfconsonants);
        System.out.println("The nr of letters = "+text.nrOfLetters);
        System.out.println("The nr of vowels = "+text.nrOfVowels);
        System.out.println("The nr of words = "+text.nrOfWords);
        System.out.println("Top 5 words by their frequency = "+ Arrays.toString( text.getTop5() ) );
        System.out.println("The longest word in text: "+text.longest+"("+text.longest.length()+" chars)");

    }

}
