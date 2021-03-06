package synthesizer;
public class ArrayRingBuffer extends AbstractBoundedQueue {
    public double[] buffer;
    public int front;
    public static void main(String[] args)
    {
//        ArrayRingBuffer buffer = new ArrayRingBuffer(5);
//        int i = 0;
//        while(!buffer.isFull())
//        {
//            buffer.enqueue(i++);
//        }
//        buffer.dequeue();
//        buffer.enqueue(i++);
//        buffer.dequeue();
//        buffer.enqueue(i++);
//        while(!buffer.isEmpty())
//        {
//            System.out.println(buffer.dequeue());
//        }
        
        System.out.println(0%84);
    }
    public ArrayRingBuffer(int capacity)
    {
        assert(capacity > 0);
        this.capacity = capacity;
        this.fillCount = 0;
        this.buffer = new double[capacity];
    }
    @Override
    public boolean isEmpty() {
        // TODO Auto-generated method stub
        return fillCount == 0;
    }

    @Override
    public boolean isFull() {
        // TODO Auto-generated method stub
        return fillCount >= capacity;
    }

    @Override
    public void enqueue(double x) {
        // TODO Auto-generated method stub
        assert(!isFull());
        int rear = (front+fillCount) %capacity();
        //System.out.println(front+","+fillCount+","+capacity()+","+rear);
        fillCount++;
        buffer[rear]= x;
        
    }

    @Override
    public double dequeue() {
        // TODO Auto-generated method stub
        assert(!isEmpty());
        fillCount--;
        double res = buffer[front++];
        if(front == capacity)
        {
            front =0;
        }
        return res;
    }

    @Override
    public double peek() {
        // TODO Auto-generated method stub
        return buffer[front];
    }

    @Override
    public int capacity() {
        // TODO Auto-generated method stub
        return capacity;
    }

    @Override
    public int fillCount() {
        // TODO Auto-generated method stub
        return fillCount;
    }
    
}
