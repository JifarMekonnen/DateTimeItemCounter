package DateTimeItemCounterPackage.DateTimeItemCounter;
import org.joda.time.DateTime;
import junit.framework.TestCase;

public class DateTimeItemCounteGetIndexMethodTest extends TestCase {
	 DateTimeItemCounterDataHolder dataHolder=new DateTimeItemCounterDataHolder();
	   
     DateTimeItemCounter dt_count= new DateTimeItemCounter();
     DateTime testDateTimeAtFront= new DateTime(2014,12,9,20,05); 
     DateTime testDateTimeAtEnd= new DateTime(2015,02,03,9,55); 
     DateTime testDateTimeAtMiddlePlus1= new DateTime(2014,12,9,20,45); 
     DateTime testDateTimeAtMiddleMinus1= new DateTime(2014,12,9,20,44); 
     
 	public void testgetIndexWhenD1IsInTheArray()
     {
 	 int result= dt_count.getIndex(dataHolder.dateTimeArray,dataHolder.dateTimeArray[116]);
      assertEquals(116,result );
     }
 	
 	public void testgetIndexWhenD1IsNotInTheArrayAndIsAtFront()
    {
	 int result= dt_count.getIndex(dataHolder.dateTimeArray,testDateTimeAtFront);
     assertEquals(0,result );
    }
 	
 	public void testgetIndexWhenD1IsNotInTheArrayAndIsAtEnd()
    {
	 int result= dt_count.getIndex(dataHolder.dateTimeArray,testDateTimeAtEnd);
     assertEquals(3999,result );
    }
 	
 	public void testgetIndexWhenD1IsNotInTheArrayAndIsAtMiddlePlus1()
    {
	 int result= dt_count.getIndex(dataHolder.dateTimeArray,testDateTimeAtMiddlePlus1);
     assertEquals(1,result );
    }
 	public void testgetIndexWhenD1IsNotInTheArrayAndIsAtMiddleMinus1()
    {
	 int result= dt_count.getIndex(dataHolder.dateTimeArray,testDateTimeAtMiddleMinus1);
     assertEquals(0,result );
    }
}
