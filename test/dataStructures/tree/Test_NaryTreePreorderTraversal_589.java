package dataStructures.tree;

import dataStructures.utilClasses.Node;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test_NaryTreePreorderTraversal_589 {
    @Test
    void testCase1(){

        Node n3 = new Node(2);
        Node n4 = new Node(4);
        Node n5 = new Node(5);
        Node n6 = new Node(6);

        List<Node> c1 = new ArrayList<Node>();
        c1.add(n5);
        c1.add(n6);
        Node n2 = new Node(3, c1);

        List<Node> c2 = new ArrayList<Node>();
        c2.add(n2);
        c2.add(n3);
        c2.add(n4);
        Node n1 = new Node(1, c2);


        List<Integer> result = Arrays.asList(1,3,5,6,2,4);

        NaryTreePreorderTraversal_589 var = new NaryTreePreorderTraversal_589();
        List<Integer> expect = var.preorder(n1);

        Assertions.assertEquals(result, expect);

    }
}
