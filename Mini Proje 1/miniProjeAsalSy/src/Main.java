public class Main {
    public static void main(String[] args) {
        int number = 6;
        boolean isPrime=true;

        if (number<2){
            System.out.println("Geçersiz");
        }

        for (int i=2;i<number;i++){
            if (number%i==0){
                isPrime=false;
            }
        }
        if (isPrime){
            System.out.println("Asal sayı ");
        }else {
            System.out.println("Asal değil  ");
        }


    }
}

