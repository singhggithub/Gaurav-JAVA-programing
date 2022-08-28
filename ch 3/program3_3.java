
    class room{
        // here class is private
        float length;
        float breadth;
        
        void data(float a, float b) {  // void is public by default 
            
            length = a;
            breadth = b;
        }
    }
    public class program3_3 {
    public static void main(String args[]) {
        
        float area ;
        
        room room1 = new room();   // room room1  = new room(); is creating new object room1
        room1.data(5,5);
        area = room1.length*room1.breadth;
        
        System.out.println("Area = "+area);
        
        
    }
    }

