
public class threadDemo {
	public static void main(String[] args){
		odd obj1=new odd();
		even obj2=new even();
		obj1.start();
		try{
			Thread.sleep(10);
		}catch(Exception e){
		System.out.println("error occured");
		}
		
		obj2.start();
		
	}

}
class odd extends Thread{
	public void run(){
		for(int i=1;i<5;i++){
			System.out.println("hi");
			try{
				Thread.sleep(1000);
			}catch(Exception e){}
		}
	}
}

class even extends Thread{
	public void run(){
		for(int i=1;i<5;i++){
			System.out.println("hello");
			try{
				Thread.sleep(1000);
			}catch(Exception e){}
		}
	}
}
