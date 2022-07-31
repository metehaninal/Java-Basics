public class repeats {

    static boolean isFind(int[] arr, int value){
        for (int i : arr) {
            if(i == value){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[] = {1,3,41,2,3,41,51,1,1,2,6,15,6,3,3,2};
        int dublicates[] = new int[arr.length];
        int startingIndex = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if((i != j) && (arr[i] == arr[j])){
                    if(!isFind(dublicates, arr[i])){
                        dublicates[startingIndex++] = arr[i];
                    }   
                    break;
                }
            }
        }

        for (int i = 0; i < dublicates.length; i++) {
            int counter = 0;
            for (int j = 0; j < arr.length; j++) {
                if(dublicates[i] == arr[j]){
                    counter++;
                }
            }
            if(dublicates[i] != 0)
                System.out.println(dublicates[i]+" repeted "+ counter +" times");
        }
    }
}
