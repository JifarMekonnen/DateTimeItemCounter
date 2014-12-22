package DateTimeItemCounterPackage.DateTimeItemCounter;

import junit.framework.TestCase;

public class DateTimeItemCounterGetTimeDifferenceMethodTest extends TestCase {
	   DateTimeItemCounterDataHolder dataHolder=new DateTimeItemCounterDataHolder();
	    
	   DateTimeItemCounter dt_count= new DateTimeItemCounter();
	   
	   public void testgetTimeDifferenceInMinutesWhenD1EqualToD2()
	    {
		 long result= dt_count.getTimeDifferenceInMinutes(dataHolder.dateTimeArray[100],dataHolder.dateTimeArray[100]);
	     assertEquals(0,result);
	    }
	   
	   public void testgetTimeDifferenceInMinutesWhenD1GreaterThanD2()
	    {
		 long result= dt_count.getTimeDifferenceInMinutes(dataHolder.dateTimeArray[100],dataHolder.dateTimeArray[10]);
	     assertEquals(-1,result);
	    }
	   
	   public void testgetTimeDifferenceInMinutesWhenD1LessThanD2()
	    {
		 long result= dt_count.getTimeDifferenceInMinutes(dataHolder.dateTimeArray[10],dataHolder.dateTimeArray[100]);
	     assertEquals(90*20,result);
	    }
}
