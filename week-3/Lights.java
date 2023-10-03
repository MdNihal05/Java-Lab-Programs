import java.util.*;
class Lamps{
	private boolean isOn=false;
	private String LampName;
	Lamps(int LampName){
		if(LampName==1) this.LampName="Led";
		else this.LampName="Halogen";
	}
	void turnOn(){
		if(this.isOn){
			System.out.println("The " +this.LampName+ " is already on\n");
		}else {
			this.isOn=true;
			System.out.println("The " +this.LampName+ " is turned on\n");
		}
	} 
	void turnOff(){
		if(!this.isOn){
			System.out.println("The " +this.LampName+ " is already off\n");
		}else {
			this.isOn=false;
			System.out.println("The " +this.LampName+ " is turned off\n");
		}
	}
	
}
class Lights{
	
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		while(true){
			System.out.println("enter the Lightname to create\n 1.Led \n 2.Halogen\npress 3 to exit\n");
			int LampName=sc.nextInt();
			if(LampName==3) break;
			Lamps lamp=new Lamps(LampName);
			while(true){
				System.out.println("enter the operation to turn on/off 4 operations available \n 1.On   2.off   3.exit");
				int option=sc.nextInt();
				if(option==1) lamp.turnOn();
				else if(option==2) lamp.turnOff();
				else break;
			}
		}
	}
	
}
