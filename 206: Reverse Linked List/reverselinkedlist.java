import java.util.Stack;

public class reverselinkedlist {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
        }
        static ListNode head = null;

        static void push(int value)  
        {  
            ListNode new_node= new ListNode();
        
            new_node.val = value;  
            new_node.next = (head);  
            (head) = new_node;  
        }


    public ListNode reverseList(ListNode head) {
        if(head==null || head.next==null)
            return head;
        ListNode ptr= new ListNode();
        ptr=head;
        Stack<ListNode> stk= new Stack<>();
        while(ptr.next != null)
        {
            stk.push(ptr);
            ptr=ptr.next;
        }
        head=ptr;
        while(!stk.isEmpty())
        {
            ListNode node= new ListNode();
            node=stk.pop();
            node.next=null;
            ptr.next=node;
            ptr=ptr.next;

        }
        return head;
    }
    public static void main(String[] args){
        reverselinkedlist obj=new reverselinkedlist();

        //Example 1
        push(6);
        push(5);
        push(4);
        push(3);
        push(2);
        push(1);

        ListNode reverse= obj.reverseList(head);
        while(reverse!= null)
        {
            System.out.print(reverse.val+ " ");
            reverse=reverse.next;
        }
    }
}
