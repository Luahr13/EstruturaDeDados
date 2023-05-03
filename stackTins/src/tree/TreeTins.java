package tree;

public class TreeTins {
    Node rootNode = null;

    public boolean isEmpty(){
        return rootNode == null;
    }

    public void addNode(String inf){
        rootNode = addP(rootNode, inf);
    }

    private Node addP(Node rootNode, String inf){
        if (rootNode == null){
            return new Node(inf);
        }

        if (inf.compareTo(rootNode.information) < 0){
            if(rootNode.left == null){
                rootNode.left = addP(rootNode.left, inf);
            }else{
                addP(rootNode.left, inf);
            }
        }    
        else if (inf.compareTo(rootNode.information) > 0){
            if(rootNode.right == null){
                rootNode.right = addP(rootNode.right, inf);
            }else{
                addP(rootNode.right, inf);
            }
        }
        return rootNode;
    }
}
