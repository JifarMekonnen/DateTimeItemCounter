package DateTimeItemCounterPackage.DateTimeItemCounter;

import junit.framework.TestCase;

public class DateTimeItemCounterCompareDateTimeMethodTest extends TestCase {
	 DateTimeItemCounterDataHolder dataHolder=new DateTimeItemCounterDataHolder();
	    
	 DateTimeItemCounter dt_count= new DateTimeItemCounter();
	 
	 public void testcompare_timeWhenD1EqualToD2()
	    {
		 int result= dt_count.compare_time(dataHolder.dateTimeArray[99],dataHolder.dateTimeArray[99]);
	     assertEquals(0,result );
	    }
		
	 public void testcompare_timeWhenD1GreaterThanD2()
	    {
		 int result= dt_count.compare_time(dataHolder.dateTimeArray[990],dataHolder.dateTimeArray[99]);
	     assertEquals(-1,result );
	    }	
	 
	 public void testcompare_timeWhenD1LessThanD2()
	    {
		 int result= dt_count.compare_time(dataHolder.dateTimeArray[9],dataHolder.dateTimeArray[99]);
	     assertEquals(1,result );
	    }	
}
