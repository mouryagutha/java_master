package arrays;


class Search_method {
    static int findelement(int[] arr, int n , int key)
    {
        for(int i = 0; i<n;i++)
        {
            if(arr[i]== key)
                return i;
        }
        return -1;
    }
    public static  void main(String[] args){
        int arr[] = { 12,34,10,6, 40};
        int n = arr.length;
        int key = 40 ;



        int posistion = findelement(arr,n, key);
        if(posistion == -1)
            System.out.println("Element not found");
        else
            System.out.println("Element found at postion:"+(posistion+1));


    }
}
