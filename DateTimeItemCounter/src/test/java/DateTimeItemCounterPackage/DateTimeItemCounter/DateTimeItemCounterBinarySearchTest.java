package DateTimeItemCounterPackage.DateTimeItemCounter;

import org.joda.time.DateTime;

import junit.framework.TestCase;

public class DateTimeItemCounterBinarySearchTest extends TestCase {
	  
    DateTimeItemCounterDataHolder dataHolder=new DateTimeItemCounterDataHolder();
    
	DateTimeItemCounter dt_count= new DateTimeItemCounter();
	
	DateTime testDateTimeAtFront= new DateTime(2014,12,9,20,05); 
    DateTime testDateTimeAtEnd= new DateTime(2015,02,03,9,55); 
    DateTime testDateTimeAtMiddlePlus1= new DateTime(2014,12,9,20,45); 
	
	public void testbinarySearchWhenD1IsInTheArray()
    {
	 int result= dt_count.binarySearch(dataHolder.dateTimeArray,dataHolder.dateTimeArray[116]);
     assertEquals(116,result );
    }
	
	public void testbinarySearchWhenD1IsNotInTheArrayFront()
    {
	 int result= dt_count.binarySearch(dataHolder.dateTimeArray,testDateTimeAtFront);
     assertEquals(-1,result );
    }
	
	public void testbinarySearchWhenD1IsNotInTheArrayEnd()
    {
	 int result= dt_count.binarySearch(dataHolder.dateTimeArray,testDateTimeAtEnd);
     assertEquals(-4001,result );
    }
	
	public void testbinarySearchWhenD1IsNotInTheArrayMiddle()
    {
	 int result= dt_count.binarySearch(dataHolder.dateTimeArray,testDateTimeAtMiddlePlus1);
     assertEquals(-2,result );
    }
}
