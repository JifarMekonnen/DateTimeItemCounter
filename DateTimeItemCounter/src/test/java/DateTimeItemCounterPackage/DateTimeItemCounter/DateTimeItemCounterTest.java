package DateTimeItemCounterPackage.DateTimeItemCounter;

import junit.framework.TestCase;
import org.joda.time.DateTime;


public class DateTimeItemCounterTest extends TestCase {

  
	
   
	
	
	
	
	
	
	
    DateTime d0= new DateTime(2014,12,9,20,35);
    
  
    DateTime datetime= new DateTime();
    
    
    DateTime d1= new DateTime(2014,12,9,21,00);
    DateTime d2= new DateTime(2014,12,9,21,20);
    DateTime d3= new DateTime(2014,12,9,21,43);
    DateTime d4= new DateTime(2014,12,9,22,03);
    DateTime d5= new DateTime(2014,12,9,22,24);
    DateTime d6= new DateTime(2014,12,9,22,45);
    DateTime d7= new DateTime(2014,12,9,23,05);
    DateTime d8= new DateTime(2014,12,9,23,27);
    DateTime d9= new DateTime(2014,12,9,23,50);
    DateTime d10= new DateTime(2014,12,10,0,11);
   
    DateTime d11= new DateTime(2014,12,10,0,35);
    DateTime d12= new DateTime(2014,12,10,1,00);
    DateTime d13= new DateTime(2014,12,10,1,20);
    DateTime d14= new DateTime(2014,12,10,1,43);
    DateTime d15= new DateTime(2014,12,10,2,03);
    DateTime d16= new DateTime(2014,12,10,2,24);
    DateTime d17= new DateTime(2014,12,10,2,45);
    DateTime d18= new DateTime(2014,12,10,3,05);
    DateTime d19= new DateTime(2014,12,10,3,27);
    DateTime d20= new DateTime(2014,12,10,3,50);
    DateTime d21= new DateTime(2014,12,10,4,11);
    
   
    
    DateTime array[]={d0,d1,d2,d3,d4,d5,d6,d7,d8,d9,d10,d11,d12,	d13,	d14	,d15	,d16,	d17	,d18	,d19,	d20,d21};
    
    
    DateTimeItemCounterDataHolder dataHolder=new DateTimeItemCounterDataHolder();
    
	DateTimeItemCounter dt_count= new DateTimeItemCounter();
	
	public void testcompare_time()
	    {
		 int result= dt_count.compare_time(dataHolder.dateTimeArray[5],dataHolder.dateTimeArray[4]);
	     assertEquals(-1,result );
	    }
	
    public void testgetTimeDifferenceInMinutes()
    {
	 long result= dt_count.getTimeDifferenceInMinutes(dataHolder.dateTimeArray[4],dataHolder.dateTimeArray[104]);
     assertEquals(2000,result);
    }
	
	public void testgetIndex()
    {
	 int result= dt_count.getIndex(dataHolder.dateTimeArray,dataHolder.dateTimeArray[0]);
     assertEquals(0,result );
    }
	
	
	public void testbinarySearch()
    {
	 int result= dt_count.binarySearch(dataHolder.dateTimeArray,dataHolder.dateTimeArray[999]);
     assertEquals(999,result );
    }
	
	public void testgetNumberOfItems()
    {
	 int[] result= dt_count.getNumberOfItems(dataHolder.dateTimeArray,dataHolder.dateTimeArray[0],dataHolder.dateTimeArray[78]);
	 
     assertEquals("No of Items between the two DateTime items should be ",77,result[1]);
     assertEquals("The index of the first DateTime item in the array should  0 ",0,result[0]);
     
    }
  

}
