package b3_Trees;

public class Values {
    


    public static void main(String[] args) {

        Tree myTree = new Tree();

        int Tree_values[]={5,2,8,0,1,5,7,0,1,8};
        for(int i = 0; i < Tree_values.length; i++)
        {
            myTree.insert(Tree_values[i]);
        }


        for(int i = 0; i < Tree_values.length; i++)
        {
            System.out.print(myTree.GetValue(i)+", ");
        }




        


    }
}