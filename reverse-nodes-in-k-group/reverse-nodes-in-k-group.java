           if(oh == null){
               oh = th;
               ot = tt;
           }else{
               ot.next = th;
               ot = tt;
           }
​
           th = null;
           tt = null;
       }
​
       ot.next = curr;
       return oh;
    }
    
    public int length( ListNode head ){
        int size = 0;
        ListNode curr = head;
        while( curr != null ) {
            curr = curr.next;
            size++;
        }
        return size;
    }
    
    public void addFirst(ListNode node){
        if( th == null ){
            th = node;
            tt = node;
        }else{
            node.next = th;
            th = node;
        }
    }
}
