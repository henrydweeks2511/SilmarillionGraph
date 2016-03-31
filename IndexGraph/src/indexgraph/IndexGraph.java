/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package indexgraph;

import edu.princeton.cs.In;
import edu.princeton.cs.StdIn;
import edu.princeton.cs.StdOut;

/**
 *
 * @author Henry
 */
public class IndexGraph {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
     // read in the graph from a file
        In in = new In(args[0]);
        String delimiter = args[1];
        Graph G = new Graph(in, delimiter);

        // read a vertex and print its neighbors
        while (!StdIn.isEmpty()) {
            String v = StdIn.readLine();
            for (String w : G.adjacentTo(v)) {
                StdOut.println("  " + w);
            }
        }
    }

