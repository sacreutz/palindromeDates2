package package1;

import package1.LLNode;

public class LinkedStack<String> {
    protected LLNode<String> top;

    public LinkedStack()
    {
        top = null;
    }

    public void push (String element) {
        LLNode<String> newNode = new LLNode<String>(element);
        newNode.setLink(top);
        top = newNode;
    }

    public void pop() throws Exception {
        if (!isEmpty())
        {
            top = top.getLink();
        }
        else {
            throw new Exception("Pop attempted on an empty stack ");
        }

    }

    public boolean isEmpty()
    {
        if (top == null)
            return true;
        else
            return false;
    }

    public String top() throws Exception {
        if (!isEmpty())
        {
            return top.getInfo();
        }
        else {
            throw new Exception("Top attempted an an empty stack");
        }
    }
}