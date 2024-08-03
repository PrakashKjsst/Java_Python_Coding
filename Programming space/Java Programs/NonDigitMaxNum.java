public class NonDigitMaxNum{

    public static int maxOfnonDigit(int number,int nonDigit){
        
        for(int i=number; i>0; i--){
            if(!String.valueOf(number).contains(String.valueOf(nonDigit)))
                return number;
            else
                number--;
        }
        return 0;
    }
    public static void main(String[] args){
        int number = 1000;
        int nonDigit = 9;
        int result =  maxOfnonDigit(number,nonDigit);
        System.out.println("The maximum number is "+result);
    }
}