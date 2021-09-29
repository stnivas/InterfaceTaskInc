import java.io.*;

interface bike{

  int price;
  
  void run();
      
   }
 class Part implements bike{
 	   int price =500;
 	   public void run(){
 	   	System.out.println("im running ");
 	   }
 	public static void main(String[] args){
 		Part obj=new Part();
 		obj.run();
 		System.out.println(price);
 	}	
 	   	
 }	   	
 	       
       	
