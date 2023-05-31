package BinaryTree;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;

class Node{
    int data;
    Node right;
    Node left;

    public Node(int data){
        this.data = data;
        this.right = null;
        this.left = null;
    }
}

public class BinaryTree{

    private Node root;
    private int size;

    public BinaryTree(){
        root = null;
        size = 0;
    }

    public void add(int data){
        Node newNode = new Node(data);
        if(root == null){
            root = newNode;
        }
        else {
            add(newNode, root);
        }
        size++;

    }

    public void add(Node newNode, Node root){
        if(newNode.data < root.data){
            if(root.left == null){
                root.left = newNode;
            }
            else{
                add(newNode, root.left);
            }
        }else{
            if(root.right == null){
                root.right = newNode;
            }
            else {
                add(newNode, root.right);
            }
        }
    }

    public boolean contains(int data){
        return contains(data, root);
    }

    public boolean contains(int data, Node root){
        if(root == null){
            return false;
        }
        else if(data == root.data){
            return true;
        }
        else if(data < root.data){
            return contains(data, root.left);
        }
        else{
            return contains(data, root.right);
        }
    }



    public static void main(String[] args){
        BinaryTree binaryTree = new BinaryTree();
        Logger logger = Logger.getLogger(BinaryTree.class.getName());
        logger.info("Try Binary tree");
        logger.info("--------------------------------");
        logger.info("input your int data using commma");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] newInp = input.split(", ");
        List<Integer> datas = new ArrayList<>();
        for(String newI: newInp){
            datas.add(Integer.parseInt(newI));
            binaryTree.add(Integer.parseInt(newI));
        }

        System.out.println(datas);

        String checker = "";
        while (checker.equals("")) {

            logger.info("check your numbers");
            String result = scanner.nextLine();
            boolean bool = binaryTree.contains(Integer.parseInt(result));
            System.out.println(bool);
            logger.info("type any key to quit!");
            checker = scanner.nextLine();
        }



    }
}
