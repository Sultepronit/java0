public class App {
    public static void main(String[] args) {
       System.out.printf("Total cost %d; quantity is %d\n", 5, 200);
       System.out.printf("Total cost %10d; quantity is %d\n", 5, 200);
       System.out.printf("Total cost %-10d; quantity is %d\n", 5, 200);
       
       for(int i = 0; i < 20; i++) {
    	   System.out.printf("%2d: some text here\n", i);
       }
       
       System.out.printf("%2d: %s\n", 33, "here is some text");
       
       float number = 5.6f;
       double dNumber = 5.6;
       System.out.println(number);
       System.out.println(dNumber);
       System.out.printf("Some number %f\n", number);
       System.out.printf("Some number %f\n", dNumber);
       System.out.printf("Some number %.2f\n", number);
       System.out.printf("Some number %.2f\n", dNumber);
       
       System.out.printf("Some number '%7.2f'\n", 32.578);
       
       String text = String.format("%4d; %s", 77, "some text");
       
       System.out.println(text);
       
    }
}
