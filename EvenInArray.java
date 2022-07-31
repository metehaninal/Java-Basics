

public class EvenInArray {

    static boolean isFind(int[] arr,int value){
        for (int i : arr) {
            if(i == value){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[] = {1,3,41,2,3,1,54,2,6,15,6};
        int dublicates[] = new int[arr.length];
        int startingIndex = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if((i != j) && (arr[i] == arr[j]) && (arr[i] % 2 == 0)){
                    if(!isFind(dublicates, arr[i])){
                        dublicates[startingIndex++] = arr[i];
                    }   
                    break;
                }
            }
        }

        for (int i : dublicates) {
            if(i != 0){
                System.out.print(i+ " ");
            }
        }
        
    }
}
