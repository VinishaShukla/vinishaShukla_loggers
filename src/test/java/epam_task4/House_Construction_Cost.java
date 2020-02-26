package epam_task4;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class House_Construction_Cost {
	private static final Logger LOGGER=LogManager.getLogger(House_Construction_Cost.class);
	double houseRent(String standard,double area) {
		int costReq;
		if(standard.equals("sm")) {
	
	costReq=1200;
	}
		else if(standard.equals("asm"))
		{
	
			costReq=1500;
	}
		else if(standard.equals("hsm"))
		{
	
			costReq=1800;			
		}
	else {
	costReq=2500;			
	}
		double constructionCost=area*costReq;
		return constructionCost;
		
	}
	    public static void main( String[] args )
	    {
	        //System.out.println( "Hello World!" );
	    	House_Construction_Cost ll=new House_Construction_Cost();
	    LOGGER.info(ll.houseRent("asm", 250.23));   
	    }
	}