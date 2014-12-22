package DateTimeItemCounterPackage.DateTimeItemCounter;

import org.joda.time.DateTime;

import junit.framework.TestCase;

public class DateTimeItemCounterGetNumberOfItemsMethodTest extends TestCase {
	  
    DateTimeItemCounterDataHolder dataHolder=new DateTimeItemCounterDataHolder();
    
	DateTimeItemCounter dt_count= new DateTimeItemCounter();
	DateTime testDateTimeAtMiddlePlus1= new DateTime(2014,12,9,20,45); 
	
	public void testgetNumberOfItemsWhenD1GreaterThanD2()
    {
	 int[] result= dt_count.getNumberOfItems(dataHolder.dateTimeArray,dataHolder.dateTimeArray[39],dataHolder.dateTimeArray[30]);
	 
     assertEquals("No of Items between the two DateTime items should be -1",-1,result[1]);
     assertEquals("The index of the first DateTime item in the array should  -1 ",-1,result[0]);
     
    }
	public void testgetNumberOfItemsWhenD1EqualD2()
    {
	 int[] result= dt_count.getNumberOfItems(dataHolder.dateTimeArray,dataHolder.dateTimeArray[30],dataHolder.dateTimeArray[30]);
	 
     assertEquals("No of Items between the two DateTime items should be 0 ",0,result[1]);
     assertEquals("The index of the first DateTime item in the array should index of d1 ",30,result[0]);
     
    }
	
	public void testgetNumberOfItemsWhenD1LessThanD2AndTheirDiffernceIslessthan20()
    {
	 int[] result= dt_count.getNumberOfItems(dataHolder.dateTimeArray,dataHolder.dateTimeArray[0],testDateTimeAtMiddlePlus1);
	 
     assertEquals("No of Items between the two DateTime items should be 0 ",0,result[1]);
     assertEquals("The index of the first DateTime item in the array should index of d1 ",0,result[0]);
     
    }
	
	public void testgetNumberOfItemsWhenD1LessThanD2AndTheirDiffernceIsGreaterthan20()
    {
	 int[] result= dt_count.getNumberOfItems(dataHolder.dateTimeArray,dataHolder.dateTimeArray[0],dataHolder.dateTimeArray[3999]);
	 
     assertEquals("No of Items between the two DateTime items should be ",3998,result[1]);
     assertEquals("The index of the first DateTime item in the array should index of d1 ",0,result[0]);
     
    }
	
}
