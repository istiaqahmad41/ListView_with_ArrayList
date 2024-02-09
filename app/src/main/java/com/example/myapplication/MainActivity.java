package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.*;

public class MainActivity extends AppCompatActivity {


    String [] str_arr ={"hello","world","istiaq","testing","java","adpater","Arrayadapter","hello", "world","istiaq","testing","java","adpater","Arrayadapter", "hello","world","istiaq","testing","java","adpater","Arrayadapter"};



      int [] int_array ={10,20,30,40,50,70,100,10,20,30,40,50,70,100,10,20,30,40,50,70,100,10,20,30,40,50,70,100,10,20,30,40,50,70,100,10,20,30,40,50,70,100};

      char [] char_array ={'r','u','q','R','T','b','r','u','q','R','T','b','r','u','q','R','T','b','r','u','q','R','T','b','r','u','q','R','T','b','r','u','q','R','T','b'};

      double[] double_array = {20.80,70.65,3.353534,87745.333,66565.24242525,363645.5352323,575757.447474,20.80,70.65,3.353534,87745.333,66565.24242525,363645.5352323,575757.447474,20.80,70.65,3.353534,87745.333,66565.24242525,363645.5352323,575757.447474,20.80,70.65,3.353534,87745.333,66565.24242525,363645.5352323,575757.447474,20.80,70.65,3.353534,87745.333,66565.24242525,363645.5352323,575757.447474};
    ArrayAdapter<String>adapter;

    String [] res_store;
    ListView listview_str;
    ListView listview_int;
    ListView listview_char;
    ListView listview_double;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listview_str = findViewById(R.id.listview_string);
        listview_int = findViewById(R.id.listview_int);
        listview_char = findViewById(R.id.listview_char);
        listview_double = findViewById(R.id.listview_double);

         //Passing String Array value to a different Arraylist
         // code below -->

        List<String> str_list = new ArrayList<>();
        for(String i : str_arr){
             str_list.add(i);
        }

          // passing Arraylist to ArrayAdapter  with  custom layout
         //  code below -->

        ArrayAdapter<String> adpater_for_stringArray = new ArrayAdapter<>(MainActivity.this,R.layout.new_textview_layout,R.id.textview_id,str_list);
        listview_str.setAdapter(adpater_for_stringArray);



        //Passing Integer Array value to a different Arraylist
        // code below -->

        List<Integer> int_list = new ArrayList<>();
        for(int i : int_array){
            int_list.add(i);
        }


        // passing Arraylist to ArrayAdapter  with  custom layout
        //  code below -->

        ArrayAdapter<Integer> adapter_for_intArray = new ArrayAdapter<>(MainActivity.this,R.layout.new_textview_layout,R.id.textview_id,int_list);
        listview_int.setAdapter(adapter_for_intArray);


        //Passing Character Array value to a different Arraylist
        // code below -->

        List<Character> char_list = new ArrayList<>();
        for(char i : char_array){
            char_list.add(i);
        }


        // passing Arraylist to ArrayAdapter  with  custom layout
        //  code below -->

        ArrayAdapter<Character> adapter_for_charArray = new ArrayAdapter<>(MainActivity.this,R.layout.new_textview_layout,R.id.textview_id,char_list);
        listview_char.setAdapter(adapter_for_charArray);


        //Passing Double Array value to a different Arraylist
        // code below -->

        List<Double> double_list = new ArrayList<>();
        for(double i : double_array){
            double_list.add(i);
        }


        // passing Arraylist to ArrayAdapter  with  custom layout
        //  code below -->

        ArrayAdapter<Double> adapter_for_doubleArray = new ArrayAdapter<>(MainActivity.this,R.layout.new_textview_layout,R.id.textview_id,double_list);
        listview_double.setAdapter(adapter_for_doubleArray);





    }
}