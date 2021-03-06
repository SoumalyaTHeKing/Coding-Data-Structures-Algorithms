class Trp{
    public static int minFun(int i, int j){
        if(i<j){
            return i;
        }else{
            return j;
        }
    } 
    public static int waterStored(int[] ar){
        int[] leftArr=new int[ar.length];
        int[] rightArr=new int[ar.length];
        int maxValued;

        maxValued=ar[0];
        for(int i=0;i<ar.length;i++){
            if(ar[i]<maxValued){
                leftArr[i]=maxValued;
            }
            else{
                maxValued=ar[i];
                leftArr[i]=maxValued;
            }
        }
        maxValued=ar[ar.length-1];
        for(int j=ar.length-1;j>=0;j--){
            if(ar[j]<maxValued){
                rightArr[j]=maxValued;
            }
            else{
                maxValued=ar[j];
                rightArr[j]=maxValued;
            }
        }
        int total =0;
        int[] water=new int[ar.length];
        for(int i=0;i<ar.length;i++){
            water[i]=minFun(leftArr[i], rightArr[i])-ar[i];
            total+=water[i];
        }
        return total;
    }
    public static void main(String[] args) {
        int ar[]={4,1,2,3,1,2};
        int total= waterStored(ar);
        System.out.println(total);
    }
}

// class Solution {
//     public int minFun(int i, int j){
//         if(i<j){
//             return i;
//         }else{
//             return j;
//         }
//     } 
//     public int waterStored(int[] ar){
//         int[] leftArr=new int[ar.length];
//         int[] rightArr=new int[ar.length];
//         int maxValued;

//         maxValued=ar[0];
//         for(int i=0;i<ar.length;i++){
//             if(ar[i]<maxValued){
//                 leftArr[i]=maxValued;
//             }
//             else{
//                 maxValued=ar[i];
//                 leftArr[i]=maxValued;
//             }
//         }
//         maxValued=ar[ar.length-1];
//         for(int j=ar.length-1;j>=0;j--){
//             if(ar[j]<maxValued){
//                 rightArr[j]=maxValued;
//             }
//             else{
//                 maxValued=ar[j];
//                 rightArr[j]=maxValued;
//             }
//         }
//         int total =0;
//         int[] water=new int[ar.length];
//         for(int i=0;i<ar.length;i++){
//             water[i]=minFun(leftArr[i], rightArr[i])-ar[i];
//             total+=water[i];
//         }
//         return total;
//     }
//     public int trap(int[] height) {
//         if(height.length==0){ return 0;}
//         int output= waterStored(height);
//         return output;
//     }
// }