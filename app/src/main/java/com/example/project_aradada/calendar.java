package com.example.project_aradada;


import android.app.Activity;
import android.os.Bundle;
import android.widget.CalendarView;
import android.widget.Toast;

public class Calendar  {



    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_calendar_main);



        //CalendarView 인스턴스 만들기

        final CalendarView calendar = (CalendarView)findViewById(R.id.rv_schedule);



        //리스너 등록

        calendar.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {



            @Override

            public void onSelectedDayChange(CalendarView view, int year, int month,

                                            int dayOfMonth) {

                // TODO Auto-generated method stub

                Toast.makeText(calendar.this, ""+year+"/"+(month+1)+"/"

                        +dayOfMonth, 0).show();

            }

        });



    }

    private void setContentView(int activity_calendar_main) {
    }


}

  \