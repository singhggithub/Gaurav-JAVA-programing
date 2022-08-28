import java.io.*;

public class program6_6 {
    public static void main(String[] args) {
        String choice = new String();
        BufferedReader  br = new   BufferedReader(new InputStreamReader(System.in));

        System.out.println("Choose your division");
        System.out.println("Honors");
        System.out.println("First");
        System.out.println("second");
        System.out.println("Third");
        System.out.println("Fail");
        System.out.println("Enter your choice --->");
        
        try 
          {
        choice = br.readLine();
         System.out.flush();
         switch (choice)
         {

                case "Honors":
                System.out.println("Marks>= 80%");
                 break;
                 case "First":
                 System.out.println("Marks>= 65% & <80%");
                      break;
                 case "Second":
                 System.out.println("Marks >=55% & <65%");
                 break;
                 case "Third":
                 System.out.println("Marks>= 40% & <55%");
                      break;
                 case "Fail":
                 System.out.println("Marks< 40%");
                 break;     

                 default:
                 System.out.println("Invalid choice");
           }
        }   catch (Exception e)
        {
            System.out.println("I/O Error");
        }
           
    }
}
