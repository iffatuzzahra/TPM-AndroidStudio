package com.example.proyektpmsportapidatabase.view.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.proyektpmsportapidatabase.R;
import com.example.proyektpmsportapidatabase.data.local.AppDatabase;
import com.example.proyektpmsportapidatabase.model.note.NoteModel;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class AddActivity extends AppCompatActivity {
    private EditText etAdd;
    private Button btnAdd;
    private TextView tvTitle;
    private AppDatabase appDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);

        etAdd = findViewById(R.id.et_addnote);
        btnAdd = findViewById(R.id.btn_done_addnote);
        tvTitle = findViewById(R.id.t_title_addnote);

        String sportname = getIntent().getStringExtra("sportname");
        tvTitle.setText(sportname);

        appDatabase = AppDatabase.getInstance(this);

        btnAdd.setOnClickListener(v -> {
            try {
                String textNote = etAdd.getText().toString();
                String date = new SimpleDateFormat("dd-MM-yyyy", Locale.getDefault()).format(new Date());

                NoteModel noteModel = new NoteModel(sportname, textNote, date);
                appDatabase.noteDao().insert(noteModel);
                Log.d("btn Add3",noteModel.toString());

                this.finish();
            } catch (NumberFormatException nfe) {
                Toast.makeText(getApplicationContext(), "Cant Save Empty Notes", Toast.LENGTH_SHORT).show();
            }

        });
    }
}