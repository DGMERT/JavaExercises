public class Main {
    public static void main(String[] args) {
        int[] sayilar = new int[]{1,2,5,7,9,0};
        int aranacak= 4;
        boolean sayiVarmi=false;

        for (int i=0;i<sayilar.length;i++){
            if (aranacak==sayilar[i]){
                sayiVarmi=true;
                break;

            }
        }
        if (sayiVarmi==true){
            System.out.println("Bu sayı var");
        }else {
            System.out.println("Bu sayı yok");
        }


    }
}