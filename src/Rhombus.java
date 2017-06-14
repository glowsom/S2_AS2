
public class Rhombus {

	public static void main(String[] args) {
		// TODO Printing out a Rhombus of alphabets implements nested loops and Type-cast.
		
		byte ascii;
		char letter;
		int space;
		int column = 1;

		for(int i=0; i<5; i++){

			space = Math.abs(i-2);			//Determines how many spaces must come before each line starts
			for(int j=0; j<space; j++)
				System.out.print(" ");
			
			ascii = 97;					//Sets/resets decimal value for 'a'
			letter = (char)ascii;			//Type casts to retrieve char value
		
			for(int j=0; j<column; j++){
				System.out.print(letter);		//Prints current char value
				
				if(j<(column/2))
					ascii++;				
				else
					ascii--;				
				letter=(char)ascii;			//sets decimal value for next char
			}
			System.out.println();
			if(i<2)							//Determine the number of chars to be printed on next line.
				column +=2;	
			else
				column -=2;
		}

	}

}
