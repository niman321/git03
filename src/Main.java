public class Main {
    public static void main(String[] args) {
        int a= 7*3+6/2-5;
        int b= 21-8+a%3*11;
        if (a<b){
            System.out.println("A<B");
            if (a==b){
                System.out.println("A==B");
                if (a>b){
                    System.out.println("A>B");

                }
            }
        }

    }
}