package DetectCycle;

import java.io.*;

static boolean HasCycle(Node head) {
    if (head == null){
        return false;
    }
    Node slow = head;
    Node fast = head;

    while(slow != null && slow.next != null) {        
        slow = slow.next;
        fast = fast.next.next;
        
        if(fast == null || slow == null) {
            return false;
        }
        if(fast == slow){
            return true;
        }
    }
    return false;  
}