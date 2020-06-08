package com.main.string;

/**
 * 
 * @author Suruchi Kumari
 *
 * @param <T>
 * 
 * This class in the generic Array implementation of Stack
 * It includes method implementations of 
 * a. push
 * b. pop
 * c. peek
 * d. empty
 * e. full
 */
public class StackDefinitionClass<T> {
 
    private int stackSize;
    private T[] stackArr;
    private int top;
     
    /**
     * constructor to create stack with size
     * @param size
     */
    
    public StackDefinitionClass(int size) {
        this.stackSize = size;
        this.stackArr = (T[]) new Object[stackSize];
        this.top = -1;
    }
 
    /**
     * This method adds new entry to the top 
     * of the stack
     * @param entry
     * @throws Exception 
     */
    public void push(T entry){
        if(this.isStackFull()){
            System.out.println(("Stack is full. Increasing the capacity."));
            this.increaseStackCapacity();
        }
        System.out.println("Adding: "+entry);
        this.stackArr[++top] = entry;
    }
 
    /**
     * This method removes an entry from the 
     * top of the stack.
     * @return
     * @throws Exception 
     */
    public T pop() throws Exception {
        if(this.isStackEmpty()){
            throw new Exception("Stack is empty. Can not remove element.");
        }
        T entry = this.stackArr[top--];
        System.out.println("Removed entry: "+entry);
        return entry;
    }
     
    /**
     * This method returns top of the stack
     * without removing it.
     * @return
     */
    public T peek() {
        return stackArr[top];
    }
 
    private void increaseStackCapacity(){
         
        @SuppressWarnings("unchecked")
        T[] newStack = (T[]) new Object[this.stackSize*2];
        for(int i=0;i<stackSize;i++){
            newStack[i] = this.stackArr[i];
        }
        this.stackArr = newStack;
        this.stackSize = this.stackSize*2;
    }
     
    /**
     * This method returns true if the stack is 
     * empty
     * @return
     */
    public boolean isStackEmpty() {
        return (top == -1);
    }
 
    /**
     * This method returns true if the stack is full
     * @return
     */
    public boolean isStackFull() {
        return (top == stackSize - 1);
    }
    
        
    public static void main(String a[]) throws Exception{
        /*StackDefinitionClass<String> stringStack = new StackDefinitionClass<String>(2);
        stringStack.push("TesterSring1");
        stringStack.push("TesterSring2");
        stringStack.push("TesterSring3");
        
       stringStack.pop();
        
        System.out.println("Is the stack Empty? :"+stringStack.isStackEmpty());
        System.out.println("Is the stack Full? :"+stringStack.isStackFull());*/
        
        StackDefinitionClass<Integer> integerStack = new StackDefinitionClass<Integer>(2);
        integerStack.push(11);
        integerStack.push(22);
        
        integerStack.pop();
    }
}