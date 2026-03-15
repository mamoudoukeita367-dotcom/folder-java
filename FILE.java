public class FILE {
    private int [] elements;
    private int size ;
    private int IndiceBefore;

    FILE(int capacity){
        this.elements= new int[capacity];
        this.size=0;
        this.IndiceBefore=0;
    }

    public void AddFileQueue(int value){
        if(size==elements.length){
            System.out.println("the file is full");
        }
        elements[(IndiceBefore+size)%elements.length]=value;
        size++;
    }


    public  int  DeQueue(){
        if(size==0){
            System.out.println("the file is empty");
            return -1;
        }
        int value = elements[IndiceBefore];
        IndiceBefore=(IndiceBefore+1)% elements.length;
        size--;
        return value;
    }


    public int peek(){
        if (size==0){
            System.out.println("the file is empty");
            return -1;
        }
        return elements[IndiceBefore];


    }

}
