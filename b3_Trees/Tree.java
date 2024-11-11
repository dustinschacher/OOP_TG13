package b3_Trees;

public class Tree {

    Node root;

    public Tree()
    {
        root = null;
    }

    public void insert(int value)
    {
        if(root == null)
        {
            root = new Node(value);
        }
        else
        {
            insert(root,value);
        }
    }
    private void insert(Node parent, int value)
    {
        if(parent.value > value)
        {
            if(parent.predeccessor_left == null)
            {
                parent.predeccessor_left = new Node(value);
            }
            else
            {
                insert(parent.predeccessor_left, value);
            }
        }
        else
        {
            if(parent.predeccessor_right == null)
            {
                parent.predeccessor_right = new Node(value);
            }
            else
            {
                insert(parent.predeccessor_right, value);
            }
        }
    }
    public int GetValue(int pos)
    {
            return pos;

    }
}