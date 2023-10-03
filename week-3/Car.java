import java.util.*;

class Cars{
	private String company,color;
	public int speed, mileage;
	Cars(String company,String color,int speed,int mileage){
		this.company=company;
		this.color=color;
		this.speed=speed;
		this.mileage=mileage;
	}
	void setMileage(int mileage){
		this.mileage=mileage;
	}
	void setSpeed(int speed){
		this.speed=speed;
	}
	void carDetails(){
		System.out.println("\ncompany : "+this.company+"\ncolor :"+this.color+"\nspeed :"+this.speed+"\nmillage :"+this.mileage+"\n");
	}
	void getMileage(){
		System.out.println("\n"+mileage+"Km/Litre");
	}
	void getSpeed(){
		System.out.println("\n"+speed+"Km/Hour");
	}
	
}
class Car{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		Cars arr[]=new Cars[3];
		arr[0]=new Cars("innova","Silver",200,20);
		arr[1]=new Cars("BMW","Red",350,15);
		arr[2]=new Cars("Rolls Roys","Black",350,20);
		Cars minFuel=new Cars("","",0,0);
		Cars minTime=new Cars("","",0,0);
		for(int i=0;i<3;++i) {
			if(arr[i].mileage>minFuel.mileage){
				minFuel=arr[i];
			}
			if(arr[i].speed>minTime.speed){
				minTime=arr[i];
			}
		}
		System.out.println("car with min fuel consumption is \n");
		minFuel.carDetails();
		System.out.println("car with min time required  is \n");
		minTime.carDetails();
		
	}
}
