package prx;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Proxy {

	 public static void main(String[] args) {
		 
		
		List<Image> images = new ArrayList<>();	
		images.add(new ProxyImage("photo1"));
        images.add(new ProxyImage("photo2"));
        images.add(new ProxyImage("photo3"));
        images.add(new ProxyImage("photo4"));
        images.add(new ProxyImage("photo5"));
        images.add(new ProxyImage("photo6"));
        images.add(new ProxyImage("photo7"));
        
        
		for(Image image : images) {
			image.showData();
		}
		
		
		Scanner scanner = new Scanner(System.in);
		int UsrIn =0;
		boolean exit = true;
		
	
		while(exit) {
			System.out.println("[1] prev [2] next [3] show all [4] exit");
            System.out.println("You are at: " + UsrIn);
            String choice = scanner.nextLine();
            
            
		 switch(choice) {
		 	
	            case "1":
	            	UsrIn--;
	                    if (UsrIn < 0) {
	                    	UsrIn = 0;
	                    } else {
	                        images.get(UsrIn).displayImage();
	                    }
	                break;
	                
	            case "2":
	            	UsrIn++;
	            	if (UsrIn > images.size() - 1) {
                        UsrIn = images.size();
                    } else {
                        images.get(UsrIn).displayImage();
                    }
	                break;
	                
	            case "3":
	                  for(Image image : images) {
	                	  image.displayImage();
	                  }
	                break;
	                
	            case "4":
	                exit = false;
	                break;	                
	     }
		 
	 }
	
}
}