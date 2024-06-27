package javadsa.trapwater;

public class trap {
    public static int trappedwater (int arr[]){
        int leftmx[]=new int[arr.length];
        leftmx[0]=arr[0];
        for(int i=1;i<arr.length;i++){
         leftmx[i]=Math.max(leftmx[i], leftmx[i-1]);
        }
        int rightmx[]=new int[arr.length];
        rightmx[arr.length-1]=arr[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            rightmx[i]=Math.max(arr[i], arr[i+1]);
        }
        int trapwater=0;
        for (int i=0;i<arr.length;i++){
            int waterlevel=Math.min(rightmx[i], leftmx[i]);
            trapwater=trapwater+waterlevel-arr[i];
        }
        return trapwater;

    }
    public static void main(String[] args) {
        int arr[] ={4,2,0,6,3,2,5};
        int n= trappedwater(arr);
        System.out.println(n);
    }
    
}
