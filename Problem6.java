import java.util.ArrayList;

class NodeList{
    int value;
    NodeList both;

    public NodeList(int value){
        this.value = value;
        this.both = null;
    }


}

public class Problem6 {


//    Good morning! Here's your coding interview problem for today.
//    This problem was asked by Google.
//    An XOR linked list is a more memory efficient doubly linked list.
//    Instead of each node holding next and prev fields, it holds a field named both,
//    which is an XOR of the next node and the previous node. Implement an XOR linked list;
//    it has an add(element) which adds the element to the end, and a get(index) which returns the node at index.
//    If using a language that has no pointers (such as Python),
//    you can assume you have access to get_pointer and dereference_pointer functions that converts between nodes and
//    memory addresses.


    NodeList head, tail;
    ArrayList<NodeList> nodes;

    public Problem6(){
        this.head = null;
        this.tail = null;
        this.nodes = new ArrayList<>();
    }

    public void add(int element){
        NodeList node = new NodeList(element);
        if(this.head == null){
            this.head = this.tail = node;
        }
        else {
            node.both = this.tail;
            this.tail.both = xor(this.tail.both, node);
            this.tail = node;
        }
        this.nodes.add(node);
    }

    public NodeList get(int index){
        if(index >= this.nodes.size() || index < 0){
            return null;
        }
        NodeList prevNode = null;
        NodeList currNode = this.head;

        for(int i = 0; i < index; i++){
            NodeList nextNode = xor(currNode.both, prevNode);
            if(nextNode == null){
                return null;
            }
            prevNode = currNode;
            currNode = nextNode;
        }
        return currNode;
    }

    private NodeList xor(NodeList a, NodeList b){
        return a == null ? b : (b == null ? a :new NodeList(a.value ^ b.value));
    }
}
