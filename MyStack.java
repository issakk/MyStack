package Mystack;

import java.util.Arrays;

//只放int的栈
public class MyStack
{
    int capacity = 10;
    int[] array = new int[capacity];
    int currentIndex = 0;


    public void add(int i)
    {
        int index = this.currentIndex;
        if (index >= capacity) {
            grow();
        }
        this.array[this.currentIndex] = i;
        this.currentIndex++;

    }


    public int pop()
    {
        int temp = this.array[currentIndex - 1];
        this.array[currentIndex - 1] = 0;
        currentIndex--;
        return temp;
    }

    private void grow()
    {
        this.capacity = capacity + (capacity >> 1);
        int[] tempArray = new int[capacity];
        System.arraycopy(this.array, 0, tempArray, 0, currentIndex);
        this.array = tempArray;

    }

    @Override
    public String toString()
    {
        return Arrays.toString(this.array);
    }
}
