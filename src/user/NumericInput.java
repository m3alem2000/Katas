package user;

public class NumericInput extends TextInput {
	int numericInput;
	
	@Override
	public void add(char c) {
		if(Character.isDigit(c)){
		super.add(c);
		}
	}
	
}


//Implement the class NumericInput that:
//
//Inherits from TextInput
//Overrides the add method so that each non-numeric character is ignored