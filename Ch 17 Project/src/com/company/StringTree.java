package com.company;


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


}

