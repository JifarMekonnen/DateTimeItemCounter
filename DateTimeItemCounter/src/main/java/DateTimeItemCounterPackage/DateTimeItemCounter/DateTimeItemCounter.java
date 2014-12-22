package DateTimeItemCounterPackage.DateTimeItemCounter;
import java.util.Arrays;
import org.joda.time.DateTime;


public class DateTimeItemCounter {

	 
	 int[] getNumberOfItems(DateTime array[],DateTime d1, DateTime d2)
	  { 
	    int returnArray[]={-1,-1};// returnArray[0] will contain index of d1 and returnArray[1] will contain number of items between d1 and d2
	    int switch_item = compare_time(d1,d2);
	    int  index_d1=getIndex(array,d1);
	    int  index_d2=getIndex(array,d2);
	    
	    if(array.length==0)
	      {
	        System.out.println("error 1: the DateTime array is empty! \n");
	        return returnArray;
	      }
	    switch (switch_item)
	    {
	        case  0:
	           returnArray[0]=index_d1;
	           returnArray[1]=0;
	           return returnArray; 
	        
	        case -1:
	           System.out.println("error 2: DateTime d2 is Before DateTime d1"); 
	           return returnArray;
	          
	        case  1:
	         if(getTimeDifferenceInMinutes(d1,d2)<= 20)  
	               {  
	                  returnArray[0]=index_d1;
	                  returnArray[1]=0;
	                  return returnArray;
	               }
	           
	  
	         if(index_d1== index_d2)
	               {
	                   returnArray[0]=index_d1;
	                   returnArray[1]=0;
	                   return returnArray;
	         
	               }
	         else{    
	                  
	                   returnArray[0]=index_d1;
	                   returnArray[1]=index_d2 - index_d1 - 1; // number of items between two indexes is thier difference minus 1 
	                   return returnArray;
	                
	         }
	        default:
	           return returnArray;
	    }
	  }  
	    
	 int compare_time(DateTime d1,DateTime d2)
	  { 
	    if(d2.getMillis() == d1.getMillis())
	        {
	         return 0;
	        }
	    else if(d2.getMillis() > d1.getMillis())
	            {
	            return 1;
	            }
	         else 
	            {
	            return -1;
	            }
	     
	  }
	 
	 long getTimeDifferenceInMinutes(DateTime d1,DateTime d2)
	  {
	   return (d2.getMillis() - d1.getMillis())/60000;
	  
	  }
	 
	 int getIndex(DateTime array[], DateTime dt)
	{
	    Arrays.sort(array); // may be omitted if array is already sorted
	   int rowBSResult = binarySearch(array, dt); 
	  
	   if(rowBSResult >= 0){return rowBSResult;} 
	   
	   else{
	          int BSResult=(rowBSResult+1)* -1;
	          if(BSResult==0){return BSResult;} 
	          if(BSResult==array.length){return (BSResult-1);}
	          else{
	               if(getTimeDifferenceInMinutes(dt,array[BSResult])<= getTimeDifferenceInMinutes(array[BSResult-1],dt))
	                       {
	                          return BSResult;
	                       }
	               else
	                       {
	                          return (BSResult-1);
	                       }
	              }
	  
	        }
	   
	}

	 
	 int binarySearch(DateTime[] array,
	                                     DateTime key) {
	        int low = 0;
	        int high = array.length - 1;

	        while (low <= high) {
	            int mid = (low + high) >>> 1;
	            DateTime midVal = array[mid];

	            if (compare_time(midVal,key)==1)
	                low = mid + 1;
	            else if (compare_time(midVal,key)==-1)
	                high = mid - 1;
	            else
	                return mid; // key found
	        }
	        return -(low + 1);  // key not found.
	    }
 
	
}

