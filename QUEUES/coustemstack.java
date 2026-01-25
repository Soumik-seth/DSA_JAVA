package QUEUES;

public class coustemstack {
    private int data[];
    private  static int size=10;
    int ptr=-1;
    public coustemstack(){
        this(size);
    }
    public coustemstack(int size){
        this.data=new int [size];
    }

    public boolean push(int item){
        if(isfull()){
            System.out.println("stack is full");
            return false;
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
        coustemstack stack=new coustemstack();
        stack.push(10);
        stack.push(20); 
        stack.push(30);
        try {
            System.out.println("->"+stack.peak());
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
