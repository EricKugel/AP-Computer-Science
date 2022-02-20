import java.util.Scanner;

public class MadLib
{
	public static void main(String[] arg0)
	{
		Scanner scanner = new Scanner(System.in);
		
		String[] prompts = {"RELATIVE", "ADJECTIVE", "ADJECTIVE", "ADJECTIVE", "NAME OF PERSON IN ROOM" , "ADJECTIVE", null, "ADJECTIVE", "VERB ENDING IN \"ING\"", "TYPE OF RELATIVE", "YOUR NAME"};
		String[] answers = new String[prompts.length];
		for (int i = 0; i < prompts.length; i++) {
			if (prompts[i] != null) {
				System.out.println(prompts[i] + ":");
				String response = scanner.nextLine().toUpperCase();
				answers[i] = response;
			}
			else {
				answers[i] = answers[4];
			}
		}
		
		String madLib = "\nDear __,\nI am having a(n) __ time at camp. "
		+ "The counselor is __ and the food is __.  I met __ and we became __ friends. "
		+ "Unfortunately, __ is __ so we couldn’t go __ like everybody else. \n" 
		+ "Your __, \n__\n";
		
		String underScore = "__";
		int answerIndex = 0;
		int insertIndex = madLib.indexOf(underScore);
		while (insertIndex > -1) {
			madLib = madLib.substring(0,insertIndex) + "_" + answers[answerIndex] + "_" + madLib.substring(insertIndex + underScore.length());
			insertIndex = madLib.indexOf(underScore);
			answerIndex++;
		}
		
		while(1==1) {
			System.out.println(madLib);
			System.out.println("Care to replace a word?");
			String word = scanner.nextLine();
			System.out.println("Replace \"" + word + "\" with what?");
			String replacement = scanner.nextLine();
			madLib = madLib.substring(0, madLib.indexOf(word)) + replacement + madLib.substring(madLib.indexOf(word) + word.length());
		}
	}
}
