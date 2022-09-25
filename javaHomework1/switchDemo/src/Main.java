public class Main {
    public static void main(String[] args) {
        char grade = 'H';
        switch(grade) {
            case 'A':
            System.out.println("mükemmel : geçtiniz");
                break;
            case 'B':
                System.out.println("Çok Güzel : geçtiniz");
                break;
            case 'C':
                System.out.println("iyi : geçtiniz");
                break;
            case 'D':
                System.out.println("Fena değil : geçtiniz");
                break;
            case 'F':
                System.out.println("Maalesef kaldınız");
                break;
            default:
                System.out.println("Geçersiz not girdiniz");
        }
    }
}