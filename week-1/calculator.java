import java.util.*;
public class calculator{
	public static void main(String... args){
		Scanner sc=new Scanner(System.in);
		while(true){
			System.out.println("choose the operations \n1->addition  \n 2->subtraction  \n 3->multiplication  \n 4->division \n 0->exit\n");
		int option=sc.nextInt();
		if(option==0){
			System.out.println("thank you ");
			break;
		}else if(option<0 || option>4){
			System.out.println("Invalid Option selected please select valid Option\n");
			continue;
		}
		int a,b;
			System.out.println("enter two numbers \n");
			a=sc.nextInt();
			b=sc.nextInt();
			switch(option){
				case 1:
					System.out.println(a+b);
					break;
				case 2:
					System.out.println(a-b);
					break;
				case 3:
					System.out.println(a*b);
					break;
				case 4:
					if(b==0) {
						System.out.println("can't devide by 0\n");
						break;
					}
					System.out.println(a/b);
					break;
			}
		}
	}
}
