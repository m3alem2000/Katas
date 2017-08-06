package user;
public class TextInput {

	String textInput="";

	public void add(char c){
		textInput = textInput + c;
	}

	public String getValue(){
		return textInput;
	}

}
//    Implement the class TextInput that contains:
//
//    	Public method void add(char c) - adds the given character to the current value
//    	Public method String getValue() - returns the current value