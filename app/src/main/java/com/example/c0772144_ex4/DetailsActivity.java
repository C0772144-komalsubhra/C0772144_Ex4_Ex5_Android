package com.example.c0772144_ex4;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import butterknife.ButterKnife;

public class DetailsActivity extends AppCompatActivity {

    ComplaintsModel model;
    private TextView txtCompName;
    private TextView txtCompLastName;
    private TextView txtCompDescription;
    private TextView txtCompDate;
    private TextView txtCompDesignation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        ButterKnife.inject(this);

        txtCompName = findViewById(R.id.txtCompName);
        txtCompLastName = findViewById(R.id.txtCompLastName);
        txtCompDescription = findViewById(R.id.txtCompDescription);
        txtCompDate = findViewById(R.id.txtDate);
        txtCompDesignation = findViewById(R.id.txtCompDesignation);

        if (getIntent().getExtras() != null) {
            model = (ComplaintsModel) getIntent().getExtras().getSerializable("complaintKey");
            txtCompName.setText(model.getFirstName());
            txtCompLastName.setText(model.getLastName());
            txtCompDescription.setText(model.getComplaintDescription());
            txtCompDesignation.setText(model.getDesignation());
        }
    }
}

