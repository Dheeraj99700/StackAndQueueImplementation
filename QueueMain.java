package StackAndQueueImplementation;

public class QueueMain {  
    public static void main(String[] args) {   
        // Create a queue of capacity 4   
    	QueueImplementation q = new QueueImplementation(3);   
     
        System.out.println("Initial Queue:");  
       // print Queue elements   
        q.queueDisplay();   
     
        // inserting elements in the queue   
        q.queueEnqueue(56);   
        q.queueEnqueue(30);   
        q.queueEnqueue(70);   
     
     
        // print Queue elements   
        System.out.println("Queue after Enqueue Operation:");  
        q.queueDisplay();   
     
        // print front of the queue   
        q.queueFront();   
           
        // insert element in the queue   
        q.queueEnqueue(90);   
     
        // print Queue elements   
        q.queueDisplay();   
     
        q.queueDequeue();   
        q.queueDequeue();   
        System.out.printf("\nQueue after two dequeue operations:");   
     
        // print Queue elements   
        q.queueDisplay();   
     
        // print front of the queue   
        q.queueFront();   
    }   
}  
