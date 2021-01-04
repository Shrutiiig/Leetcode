        }else {
            pair = B[j] ;
            j++;
        }
        int[] min_pair = new int[2];
        
        while( i < A.length && j < B.length ){
            
            if( A[i][0] < B[j][0] ) {
                min_pair = A[i];
                i++;
            }else{
                min_pair = B[j];
                j++;
            }
            
            
            if( min_pair[0] < pair[1] ){
                int[] ans_ = new int[2];
                ans_[0] = Math.max( min_pair[0],pair[0] );
                ans_[1] = Math.min( min_pair[1],pair[1] );
                ans.push( ans_ );
            }
            else if( min_pair[0] == pair[1] ){
                int[] ans_ = new int[2];
                ans_[0] = pair[1];
                ans_[1] = pair[1];
                ans.push( ans_ );
            }
            pair[0] = Math.min( min_pair[0],pair[0] );
            pair[1] = Math.max( min_pair[1],pair[1] );
        }
        
        while( i < A.length ){
            min_pair = A[i];
            if( min_pair[0] < pair[1] ){
                int[] ans_ = new int[2];
                ans_[0] = Math.max( min_pair[0],pair[0] );
                ans_[1] = Math.min( min_pair[1],pair[1] );
                ans.push( ans_ );
            }
            else if( min_pair[0] == pair[1] ){
                int[] ans_ = new int[2];
                ans_[0] = pair[1];
                ans_[1] = pair[1];
                ans.push( ans_ );
            }
            pair[0] = Math.min( min_pair[0],pair[0] );
            pair[1] = Math.max( min_pair[1],pair[1] );
            i++;
