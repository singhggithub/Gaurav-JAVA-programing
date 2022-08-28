public class program6_2 {
    public static void main(String[] args) {
        int number[] = {50,56,37,90,10,5,9,30,2,21};
        int even = 0 , odd = 0;

        for(int i = 0 ; i< number.length;i++ ){  // number.length gives length of int number[]
            if((number[i] % 2)== 0){     // Decide even or odd
                even += 1;              // counting even number
            }

            else{
                odd += 1;  // counting odd number
            }
        }
        int total = even+odd;

        System.out.println("Even numbers : "+even+" odd numbers :"+odd);
        System.out.println("total numbers ="+total);
    }
}

        // 💯💯💯💯💯💯💯💯💯💯💯💯💯💯💯💯💯💯💯💯💯💯💯💯💯