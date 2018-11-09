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
        String[] strArr1 = input.get(0).split(",");
        String[] strArr2 = input.get(1).split(",");
        String[] strArr3 = input.get(2).split(",");
        String[] strArr4 = input.get(3).split(",");

        ArrayList<String> leaders = new ArrayList<>();
        ArrayList<String> sortedList = new ArrayList<>();
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
                    sortedList.add(temp);
                    temp = "";
                }
            }
            sortedList.add(temp);
            temp = "";
        }

        for (int i = 0; i < sortedList.size(); i++) {
            temp = sortedList.get(i);

            int j = i - 1;
            while (j >= 0 && (int)temp.charAt(1) < (int)sortedList.get(j).charAt(1))
            {
                sortedList.set(j+1, sortedList.get(j));
                j--;
            }
            sortedList.set(j+1, temp);
        }

        int offsetCount = 0;
        for (int i = 0; i < sortedList.size(); i++) {
            System.out.print(sortedList.get(i));
            if (leaders.contains(sortedList.get(i)))
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
