public class program6_1 {
    public static void main(String[] args) {
        int i; 
        float weight[] = { 45.0f, 45.0f, 45.0f, 89.0f, 94.0f };
        float height[] = { 188.0f, 169.0f, 256.0f, 239.0f, 563.0f };
      int  people = 0;
      int  H_W = 0;   // Height_weight
      int  others = 0;

        for (i = 0; i <= 4 ; i++) {
            if (weight[i] < 50.0 && height[i] > 170.0) {
                H_W = H_W + 1;
            }
            people = people + 1; // total persons

        }

        others = people - H_W;
        System.out.println("Number of person with ...");
        System.out.println("weight<50 and height>170 = " + H_W);
        System.out.println("others = " + others);

    }
}
//💯💯💯💯😎😎😎😎😎🥱🥱🥱🥱🥱🥱