



public static  Node insert(Node head,int data) {
       Node n=new Node(data);
       if(head==null)
       {
           head=n;
           return n;
       }
       else
       {
           Node temp=head;
           while(temp.next!=null)
           temp=temp.next;

           temp.next=n;
           return head;

       }  
    }
} 

