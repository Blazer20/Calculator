package com.example.Calculator;

import android.content.Context;
import android.util.AttributeSet;

public class MyButtons extends androidx.appcompat.widget.AppCompatButton {

    public MyButtons(Context context) {
        super(context);
    }

    public MyButtons(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MyButtons(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, widthMeasureSpec);
    }
}
