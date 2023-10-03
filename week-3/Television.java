import java.util.*;
class Tv{
	
	private int channel=0,volume=0;
	private boolean isOn=false;
	void TurnOn(){
		if(isOn){
			System.out.println("\nTv is already turned on\n");
		}else{
			System.out.println("\nTv is turned on \n");
			isOn=true;
		}
	}
	void TurnOff(){
		if(!isOn){
			System.out.println("\nTv is already turned off\n");
		}else{
			System.out.println("\nTv is turned off \n");
			isOn=false;
		}
	}
	void setChannel(int channel){
		this.channel=channel;
		System.out.println("\ncurrent channel is :"+this.channel+"\n");
	}
	void setVolume(int volume){
		this.volume=volume;
		System.out.println("\ncurrent volume is :"+this.volume+"\n");
	}
	void ChannelUp(){
		this.channel=Math.min(channel+1,40);
		System.out.println("\ncurrent channel is :"+this.channel+"\n");
	}
	void ChannelDown(){
		this.channel=Math.max(0,channel-1);
		System.out.println("\ncurrent channel is :"+this.channel+"\n");
	}
	void VolumeUp(){
		this.volume=Math.min(volume+1,7);
		System.out.println("\ncurrent volume is :"+this.volume+"\n");
	}
	void VolumeDown(){
		this.volume=Math.max(0,volume-1);
		System.out.println("\ncurrent volume is :"+this.volume+"\n");
	}
	boolean check(){
		if(!isOn){
			System.out.println("\nTurn on the Tv first \n");
			return false;
		}
		return true;
	}
}
class Television{
	
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		Tv tv1=new Tv();
		boolean flag=true;
		while(flag){
			System.out.println("choose the options :\n 1.turn on     2.turn off      3.set channel     4.set volume      5.channel++      6.channe--      7.volume++       8.decrease--     0.exit\n");
			int option=sc.nextInt();
			switch (option){
				case 0:
					flag=false;
					break;
				case 1:
					tv1.TurnOn();
					break;
				case 2:
					tv1.TurnOff();
					break;
				case 3:
					if(tv1.check()){
						System.out.print("\nenter the channel no  : ");
						tv1.setChannel(sc.nextInt());
					}
					break;
				case 4:
					if(tv1.check()){
						System.out.print("\nenter the volume  : ");
						tv1.setVolume(sc.nextInt());
					}
					break;
				case 5:
					if(tv1.check()) tv1.ChannelUp();
					break;
				case 6:
					if(tv1.check()) tv1.ChannelDown();
					break;
				case 7:
					if(tv1.check()) tv1.VolumeUp();
					break;
				case 8:
					if(tv1.check()) tv1.VolumeDown();
					break;
				default :
					flag=false;
					break;	
			}
		}
	}
}
