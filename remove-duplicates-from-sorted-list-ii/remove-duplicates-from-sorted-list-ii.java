        
        while( curr != null && curr.next != null ){
            if( curr.val == curr.next.val ){
                while( curr != null && curr.next != null && curr.val == curr.next.val ){
                    curr = allDuplicates(curr);
                }   
                if(prev != null ) prev.next = curr;
            }
            prev = curr;
            if( curr != null ) curr = curr.next;
        }
        
        return head;
    }
    
    public ListNode headDuplicates(ListNode head){
        if( head == null ) return null;
        
        int val = head.val;
        while( head != null && head.val == val ){
            head = head.next;
        }
        return head;
    }
    
    public ListNode allDuplicates(ListNode head){
        if( head == null ) return head;
        
        int val = head.val;
        //if(head.val == head.next.val){
            while( head != null && head.val == val ){
                head = head.next;
            }
        //}
        return head;
    }
}
