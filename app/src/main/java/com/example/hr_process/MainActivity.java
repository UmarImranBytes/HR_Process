package com.example.hr_process;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.Date;

public class MainActivity extends AppCompatActivity {

    // hooks
    RecyclerView rvApplicants;
    FloatingActionButton fabAddApplicant;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvApplicants = findViewById(R.id.rvApplicants);
        fabAddApplicant = findViewById(R.id.fabAddApplicant);

        fabAddApplicant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dialog = new AlertDialog.Builder(MainActivity.this);
                dialog.setTitle("Add New Applicant");
                View form = LayoutInflater.from(MainActivity.this)
                                .inflate(R.layout.add_applicant, null, false);
                EditText etName = form.findViewById(R.id.etname);
                EditText etEmail = form.findViewById(R.id.etEmail);
                EditText etAddress = form.findViewById(R.id.etAddress);
                EditText etContact = form.findViewById(R.id.etcontact);
                EditText etJobTitle = form.findViewById(R.id.etJobTitle);
                EditText etLastQualification = form.findViewById(R.id.etQaulification);
                TextView tvDate = form.findViewById(R.id.tvDate);
                Date today = new Date();
                tvDate.setText(today.toString());

                dialog.setPositiveButton("Save", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        String name = etName.getText().toString().trim();
                        String email = etEmail.getText().toString().trim();
                        String address = etAddress.getText().toString().trim();
                        String contact = etContact.getText().toString().trim();
                        String jobtitle = etJobTitle.getText().toString().trim();
                        String qualification = etLastQualification.getText().toString().trim();
                        String date = tvDate.getText().toString();

                        Applicant applicant = new Applicant(name, email, address, contact, jobtitle, qualification, date);
                        MyApplication.applicants.add(applicant);
                        Toast.makeText(MainActivity.this, "Thank you applying", Toast.LENGTH_SHORT).show();

                    }
                });

                dialog.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(MainActivity.this, "Thank you so much", Toast.LENGTH_SHORT).show();
                    }
                });

                dialog.setView(form);

                dialog.show();


            }
        });
    }
}