package ru.mirea.seyfetdinov.r.n.typelayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView tvMirea;
    private Button btnChangeMireaText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvMirea = findViewById(R.id.textViewMirea);
        btnChangeMireaText = findViewById(R.id.buttonChangeMireaText);

        View.OnClickListener onClickListener = new View.OnClickListener(){
            @Override
            public void onClick(View v){
                tvMirea.setText("Click number");
            }
        };
    }
}