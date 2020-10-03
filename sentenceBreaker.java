import java.util.Scanner;
import java.util.ArrayList;
class sentenceBreaker
{
    static public void main(String[] args)
    {
        System.out.println("This program will take a string and break it into an ArrayList");
        
        //Creating objects
        ArrayList<String> brokenSentence = new ArrayList<String>();
        Scanner input = new Scanner(System.in);

        System.out.print("Type a sentence: ");
        String sentence = input.nextLine();
        String[] sentenceArray = sentence.split(" ");

        for (int i = 0; i < sentenceArray.length; i++)
        {
            brokenSentence.add(sentenceArray[i]);
        }

        //Displaying the sentence
        System.out.println("Here is your sentence.");
        for (int i = 0; i < brokenSentence.size(); i++)
        {
            System.out.print(brokenSentence.get(i) + " ");
        }
        System.out.print("\n\n");

        //Displaying the sentence backwards
        System.out.println("Here is your sentence, but backwards");
        for (int i = brokenSentence.size() - 1; i >= 0; i--)
        {
            System.out.print(brokenSentence.get(i) + " ");
        }
        System.out.print("\n\n");

        //Swapping out a word
        String newWord;
        System.out.print("Type the index of a value that you want to replace: ");
        int sentenceIndex = input.nextInt();
        newWord = input.nextLine();
        while (sentenceIndex < 0 && sentenceIndex > brokenSentence.size())
        {
            System.out.print("Invalid option, type a different index: ");
            sentenceIndex = input.nextInt();
            newWord = input.nextLine();
        }
        System.out.print("Type a word that will be replacing it: ");
        newWord = input.nextLine();
        brokenSentence.set(sentenceIndex, newWord);
        System.out.println("Here is your new sentence");
        for (int i = 0; i < brokenSentence.size(); i++)
        {
            System.out.print(brokenSentence.get(i) + " ");
        }
        System.out.print("\n");

    }
}