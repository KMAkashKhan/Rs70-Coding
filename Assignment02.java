public class Assingnment02
{
  public static void main (String [] args)
  {
    LinkedListprogram list1 = new LinkedListProgram();
    
  }
}

class  LinkedListprogram
{
  node head;
  node tail;
  public void addfirst(int d)  //this is for my ownself
  {
    node temp = new node(d);
    if(head == null)
    {head=temp;}
    else {temp.next=head;
      head = temp;}              
  }
  public void addLast(int d)
  {
    node newnode = new node (d);
    if (head==null)
    {
      head=newnode;return;
    }
    else {
      node temp = head;
      while(temp.next!=null)
      {
        temp=temp.next;
      }
      temp.next=newnode
    }
  }
  public void removeLast()
  {
    if(head==null){return;}
    else if (head.next==null;return;)
    {head=null;}
    else if 
    {
     node temp = head;
      while(temp.next!=null)
      {
        temp=temp.next;
    }
      temp.next=null;
  }
    public void removeFast()
    {
      if(head==null;){head=head.next;}
    }
    
}

class node 
{
  int data;
  node next;
  node (int number)
  {
    data = number;
    next = null;
  }
}
