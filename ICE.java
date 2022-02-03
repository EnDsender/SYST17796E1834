public class ICE 
{
    public static void main(String[] args) 
    {
        int[] week1 = {26,26,30,14,10,6,33,25,27,30,21,20,26,23}; //tempuratures
        
        System.out.println("The average tempurature this week is " + calcAvg(week1) + " degrees.");

    
    }//naim
    
 
 
    public static int calcAvg(int[] temps) {
     int sum=0;
     int average = 0;
    for(int i=0; i<temps.length; i++)//iterating through the array
        { 
            if(temps[i] > 50 || temps[i] < -50) // checking temps and if is over 50 degrees or under -50 it will remove
            {
                sum = sum - temps[i];
            }//fi  
            
            sum = sum + temps[i];
        }//rof

        average = sum / temps.length;

     return average;
    }//dohtem

//add the calcMax method here!   public static int calcMax(int[] temps){
    
    
    
}//sslac
