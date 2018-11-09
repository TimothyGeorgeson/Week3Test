package com.example.consultants.week3test;

public class Room {
    public static boolean finalResult = false;
    public final boolean isInfected;
    public boolean visited = false;
    Room(boolean infected)
    {
        isInfected = infected;
    }

    public static boolean isOutbreak(Room[][] floor) {
        finalResult = false;
        int chainCount = 0;

        for (int i = 0; i < floor.length; i++) {
            for(int j = 0; j < floor[i].length; j++) {
                if(floor[i][j].isInfected)
                {
                    chainCount = 1;
                    floor[i][j].visited = true;
                    checkNeighbors(floor, i, j, chainCount);

                }
            }
        }

        return finalResult;
    }

    private static void checkNeighbors(Room[][] room, int i, int j, int chainCount)
    {
        if (chainCount == 5)
        {
            finalResult = true;
        }
        else
        {
            if(checkAbove(room, i, j)) {
                checkNeighbors(room, i-1, j, chainCount+1);
            }
            else if(checkBelow(room, i, j)) {
                checkNeighbors(room, i+1, j, chainCount+1);
            }
            else if(checkLeft(room, i, j)) {
                checkNeighbors(room, i, j-1, chainCount+1);
            }
            else if(checkRight(room, i, j)) {
                checkNeighbors(room, i, j+1, chainCount+1);
            }

        }
    }

    private static boolean checkAbove(Room[][] room, int i, int j)
    {
        if(i == 0)
            return false;
        else
        {
            if (room[i-1][j].isInfected && !room[i-1][j].visited)
            {
                room[i-1][j].visited = true;
                return true;
            }
            else
                return false;
        }
    }

    private static boolean checkBelow(Room[][] room, int i, int j)
    {
        if(i == room.length - 1)
            return false;
        else
        {
            if (room[i+1][j].isInfected && !room[i+1][j].visited)
            {
                room[i+1][j].visited = true;
                return true;
            }
            else
                return false;
        }
    }

    private static boolean checkLeft(Room[][] room, int i, int j)
    {
        if(j == 0)
            return false;
        else
        {
            if (room[i][j-1].isInfected && !room[i][j-1].visited)
            {
                room[i][j-1].visited = true;
                return true;
            }

            else
                return false;
        }
    }

    private static boolean checkRight(Room[][] room, int i, int j)
    {
        if(j == room[i].length - 1)
            return false;
        else
        {
            if (room[i][j+1].isInfected && !room[i][j+1].visited)
            {
                room[i][j+1].visited = true;
                return true;
            }
            else
                return false;
        }
    }

}
