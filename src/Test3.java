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

    public static double[] computeRowSums(double[][] arrDouble) {
        double[] sum = {};
        for (int rows = 0; rows < arrDouble.length; rows++) {
            for (int col = 0; col < arrDouble[rows].length; col++) {
                double total = 0.0;
                total += arrDouble[rows][col];
                sum[rows] = total;
            }
        }
        return sum;
    }

    public static void main(String[] args){
        double[][] numbers = {{2,-3.2,3},{3.4,2,4.5}};
        double[] total = computeRowSums(numbers);
        System.out.println(total);
    }
}