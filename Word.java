//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Jacob Merioles

import static java.lang.System.*;

public class Word
{
   private static String vowels = "AEIOUaeiou"; //why is this here?
   	//why is it static? this is a class variable
   
   //add an instance variable
  private String s;

	//create 2 constructors
	public Word(){
    s = "";
  }
  public Word(String str){
    s = str;
  }

  //setter method
  public void setWord(String change){
    s = change;
  }

  //getter method
  public String getWord(){
    return s;
  }

  //getNumVowels
  public int getNumVowels(){
    int count = 0;
    for(int i = 0; i < s.length(); i++){
      for(int x = 0; x < vowels.length(); x++)
        if (s.charAt(i) == vowels.charAt(x))
          count++;
    }
    return count;
  }

  //getLength
  public int getLength(){
    return s.length();
  }

	//create a toString method
  public String toString(){
    return ""+s;
  }
}