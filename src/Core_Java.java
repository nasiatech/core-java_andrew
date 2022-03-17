public class Core_Java {
    public static int reverse(int num){
        int remainder = 0;
        int rev = 0;
        while(num > 0){
            remainder = num % 10;
            rev = (rev * 10) + remainder;
            num = num / 10;
        }
        return rev;
    }

    public static void main(String[] args){
        System.out.println(reverse(1235));
    }

}
