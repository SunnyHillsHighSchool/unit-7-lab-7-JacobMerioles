//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Jacob Merioles

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class Words
{
	private ArrayList<Word> words;
  private static String vowels = "AEIOUaeiou";

	public Words(String[] wordList)
	{
    words = new ArrayList<Word>();
    for(int i = 0; i < wordList.length; i++)
      words.add(new Word(wordList[i]));
	}

	public int countWordsWithXChars(int size)
	{
		int count = 0;
    for(Word i: words)
      if(i.getLength() == size)
        count++;
		return count;
	}
	
	//this method will remove all words with a specified size / length
	//this method will also return the sum of the vowels in all words removed
	public int removeWordsWithXChars(int size)
	{
    int count=0;
    ArrayList<Word> rem = new ArrayList<Word>();
    for(int i = words.size()-1; i >= 0; i--)
      if (words.get(i).getLength() == size){
        count += words.get(i).getNumVowels();
        rem.add(words.get(i));
        words.remove(i);
      }
    return count;
	}

	public int countWordsWithXVowels(int numVowels)
	{
		int count=0;
    for(Word i: words){
      if(i.getNumVowels() == numVowels)
        count++;
    }
		return count;
	}
	
	//add in a toString
  public String toString(){
    return "" + words;
  }
}