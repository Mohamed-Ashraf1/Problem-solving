class Solution {
    public long maxScore(int[] nums1, int[] nums2, int k) {
       
        int[][] arr = new int[nums1.length][2];
        for (int i = 0; i < nums1.length; ++i){
            arr[i] = new int[] {nums2[i], nums1[i]};
        }

        Arrays.sort(arr, (a, b) -> b[0] - a[0]);
        PriorityQueue<Integer> pq = new PriorityQueue<>(k, (a, b) -> a - b);
         long maxScore=0,sum=0;
        for(int[] s:arr){
           pq.add(s[1]);
           sum=sum+s[1];

           if (pq.size() > k) {
            System.out.println(pq.peek());
            sum -= pq.poll();
            }
           if (pq.size() == k){
             maxScore = Math.max(maxScore, (sum * s[0]));
           }
        }

    return maxScore;
        // long maxScore=0l;
        // int min=Integer.MAX_VALUE;
        // PriorityQueue<Integer> p1 = new PriorityQueue<>(Collections.reverseOrder());
        // Integer[] integerArray = Arrays.stream(nums1).boxed().toArray(Integer[]::new);
        // p1.addAll(Arrays.asList(integerArray));
        // PriorityQueue<Integer> p2 = new PriorityQueue<>(Collections.reverseOrder());
        // Integer[] integerArray2 = Arrays.stream(nums2).boxed().toArray(Integer[]::new);
        // p2.addAll(Arrays.asList(integerArray2));
        // int i=k;
        // int add=0;
        // while(i>0){
        //     int curr=p1.poll();
        //     for(int j=0;j<nums1.length;j++){
        //         if(nums1[j]==curr){
        //             min=Math.min(min,nums2[j]);
        //              add+=curr;
        //             break;
        //         }
        //     }
           
        //     i--;
        // }
        // maxScore=add*min;
        // add=0;
        // min=Integer.MAX_VALUE;
        // i=k;
        // while(i>0){
        //     int curr=p2.poll();
        //     for(int j=0;j<nums2.length;j++){
        //         if(nums2[j]==curr){
        //             min=Math.min(min,nums2[j]);
        //             add+=nums1[j];
        //             break;
        //         }
        //     }
        //     i--;
        // }
        // maxScore=Math.max(maxScore,add*min);
        // return maxScore;
    }
}