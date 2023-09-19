import java.util.*;

public class CommandLine{
	
	public static void main(String... args){
	
		if(args.length==0){
			System.out.println("arguments not found");
			return ;
		}
		for(String arguments:args) System.out.print(arguments+" ");
		
	}
}
