package com.test.algorithm;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Graph {
  private static final Logger log = Logger.getLogger(Graph.class.getName());
  private int V; // No. of vertices
  private LinkedList<Integer> adj[]; // Adjacency Lists

  // Constructor
  @SuppressWarnings({"unchecked", "rawtypes"})
  Graph(int v) {
    V = v;
    adj = new LinkedList[v];
    for (int i = 0; i < v; ++i) adj[i] = new LinkedList();
  }

  // Function to add an edge into the graph
  void addEdge(int v, int w) {
    adj[v].add(w);
  }

  // prints BFS traversal from a given source s
  void BFS(int s) {
    // Mark all the vertices as not visited(By default
    // set as false)
    boolean visited[] = new boolean[V];

    // Create a queue for BFS
    LinkedList<Integer> queue = new LinkedList<Integer>();

    // Mark the current node as visited and enqueue it
    visited[s] = true;
    queue.add(s);

    while (queue.size() != 0) {
      // Dequeue a vertex from queue and print it
      s = queue.poll();
      System.out.print(s + " ");

      // Get all adjacent vertices of the dequeued vertex s
      // If a adjacent has not been visited, then mark it
      // visited and enqueue it
      Iterator<Integer> i = adj[s].listIterator();
      while (i.hasNext()) {
        int n = i.next();
        if (!visited[n]) {
          visited[n] = true;
          queue.add(n);
        }
      }
    }
  }

  // Driver method to
  public static void main(String args[]) {
    log.log(Level.INFO, ">>>");
    Graph graph = new Graph(4);

    graph.addEdge(0, 1);
    graph.addEdge(0, 2);
    graph.addEdge(1, 2);
    graph.addEdge(2, 0);
    graph.addEdge(2, 3);
    graph.addEdge(3, 3);

    System.out.println("Following is Breadth First Traversal " + "(starting from vertex 2)");

    graph.BFS(2);
  }
}
