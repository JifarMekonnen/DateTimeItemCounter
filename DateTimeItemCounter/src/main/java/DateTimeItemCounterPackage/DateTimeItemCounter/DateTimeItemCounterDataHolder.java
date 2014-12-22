package DateTimeItemCounterPackage.DateTimeItemCounter;

import java.util.Random;

import org.joda.time.DateTime;

public class DateTimeItemCounterDataHolder {
	
    DateTime dateTimeArray[] = new DateTime[4000];
	
    public DateTimeItemCounterDataHolder(){
    	populateDateTimeArray();
    	
    }
	
    void populateDateTimeArray(){
		DateTime datetime= new DateTime(2014,12,9,20,35);
		for(int i=0;i<4000;i++){
			
			dateTimeArray[i]=datetime.plusMinutes(i*20);
		
		}
	}
	
    
	 DateTime createDateTime(int i){
		DateTime datetime= new DateTime(2014,12,9,20,35);
		datetime.plusMinutes(i*20);
		DateTime datetimereturn= datetime;
		return datetimereturn;
	}
	
	 int getRandomBetweenMinAndMax(int min, int max){

	    
	    Random rand = new Random();

	    // nextInt is normally exclusive of the top value,
	    // so add 1 to make it inclusive
	    int randomNum = rand.nextInt((max - min) + 1) + min;

	    return randomNum;
	}

}
