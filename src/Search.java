public class Search {
    private Node top;

   public void push(String search){
       Node newNode= new Node(search);
       newNode.next=top;
       top=newNode;
   }
   public void pop(){
       if(top==null){
           System.out.println("The history is empty!");

       }
       else {
           System.out.println("The removed search has been: " + top.search);
           top=top.next;

       }
   }
   public void displaySearches() {
       if (top == null) {
           System.out.println("The history is empty!");
       } else {
           Node temp = top;
           while (temp != null) {
               System.out.println(temp.search);
               temp = temp.next;
           }
           System.out.println("null");
       }
   }
       public void displayLastSearch(){
           if(top!=null){
               System.out.println("The last history is: " + top.search);
           }
       }
       public void displayTotalSearches(){
        int i=0;
        Node temp = top;
        while(temp!=null){
            temp=temp.next;
            i++;
        }
           System.out.println("The history size is: " + i);
       }
       public void IsHistoryNull(){
       if(top==null){
           System.out.println("The history is null!");
       }
       else {
           System.out.println("The history is not null");
       }
       }
   }

