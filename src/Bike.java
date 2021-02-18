
class Bike{
 final int SPEED_LIMIT=90;//final variable
 void run(){
 // speedlimit=400;
	 System.out.println("The speed limit of bike is:"+SPEED_LIMIT);
 }
 public static void main(String args[]){
 Bike obj=new  Bike();
 obj.run();
 }
}