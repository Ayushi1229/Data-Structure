/**
 * This program stimulates the working of Singly linked linear list
 * The operations in this programs are:
 * 1) Insert at First
 * 2)
 * Author: Ayushi
 * Date:12-07-2024
 */
package Practice;

public class SLL_3A {
    //Create a class node
    public class Node
    {
        int info;
        Node link;
        
        //Constructor
        Node(int data)
        {
            this.info = data;
            this.link = null;
        }
    }
    public Node first =null;

    /**
     * Function name: void insertAtFirst(int Data)
     * This function insert a new node at the first position of the SLL
     * return type: void
     * Parameter 1: int data, this is a value to insert in a newly created node
     */
    void insertAtFirst(int data)
    {
        //create a new node
        Node newNode = new Node(data);
        if(first==null)
        {
            //linked list is empty
            first = newNode;
        }
        else
        {
            //linked is not empty
            newNode.link = first;
            first = newNode;
        }
    }
    /**
     * Function name: void insertAtLast(int Data)
     * This function insert a new node at the last position of the SLL
     * return type: void
     * Parameter 1: int data, this is a value to insert in a newly created node
     */
    void insertAtLast(int data)
    {
        //create a new node
        Node newNode = new Node(data);

        if(first==null)
        {
            //linked list is empty
            first =newNode;
        }
        else
        {
            //linked list is not empty
            Node save =first;

            //search for the last node address
            while (save.link!=null)
            {
                save= save.link;
            }

            //set the last node link with newNode address
            save.link = newNode;
        }
    }
    /**
     * Function name: void insertAtOrder(int Data)
     * This function insert a new node at the ascending order position of the SLL
     * return type: void
     * Parameter 1: int data, this is a value to insert in a newly created node
     */
    void insertAtOrder(int data)
    {
        //create a new node
        Node newNode = new Node(data);

        if(first==null)
        {
            //linked list is empty
            first =newNode;
        }
        else
        {
            //First position insertion 
            if(newNode.info<=first.info)
            {
                //first position insertion
                newNode.link = first;
                first = newNode;
            }
            else
            {
                //search for the predecessor node
                Node save = first;
                while (save.link!=null && newNode.info>=save.link.info)
                {
                    save = save.link;

                }
                newNode.link = save.link;
                save.link = newNode;
            }
        }
    }

    void DeleteNode(int data)
    {
        if(first == null)
        {
            System.out.println("Linked list is empty, can't delete given node");
        }
        else
        {
            if(first.info==data)
            {
                //delete a first node
                first = first.link;
            }
            else
            {
                Node save = first;
                Node pred;
                while(save.link!=null && save.info!=data)
                {
                    pred=save;
                    save= save.link;
                }
                pred.link = save.link;
            }
        }
    }
    public void DisplayLinkedList()
    {
        if(first==null)
        {
            System.out.println("Linked list is empty");
        }
        else
        {
            //linked list is empty
        }
    }
}
