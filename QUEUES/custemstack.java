package QUEUES;

public class custemstack {
    private int data[];
    private  static int size=10;
    int ptr=-1;
    public custemstack(){
        this(size);
    }
    public custemstack(int size){
        this.data=new int [size];
    }

    public boolean push(int item){
        if(isfull()){
      int temp[]=new int[data.length*2];
      for(int i=0;i<data.length;i++){
        temp[i]=data[i];

      }
      data=temp;
        }
        ptr++;
        data[ptr]=item;
        return true;
    }
    //isfull
    public boolean isfull(){
        return ptr==data.length-1;
    }
    //pop
    public boolean pop(){
        if(isempty()){
            System.out.println("stack is empty");
            return false;   
        }
        int item=data[ptr];
        ptr --;
        return true;
    }
    //peak
    public int peak() throws Exception{
        if(isempty()){
            throw new Exception("stack is empty");
        }
        return data[ptr];
    }
    //isempty
    public boolean isempty(){   
        return ptr==-1;
    }
    public static void main(String[] args) {
        custemstack stack=new custemstack(5);
        stack.push(10);
        stack.push(20); 
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60);
        try {
            System.out.println("->"+stack.peak());
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
