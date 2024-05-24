package com.example.hr_process;

import android.app.Application;

import java.util.ArrayList;

public class MyApplication extends Application {
    public static ArrayList<Applicant> applicants;

    @Override
    public void onCreate() {
        super.onCreate();
        applicants = new ArrayList<>();
    }
}
