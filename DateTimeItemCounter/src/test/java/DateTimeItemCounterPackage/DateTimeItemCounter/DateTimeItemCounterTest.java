package DateTimeItemCounterPackage.DateTimeItemCounter;

import junit.framework.TestCase;



public class DateTimeItemCounterTest extends TestCase {

    
    DateTimeItemCounterDataHolder dataHolder=new DateTimeItemCounterDataHolder();
    
	DateTimeItemCounter dt_count= new DateTimeItemCounter();
	
	public void testcompare_time()
	    {
		 int result= dt_count.compare_time(dataHolder.dateTimeArray[99],dataHolder.dateTimeArray[990]);
	     assertEquals(1,result );
	    }
	
    public void testgetTimeDifferenceInMinutes()
    {
	 long result= dt_count.getTimeDifferenceInMinutes(dataHolder.dateTimeArray[100],dataHolder.dateTimeArray[104]);
     assertEquals(80,result);
    }
	
	public void testgetIndex()
    {
	 int result= dt_count.getIndex(dataHolder.dateTimeArray,dataHolder.dateTimeArray[116]);
     assertEquals(116,result );
    }
	
	public void testbinarySearch()
    {
	 int result= dt_count.binarySearch(dataHolder.dateTimeArray,dataHolder.dateTimeArray[116]);
     assertEquals(116,result );
    }
	
	public void testgetNumberOfItems()
    {
	 int[] result= dt_count.getNumberOfItems(dataHolder.dateTimeArray,dataHolder.dateTimeArray[30],dataHolder.dateTimeArray[39]);
	 
     assertEquals("No of Items between the two DateTime items should be ",8,result[1]);
     assertEquals("The index of the first DateTime item in the array should  0 ",30,result[0]);
     
    }
  

}
