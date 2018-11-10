package com.example.consultants.week3test;

import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @RequiresApi(api = Build.VERSION_CODES.N)
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

    @RequiresApi(api = Build.VERSION_CODES.N)
    private static void printOrgChart(ArrayList<String> input)
    {
        ArrayList<String> leaders = new ArrayList<>();
        ArrayList<String> sortedList = new ArrayList<>();
        ArrayList<String> tempList = new ArrayList<>();
        String temp = "";

        for (int i = 0; i < input.size(); i++) {
            temp = input.get(i);

            int j = i - 1;
            while (j >= 0 && (int)temp.charAt(1) < (int)input.get(j).charAt(1))
            {
                input.set(j+1, input.get(j));
                j--;
            }
            input.set(j+1, temp);
        }

        for (int i = 0; i < input.size(); i++) {
            String[] strArr = input.get(i).split(",");
            Node<String> root = new Node<>(strArr[0]);
            for (int j = 1; j < strArr.length; j++)
            {
                root.addChild(new Node<>(strArr[j]));
            }

            printTree(root, "    ");
        }

//        for (int i = 0; i < input.size() ; i++) {
//            System.out.print(input.get(i).charAt(0) + input.get(i).charAt(1));
//            System.out.println(input.get(i));
//        }

    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    private static <T> void printTree(Node<T> node, String appender) {
        System.out.println(appender + node.getData());
        node.getChildren().forEach(each ->  printTree(each, appender + appender));
    }

}
