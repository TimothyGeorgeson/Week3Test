package com.example.consultants.week3test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public static void main(String[] args) {

        Room[][] verticalTrue = new Room[][] {
                {new Room(false), new Room(false), new Room(false), new Room(false), new
                        Room(false), new Room(false), new Room(false), new Room(false), new
                        Room(false) },
                {new Room(false), new Room(false), new Room(false), new Room(false), new
                        Room(false), new Room(false), new Room(false), new Room(false), new
                        Room(false) },
                {new Room(false), new Room(false), new Room(false), new Room(false), new
                        Room(false), new Room(false), new Room(false), new Room(false), new
                        Room(false) },
                {new Room(false), new Room(true), new Room(false), new Room(true), new
                        Room(true), new Room(false), new Room(false), new Room(false), new
                        Room(false) },
                {new Room(false), new Room(true), new Room(false), new Room(false), new
                        Room(false), new Room(false), new Room(false), new Room(false), new
                        Room(false) },
                {new Room(false), new Room(true), new Room(false), new Room(false), new
                        Room(false), new Room(false), new Room(false), new Room(false), new
                        Room(false) },
                {new Room(false), new Room(true), new Room(false), new Room(false), new
                        Room(false), new Room(false), new Room(false), new Room(false), new
                        Room(false) },
                {new Room(false), new Room(true), new Room(false), new Room(false), new
                        Room(false), new Room(false), new Room(false), new Room(false), new
                        Room(false) },
                {new Room(false), new Room(false), new Room(false), new Room(false), new
                        Room(false), new Room(false), new Room(false), new Room(false), new
                        Room(false) },
                {new Room(false), new Room(false), new Room(false), new Room(false), new
                        Room(false), new Room(false), new Room(false), new Room(false), new
                        Room(false) }
        };

        Room[][] horizontalTrue = new Room[][] {
                {new Room(false), new Room(false), new Room(false), new Room(false), new
                        Room(false), new Room(false), new Room(false), new Room(false), new
                        Room(false) },
                {new Room(false), new Room(false), new Room(false), new Room(false), new
                        Room(false), new Room(false), new Room(false), new Room(false), new
                        Room(false) },
                {new Room(false), new Room(false), new Room(false), new Room(false), new
                        Room(false), new Room(false), new Room(false), new Room(false), new
                        Room(false) },
                {new Room(false), new Room(true), new Room(true), new Room(true), new
                        Room(true), new Room(true), new Room(false), new Room(false), new
                        Room(false) },
                {new Room(false), new Room(false), new Room(false), new Room(false), new
                        Room(false), new Room(false), new Room(false), new Room(false), new
                        Room(false) },
                {new Room(false), new Room(false), new Room(false), new Room(false), new
                        Room(false), new Room(false), new Room(false), new Room(false), new
                        Room(false) }, {new Room(false), new Room(false), new Room(false),
                new Room(false), new Room(false), new Room(false), new Room(false),
                new Room(false), new Room(false) },
                {new Room(false), new Room(false), new Room(false), new Room(false), new
                        Room(false), new Room(false), new Room(false), new Room(false), new
                        Room(false) },
                {new Room(false), new Room(false), new Room(false), new Room(false), new
                        Room(false), new Room(false), new Room(false), new Room(false), new
                        Room(false) },
                {new Room(false), new Room(false), new Room(false), new Room(false), new
                        Room(false), new Room(false), new Room(false), new Room(false), new
                        Room(false) }
        };

        Room[][] noInfection = new Room[][] {
                {new Room(true), new Room(false), new Room(true), new Room(false), new
                        Room(false), new Room(false), new Room(false), new Room(false), new
                        Room(false) },
                {new Room(false), new Room(true), new Room(false), new Room(true), new
                        Room(false), new Room(false), new Room(false), new Room(false), new
                        Room(false) },
                {new Room(true), new Room(false), new Room(true), new Room(false), new
                        Room(false), new Room(false), new Room(false), new Room(false), new
                        Room(false) },
                {new Room(false), new Room(true), new Room(false), new Room(true), new
                        Room(false), new Room(true), new Room(false), new Room(false), new
                        Room(false) },
                {new Room(false), new Room(true), new Room(false), new Room(false), new
                        Room(true), new Room(false), new Room(false), new Room(false), new
                        Room(false) },
                {new Room(false), new Room(false), new Room(false), new Room(false), new
                        Room(false), new Room(true), new Room(false), new Room(false), new
                        Room(false) },
                {new Room(false), new Room(false), new Room(false), new Room(false), new
                        Room(false), new Room(false), new Room(true), new Room(false), new
                        Room(false) },
                {new Room(false), new Room(false), new Room(false), new Room(false), new
                        Room(false), new Room(false), new Room(false), new Room(false), new
                        Room(false) },
                {new Room(false), new Room(false), new Room(false), new Room(false), new
                        Room(false), new Room(false), new Room(false), new Room(false), new
                        Room(false) },
                {new Room(false), new Room(false), new Room(false), new Room(false), new
                        Room(false), new Room(false), new Room(false), new Room(false), new
                        Room(false) }
        };

        System.out.println("verticalTrue has outbreak: " + Room.isOutbreak(verticalTrue));
        System.out.println("horizontalTrue has outbreak: " + Room.isOutbreak(horizontalTrue));
        System.out.println("noInfection has outbreak: " + Room.isOutbreak(noInfection));

        ArrayList<String> input = new ArrayList<>();
        input.add("B2,E5,E6");
        input.add("A1,B2,C3,D4");
        input.add("D4,G7,I9");
        input.add("G7,H8");

        printOrgChart(input);
    }

    private static void printOrgChart(ArrayList<String> input)
    {
        ArrayList<String> leaders = new ArrayList<>();
        ArrayList<String> tempList = new ArrayList<>();
        String temp = "";

        for (int i = 0; i < input.size(); i++) {
            String str = input.get(i);
            for (int j = 0; j < str.length(); j++)
            {
                if (str.charAt(j) != ',')
                {
                    temp += str.charAt(j);
                }
                else
                {
                    if (j == 2)
                        leaders.add(temp);
                    tempList.add(temp);
                    temp = "";
                }
            }
            tempList.add(temp);
            temp = "";
        }

        for (int i = 0; i < leaders.size(); i++) {
            temp = leaders.get(i);

            int j = i - 1;
            while (j >= 0 && (int)temp.charAt(1) < (int)leaders.get(j).charAt(1))
            {
                leaders.set(j+1, leaders.get(j));
                j--;
            }
            leaders.set(j+1, temp);
        }

        for (int i = 0; i < leaders.size(); i++) {
            for (int j = 0; j < input.size(); j++) {
                
            }
        }

        for (int i = 0; i < leaders.size() ; i++) {
            System.out.print(leaders.get(i));
        }

        int offsetCount = 0;
        for (int i = 0; i < tempList.size(); i++) {
            System.out.print(tempList.get(i));
            if (leaders.contains(tempList.get(i)))
            {
                System.out.println();
                offsetCount++;
                for (int j = 0; j < offsetCount; j++) {
                    offset();
                }
            }
        }

    }

    private static void offset()
    {
        System.out.print("    ");
    }


}
