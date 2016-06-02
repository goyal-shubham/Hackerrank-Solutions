package WeekOfCode20;

import java.util.*;

public class JoggingCats
{



    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        ArrayList<vertex> graph = new ArrayList<>(n);

        int id = 1;

        for(int i = 0; i < n; i++)
        {
            vertex node = new vertex(i);
            graph.add(node);
        }

        for(int i = 0; i < m; i++)
        {
            int start = sc.nextInt();
            int end = sc.nextInt();
            graph.get(start - 1).edgeAndId.put(end - 1 , id);
            graph.get(end - 1).edgeAndId.put(start - 1 , id++);
        }

        //        for(int i = 0; i < n; i++)
        //        {
        //            System.out.print(i + "-->");
        //            for(int j : graph.get(i).edgeAndId)
        //            System.out.print(j + " ");
        //            System.out.println();
        //        }

        HashSet<TreeSet<Integer>>  pathSet = new HashSet<>();

        int count = 0;
        for(int i = 0; i < n; i++)
        {
            for(int j : graph.get(i).edgeAndId.keySet() )
            {
                if( j != i)
                {
                    for(int k : graph.get(j).edgeAndId.keySet())
                    {
                        if( k != i && k != j)
                        {
                            for(int l : graph.get(k).edgeAndId.keySet())
                            {
                                if(l != i && l != k && l != j)
                                {

                                    for(int x : graph.get(l).edgeAndId.keySet())
                                    {

                                        if( x == i && x != l && x != k && x != j)
                                        {
                                            TreeSet<Integer> path = new TreeSet<>();
                                            path.add(graph.get(i).edgeAndId.get(j));
                                            path.add(graph.get(j).edgeAndId.get(k));
                                            path.add(graph.get(k).edgeAndId.get(l));
                                            path.add(graph.get(l).edgeAndId.get(x));
                                            // System.out.println(path);
                                            if(path.size() == 4)
                                            {
                                                pathSet.add(path);
                                                //System.out.println(i + " ->" + j + " ->" + k + " ->" + l + "-->" + i);
                                                count++;

                                            }
                                        }

                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        //        for(TreeSet h : pathSet)
        //        {
        //            System.out.println(h);
        //        }
        // System.out.println(count);
        System.out.println(pathSet.size());
    }
}

class vertex
{
    int index;
    HashMap<Integer, Integer> edgeAndId = new HashMap<>();

    vertex(int id)
    {
        this.index = id;
    }
}
