package com.company;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class StringTree {
    private TreeNode overallRoot;
    private int height;
    String yeet = "";

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

    public void find (String morse){
        Scanner scan = new Scanner (morse);
        while(scan.hasNext()){
            String s = "";
            String data = scan.next();
            while(data.length() != 0){
                find(data.charAt(0), overallRoot, "");
                data = data.substring(1);
            }

        }

    }
    public void find(char data, TreeNode root, String total){
               if(data == root.data){
                  yeet = total
               }else{
                   find(data, root.left, total + ".");
                   find(data, root.right, total + "-");
               }

    }

    public String getYeet() {
        return yeet;
    }
}

