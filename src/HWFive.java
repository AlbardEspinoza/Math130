public class HWFive {//This code was created by Albard Espinoza. //TODO; write the last time you worked on this code
        public static int getDifference(int[] array){
            int smallest = array[0];
            for(int x = 0; x < array.length; x++){
                if(smallest > array[x]){
                    smallest = array[x];
                }
            }
            int largest = array[0];//Can two variables be assigned the same array value?
            for(int y = 0; y < array.length; y++){
                if(largest < array[y]){
                    largest = array[y];
                }
            }
            return smallest + largest;
        }

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
                sum = sum + getNumberUpperCase(word);
            }
            return sum;
        }

}
