package com.github.onlynight.slidingconfict.scroll;

import android.content.Context;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;

/**
 * Created by lion on 2016/12/21.
 */

public class ScrollViewEx extends ScrollView {
    public ScrollViewEx(Context context) {
        super(context);
    }

    public ScrollViewEx(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public ScrollViewEx(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @RequiresApi(21)
    public ScrollViewEx(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        if (isListViewTouched(ev)) {
            return false;
        } else {
            return super.onInterceptTouchEvent(ev);
        }
    }

    private boolean isListViewTouched(MotionEvent ev) {
        if (getChildCount() == 1) {
            float touchX = ev.getX();
            float touchY = ev.getY() + getScrollY();

            LinearLayout baseLinear = (LinearLayout) getChildAt(0);
            for (int i = 0; i < baseLinear.getChildCount(); i++) {
                View child = baseLinear.getChildAt(i);

                // add map view you want ignore
                if (isListView(child)) {
                    if (touchX < child.getRight() && touchX > child.getLeft() &&
                            touchY < child.getBottom() && touchY > child.getTop()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private boolean isListView(View child) {
        return child instanceof ListView;
    }
}
