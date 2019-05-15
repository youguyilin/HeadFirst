package com.example.demo.headfirstdemopractice.touchevent;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

import com.example.demo.headfirstdemopractice.R;

/**
 * PackageName: com.example.demo.headfirstdemopractice.touchevent
 * ClassName: ExecuteTouchActivity
 * Author: chuyingen
 * Date: 2019-05-10 16:22
 * Description:
 */
public class ExecuteTouchActivity extends AppCompatActivity implements View.OnClickListener,View.OnTouchListener {
    private static final String TAG = "ExecuteTouchActivity";
    private MyTextView mMyTextView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cyg_execute_touch_layout);
        mMyTextView = (MyTextView) findViewById(R.id.t1);
        mMyTextView.setOnClickListener(this);
        mMyTextView.setOnTouchListener(this);
    }

    /**
     * Called when a view has been clicked.
     *
     * @param v The view that was clicked.
     */
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.t1:
                Log.e(TAG, "onClick ACTION_UP ");
                break;
        }

    }

    /**
     * Called when a touch event is dispatched to a view. This allows listeners to
     * get a chance to respond before the target view.
     *
     * @param v     The view the touch event has been dispatched to.
     * @param event The MotionEvent object containing full information about
     *              the event.
     * @return True if the listener has consumed the event, false otherwise.
     */
    @Override
    public boolean onTouch(View v, MotionEvent event) {
        switch (v.getId()){
            case R.id.t1:
                motionEventLog("onTouch",event);
                break;
        }
        return false;
    }


    /**
     * Called to process touch screen events.  You can override this to
     * intercept all touch screen events before they are dispatched to the
     * window.  Be sure to call this implementation for touch screen events
     * that should be handled normally.
     *
     * @param ev The touch screen event.
     * @return boolean Return true if this event was consumed.
     */
    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        motionEventLog("dispatchTouchEvent",ev);
        return super.dispatchTouchEvent(ev);
    }

    /**
     * Called when a touch screen event was not handled by any of the views
     * under it.  This is most useful to process touch events that happen
     * outside of your window bounds, where there is no view to receive it.
     *
     * @param event The touch screen event being processed.
     * @return Return true if you have consumed the event, false if you haven't.
     * The default implementation always returns false.
     */
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        motionEventLog("onTouchEvent",event);
        return super.onTouchEvent(event);
    }

    /**
     * 处理点击事件日志
     * @param function
     * @param event
     */
    public void motionEventLog(String function,MotionEvent event){
        switch (event.getAction()){
            case MotionEvent.ACTION_DOWN:
                Log.e(TAG,  function + " ACTION_DOWN ");
                break;
            case MotionEvent.ACTION_MOVE:
                Log.e(TAG, function +" ACTION_MOVE ");
                break;
            case MotionEvent.ACTION_UP:
                Log.e(TAG, function + " ACTION_UP ");
                break;
            case MotionEvent.ACTION_CANCEL:
                Log.e(TAG, function + " ACTION_CANCEL ");
                break;
            default:
                break;
        }
    }
}
