  public class sumnumbers
  {
     public int GetSum(int a, int b)
     {
      
      int upper = a; 
      int lower = b;
      
      if (a == b)
        return a;
      else
       if (b > a){
         upper = b;
         lower = a;       
       }
       
       return (upper - lower + 1) * (lower + upper) / 2;
     }
  }