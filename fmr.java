
import java.until.*;
import java.until.regrex.*;
public class fmr{
	public static void main(String[] args{
		for(int i = 0; i < args.length; i++){
			 if(args[i].equals("-h")){
				System.out.println("This program takes in a input and regrex and outputs the found tokens of the regrex");
				System.exit(0);//why?
			}//if
		}//for
		int fileInput = -1;
		for(int i = 0; i< args.length; i++){
			if(args[i].equals("-f"){
				fileInput = i;
			}//if
		}//for
		if(fileInput != -1){

			String
		}//else{
		if(fileInput != -1){
			String filename = args[fileInput +1];
			Pattern pattern = Pattern.compile(args[fileInput +2]);
			try{
					FileReader freader = new FileReader(filename);
					BufferedReader br = new BufferedReader(freader);
			}catch{
			}
			}eles{

		String line = args[0];
		String regrex = args[1];
		Pattern pattern = Patteren .compile(regex);	
		Matcher matcher = pattern.matcher(line);
		boolean found = false;
		while(matcher.find()){
			System.out.println.("I found text") + matcher.group() + "String at index" + matcher.start() + "and ending at index" + matcher.end());
		}//while matcher
		if(!found){
		System.out.println("No match found");
		}//if

	}//main
}//class

