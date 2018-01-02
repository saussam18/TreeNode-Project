package com.company;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class StringTree {
    private TreeNode overallRoot;
    private int height;

    public StringTree(int h) {
        this.height = h;
        this.overallRoot = null;
    }

    public StringTree(TreeNode x) {
        this.overallRoot = x;
    }

    public StringTree(TreeNode x, int h) {
        this.overallRoot = x;
        this.height = h;
    }

    public StringTree() {
        this.overallRoot = null;
    }

    public void setOverallRoot(TreeNode overallRoot) {
        this.overallRoot = overallRoot;
    }

    public TreeNode getOverallRoot() {
        return overallRoot;
    }


    public void find(String morse){
        Scanner scan = new Scanner (morse);
        while(scan.hasNext()){
            String s = "";
            String data = scan.next();
            while(data.length() != 0){
                char c = data.charAt(0);
                s = s + print(c, overallRoot, 0, 0);
                data = data.substring(1);
            }
            System.out.print(s);
            System.out.print(" ");
        }

    }

    private String print(char c, TreeNode root, int countLeft, int countRight){
        String yeet = "";
       if(root.data == c){
            for(int i = 0; i <= countLeft; i++){
                yeet = yeet + ".";
            }
            for(int i = 0; i <= countRight; i++){
                yeet = yeet + "-";
            }
            return yeet;
        }else{
            return print(c, root.left, countLeft++, countRight);

            return print(c, root.right, countLeft, countRight++);
        }
    }
}
