public class D3_jumpSTMT {
    public static void main(String[] args) {

        // SWITCH-STATEMENTS
        int n = 6;
        switch(n){
            case 1: System.out.println("current plan details");
            break;

            case 2: System.out.println("talk to our custemer");
            break;

            case 3: System.out.println("new plans are avialable");
            break;

            case 4: System.out.println("choose you intrested plan");
            break;

            default : System.out.println("Your input is Invalid! \n EXIT...");
        }

        //BREAK-STATEMENT
        for(int i=5; i<10; i++) {
            if(i == 5) {
                //break;
                System.out.println(i);
                System.out.println("Hello Friends : ");
            }
        }
    }
}
