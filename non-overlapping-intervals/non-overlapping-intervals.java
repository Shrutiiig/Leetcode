class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        if( intervals.length == 0 || intervals[0].length == 0 ) return 0;
        
        Arrays.sort( intervals,(a,b) -> {
            return a[1] - b[1];
        });
        
        int count = 0;
        int[] pair = intervals[0];
        int[] slot = new int[2];
        
        for( int i=1; i<intervals.length; i++ ) {↔}
        return count;
    }
}    
    
//     public int eraseOverlapIntervals(int[][] intervals) {
//         int count = 0;
//         if(intervals.length == 0 || intervals[0].length == 0)
//             return count;
//         Arrays.sort(intervals,(a,b)->a[1]-b[1]);//sort based on end val
//         int prevEnd = intervals[0][1];
//         for(int i = 1;i<intervals.length;i++){
//             if(intervals[i][0] < prevEnd){ //if current start is less than prev end it means it overlaps
//                 count++;   // and need to remove then increament the count
//             }else{ //if it does not overlap update the prevEnd with current interval end
//                 prevEnd = intervals[i][1]; //intervals[i][1] -- end n intervals[i][0] -- start
//             }
//         }
//         return count;
//     }
// }
