package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        StringTree tree = new StringTree();
        tree.setOverallRoot(new TreeNode(' '));
        tree.getOverallRoot().left = new TreeNode('e');
        tree.getOverallRoot().right = new TreeNode('t');
        tree.getOverallRoot().left.left = new TreeNode('i');
        tree.getOverallRoot().left.right = new TreeNode('a');
        tree.getOverallRoot().right.left = new TreeNode('n');
        tree.getOverallRoot().right.right = new TreeNode('m');
        tree.getOverallRoot().left.left.left = new TreeNode('s');
        tree.getOverallRoot().left.left.right = new TreeNode('u');
        tree.getOverallRoot().left.right.left = new TreeNode('r');
        tree.getOverallRoot().left.right.right = new TreeNode('w');
        tree.getOverallRoot().right.left.left = new TreeNode('d');
        tree.getOverallRoot().right.left.right = new TreeNode('k');
        tree.getOverallRoot().right.right.left = new TreeNode('g');
        tree.getOverallRoot().right.right.right = new TreeNode('o');
        tree.getOverallRoot().left.left.left.left = new TreeNode('h');
        tree.getOverallRoot().left.left.left.right = new TreeNode('v');
        tree.getOverallRoot().left.left.right.left = new TreeNode('f');
        tree.getOverallRoot().left.left.right.right = new TreeNode(' ');
        tree.getOverallRoot().left.left.right.right.right = new TreeNode('2');
        tree.getOverallRoot().left.right.left.left = new TreeNode('l');
        tree.getOverallRoot().left.right.left.right = new TreeNode(' ');
        tree.getOverallRoot().left.right.left.right.left = new TreeNode('+');
        tree.getOverallRoot().left.right.right.left = new TreeNode('p');
        tree.getOverallRoot().left.right.right.right = new TreeNode('j');
        tree.getOverallRoot().left.right.right.right.right = new TreeNode('1');
        tree.getOverallRoot().right.left.left.left = new TreeNode('b');
        tree.getOverallRoot().right.left.left.left.left= new TreeNode('6');
        tree.getOverallRoot().right.left.left.left.right = new TreeNode('=');
        tree.getOverallRoot().right.left.left.right = new TreeNode('x');
        tree.getOverallRoot().right.left.left.right.left = new TreeNode('/');
        tree.getOverallRoot().right.left.right.left = new TreeNode('c');
        tree.getOverallRoot().right.left.right.right = new TreeNode('y');
        tree.getOverallRoot().right.right.left.left = new TreeNode('z');
        tree.getOverallRoot().right.right.left.right = new TreeNode('q');
        tree.getOverallRoot().right.right.right.left = new TreeNode(' ');
        tree.getOverallRoot().right.right.right.right = new TreeNode(' ');
        tree.getOverallRoot().right.right.left.left.left = new TreeNode('7');
        tree.getOverallRoot().right.right.right.left.left = new TreeNode('8');
        tree.getOverallRoot().right.right.right.right.left = new TreeNode('9');
        tree.getOverallRoot().right.right.right .right.right= new TreeNode('0');
        tree.getOverallRoot().left.left.left.left.left = new TreeNode('5');
        tree.getOverallRoot().left.left.left.left.right = new TreeNode('4');
        tree.getOverallRoot().left.left.left.right.right = new TreeNode('3');
        tree.getOverallRoot().left.left.left.right.left = new TreeNode(' ');
        tree.getOverallRoot().left.left.right.left.left = new TreeNode(' ');
        tree.getOverallRoot().left.left.right.left.right = new TreeNode(' ');
        tree.getOverallRoot().left.left.right.right.left = new TreeNode(' ');
        tree.getOverallRoot().left.right.left.left.right = new TreeNode(' ');
        tree.getOverallRoot().left.right.left.left.left = new TreeNode(' ');
        tree.getOverallRoot().left.right.left.right = new TreeNode(' ');
        tree.getOverallRoot().left.right.left.right.right = new TreeNode(' ');
        tree.getOverallRoot().left.right.right.left.left = new TreeNode(' ');
        tree.getOverallRoot().left.right.right.left.right = new TreeNode(' ');
        tree.getOverallRoot().left.right.right.right.left = new TreeNode(' ');
        tree.getOverallRoot().right.left.left.right.right = new TreeNode(' ');
        tree.getOverallRoot().right.left.right.left.left = new TreeNode(' ');
        tree.getOverallRoot().right.left.right.left.right = new TreeNode(' ');
        tree.getOverallRoot().right.left.right.right.left = new TreeNode(' ');
        tree.getOverallRoot().right.left.right.right.right = new TreeNode(' ');
        tree.getOverallRoot().right.right.left.left.right = new TreeNode(' ');
        tree.getOverallRoot().right.right.left.right.left = new TreeNode(' ');
        tree.getOverallRoot().right.right.left.right.right = new TreeNode(' ');
        tree.getOverallRoot().right.right.right.left.right = new TreeNode(' ');
        System.out.println("ginsu is a god");
        System.out.println("ginsu is a god");
        Scanner sc = new Scanner (System.in);
        String morse = sc.nextLine();
        Scanner scan = new Scanner (morse);
        String total = "";
        while(scan.hasNext()){
            String check = scan.next();
            TreeNode root = tree.getOverallRoot();
            while(check.length() != 0){
                char c = check.charAt(0);
                if(c == '.'){
                    root = root.left;
                }else if(c == '-'){
                    root = root.right;
                }
                check.substring(1);
            }
            total = total + root.data;
        }
        System.out.println(total);
    }
    }
}