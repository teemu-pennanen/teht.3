package com.example.teht3;

import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;


public class Counter {

    TextView tv;

    private int arvo;

    public Counter() {
        this.arvo = 1;
    }

    public void plus() {
        if (this.arvo <= 93) {
            this.arvo = this.arvo + 1;
        }
    }

    public void minus() {
        if (this.arvo >= -93) {
            this.arvo = this.arvo - 1;
        }
    }

    public void reset() {
        this.arvo = 1;

    }

    public int getArvo() {

        return this.arvo;

    }

}
