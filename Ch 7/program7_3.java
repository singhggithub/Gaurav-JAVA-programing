public class program7_3 {
    public static void main(String[] args) {
        long p;
        int n;
         double q;
         System.out.println("2 to power -n  & n to power n");
          p = 1 ;
          for(n = 0 ; n<10; ++n)
          {
              if(n == 0)
              {
                  p = 1;
              }
              else
                  p = p*2;
                q = 1.0 /(double)p;
                System.out.println("    "+q +"    "+n+"    "+p);  // four times space in every ""  
              
          }
    }
}
