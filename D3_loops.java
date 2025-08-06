public class D3_loops {
    public static void main(String[] args) {

        // FOR-LOOP
        for(int i=0; i<100; i++) {
            System.out.println("value of i is : " + i); 
        }

        //WHILE-LOOP
        int n = 91;
        while(n<=102) {
            System.out.println(n);
            n++;
        }

        //DO-WHILE LOOP
        int i = 6;
        do{
            System.out.println(i);
            i++;
        }
        while(i<=7);

        // FOR-EACH LOOP
        int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        for(int m:a) {
            System.out.print(m + " ");
        }
    }
}
