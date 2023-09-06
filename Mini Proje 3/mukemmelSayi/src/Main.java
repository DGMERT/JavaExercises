public class Main {
    public static void main(String[] args) {
        int number = 5;
        int total = 0;
        if (number <= 0) {
            System.out.println("Geçersiz.");
            return;
        }
        for (int i=1;i<number;i++){
            if (number%i==0){
                total=total+i;
            }
        }
        if (total==number){
            System.out.println("Mükemmel sayıdır :"+number);
        }else {
            System.out.println("Mükemmel sayı değildir : "+number);
        }

    }
}