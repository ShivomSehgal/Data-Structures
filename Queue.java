import javax.lang.model.type.NoType;

public class Queue {
private int maxsize;
private int[] queuearray;
private int front;
private int rear;
private int nItems;

public Queue(int j){
    this.maxsize=j;
    this.queuearray=new int[maxsize];
    this.front=0;
    this.rear=-1;
    this.nItems=0;
}

public void insert(int l){
    rear++;
    nItems++;
    queuearray[rear]=l;
}

public int delete(){
    int temp=front;
    front++;
    nItems--;
    return queuearray[temp];
}

public int peekFront(){
    return queuearray[front];
}

public boolean isEmpty(){
    return nItems==0;
}

public boolean isFull(){
    return nItems==maxsize;
}

    
}
