public class Test3 {

    public static int getNumberUpperCase(String str){//In this method you can create another variable called x because it's "outside" of the scope of the previous method.
        int sum = 0;
        for(int x = 0; x < str.length(); x++){//TODO; learn string methods with parentheses .lenght()
            if(str.charAt(x) >= 'A' && str.charAt(x) <= 'Z'){
                sum++;
            }
        }
        return sum;
    }
    public static int getNumberOfUpperCase(String[] arrStr){
        int sum = 0;
        for(int x = 0; x < arrStr.length; x++){
            String word = arrStr[x];
            sum += getNumberUpperCase(word);
        }
        return sum;
    }

    public static void main(String[] args){
        String[] words = {"ChsarDacDdter", "ROsDGWS", "LSDogs"};
        int total = getNumberOfUpperCase(words);
        System.out.println(total);
    }
}