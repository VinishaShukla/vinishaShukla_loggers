package epam_task4;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class InterestCalculation {
	private static final Logger LOGGER=LogManager.getLogger(InterestCalculation.class);

	double IntrestMethod(String CalculationType,double Amount,double NoOfYears,double rateOfIntrest) {
        
        double SimpleIntrest,CompoundIntrest;
		if(CalculationType=="SimpleIntrest")
		{
			LOGGER.info("Calculation of Simple_Interest");
         SimpleIntrest=(Amount * NoOfYears * rateOfIntrest)/100;
         return SimpleIntrest;
		}
		else if(CalculationType=="CompoundIntrest")
		{
			 LOGGER.info("Calculation of Compound_Interest");
         CompoundIntrest=Amount * Math.pow(1.0+rateOfIntrest/100.0,NoOfYears) - Amount;
         return CompoundIntrest;
		}
		else
			return 0.0;
	}
	public static void main(String args[]) {
		InterestCalculation ap=new InterestCalculation();
	    LOGGER.info(ap.IntrestMethod("SimpleIntrest",50000,10,5));
	    LOGGER.info(ap.IntrestMethod("CompoundIntrest",50000,10,5));
	    }
}


