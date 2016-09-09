package WeekOfCode21;

import java.util.*;

/**
 * Created by shubhamgoyal on 6/29/16.
 */
public class DemandingMoney
{
    static class House
    {
        public List<Integer> Neighbours;
        public Integer Cash;
        public Integer Index;

        public House(Integer cash, Integer index)
        {
            Neighbours = new ArrayList<>();
            Cash = cash;
            Index = index;
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int numOfHouse = sc.nextInt();
        int numOfRoads = sc.nextInt();

        Map<Integer, House> houseMap = new HashMap<>();
        for(int i = 1; i <= numOfHouse; i++)
        {
            int cash = sc.nextInt();
            houseMap.put(i, new House(cash, i));
        }

        for(int i = 0; i < numOfRoads; i++)
        {
            int start = sc.nextInt();
            int end = sc.nextInt();
            houseMap.get(start).Neighbours.add(end);
            houseMap.get(end).Neighbours.add(start);
        }


    }



}
