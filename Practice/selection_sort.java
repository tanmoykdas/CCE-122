public class selection_sort {
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,8,9,2,4,6,8,10};
        //Selection sort
        for(int i = 0; i < arr.length-1; i++)
        {
            int smallest = i;
            for (int j = i + 1; j<arr.length; j++)
            {
                if (arr[smallest] > arr[j])
                {
                    smallest = j;
                }
                int temp = arr[smallest];
                arr[smallest] = arr[i];
                arr[i] = temp;
            }
        }

        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
