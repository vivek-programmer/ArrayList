
// import java.util.ArrayList;

// public class twoSums {
//     public static boolean Search(ArrayList<Integer>list,int target){
//         int bp=-1;
//         int n=list.size();
//         for(int i=0;i<list.size();i++){
//             if (list.get(i)>list.get(i+1)){
//                 bp=i;
//                 break;
//             }
//         }
//         int rp=bp;
//         int lp=bp+1;
//         while(rp!=lp){
//             if(list.get(lp)+list.get(rp)==target){
//                 return true;
//             }
//             if (list.get(lp)+list.get(rp)<target){
//                 lp=(lp+1)%n;
//             }
//             else {
//                 rp=(n+rp-1)%n;
//             }
//         }
//         return false;
//     }
//     public static void main(String[] args) {
//         ArrayList<Integer>list= new ArrayList<>();
//         list.add(11);
//         list.add(15);
//         list.add(2);
//         list.add(5);
//         list.add(7);
//         System.out.println(Search(list, 9));
//     }
// }
