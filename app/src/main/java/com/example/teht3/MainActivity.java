package com.example.teht3;


import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.tv = findViewById(R.id.textView);

        updateUI();

    }

    String arvo;

    public void onRadioButtonClicked (View v){
        boolean checked = ((RadioButton) v).isChecked();

        switch (v.getId()) {
            case R.id.radio_DEC:
                if (checked)

                    this.arvo = Integer.toString(counter.getArvo());
                    updateUI();

                    break;
            case R.id.radio_BIN:
                if (checked)

                    this.arvo = Integer.toBinaryString(counter.getArvo());
                    updateUI();

                break;
            case R.id.radio_HEX:
                if (checked)

                    this.arvo = Integer.toHexString(counter.getArvo());
                    updateUI();

                break;

        }
    }

    Counter counter = new Counter();

    public void plusButtonPressed(View v)
    {
        counter.plus();
        updateUI();
    }
    public void minusButtonPressed(View v)
    {
        counter.minus();
        updateUI();
    }
    public void resetButtonPressed(View v)
    {
        counter.reset();
        updateUI();
    }

    public void updateUI() {
        tv.setText(arvo);
    }

}
