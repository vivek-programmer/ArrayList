import java.util.*;
public class Maxwater {
    // public static int Max(ArrayList<Integer> list){
    //     int max=0;
    //     for(int i=0;i<list.size();i++){
    //         for(int j=i+1;j<list.size();j++){
    //             int h=Math.min(list.get(i), list.get(j));
    //             int b=j-i;
    //             int c=h*b;
    //             max=Math.max(max, c);
    //         }
    //     }
    //     return max;
    // }
    public static int Max (ArrayList<Integer> list){
        int max=0;
        int lp=0;
        int rp=list.size()-1;
        while(rp>lp){
            int h=Math.min(list.get(lp), list.get(rp));
            int b=rp-lp;
            int currWater=h*b;
             max=Math.max(max, currWater);
            if(list.get(rp)>list.get(lp)){
                lp++;
            }
            else {
                rp--;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>();
        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(3);
        list.add(7);
        System.out.println(Max(list));
    }
}
