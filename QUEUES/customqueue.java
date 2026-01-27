package QUEUES;

public class customqueue {
        private int data[];
    private  static int size=10;
    int end=0;
    public customqueue(){
        this(size);
    }
    public customqueue(int size){
        this.data=new int [size];
    }
    //for full
        public boolean isfull(){
        return end==data.length-1;
    }
    //for empty
      public boolean isempty(){   
        return end==-1;
    }
        public boolean push(int item){
        if(isfull()){
     System.out.println("queue is full");
           return false;
        }
        
        data[end++]=item;
        return true;
    }

    //for remove
        public int pop(){
        if(isempty()){
            System.out.println("stack is empty");
            return -1;   
        }
         int removed=data[0];
         for(int i=1;i<end;i++){
            data[i-1]=data[i];
         }
         end--; 
            return removed;
         }
   public int front() {
        if(isempty()){
            System.out.println("queue is empty");
            return -1;
        }
        return data[0];
    }

         public static void main(String[] args) {
        customqueue queue=new customqueue(5);
        queue.push(10);
        queue.push(20); 
        queue.push(30); 
       int d = queue.front();
       System.out.println(queue.pop());
       System.out.println(d + "->");
         }
    }

