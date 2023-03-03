package ru.mirea.seyfetdinov.r.n.buttonclicker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView textViewStudent;
    private Button btnWhoIAm;
    private Button btnItsNotMe;

    private TextView CheckBox;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textViewStudent = findViewById(R.id.tvOut);
        btnWhoIAm = findViewById(R.id.btnWhoIAm);
        btnItsNotMe = findViewById(R.id.btnItsNotMe);
        CheckBox = findViewById(R.id.CheckBox);

        View.OnClickListener oclBtnWhoAmI = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewStudent.setText("Мой номер по списку № X");
            }
        };
        btnWhoIAm.setOnClickListener(oclBtnWhoAmI);

        View.OnClickListener oclBtnItsNotIAm = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckBox.setText(R.string.itsNotMy);
            }
        };
        btnItsNotMe.setOnClickListener(oclBtnItsNotIAm);
    }


    public void onMyButtonClick(View view)
    {
        Toast.makeText(this, R.string.no_user_input, Toast.LENGTH_SHORT).show();
    }

}