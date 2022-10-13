public class array_2d {
    public static void main(String[] args) {
        int array[]={1,2,4,-3,-1,5,6};
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                for (int k = j+1; k < array.length ; k++) {
                    if (array[i]+array[j]+array[k]==0){
                        System.out.println("numbers found : "+array[i]+", "+array[j]+", "+array[k]);
                    }
                }
            }
        }
    }
}
