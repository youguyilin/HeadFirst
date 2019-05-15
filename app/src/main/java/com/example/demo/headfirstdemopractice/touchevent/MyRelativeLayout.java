package com.example.demo.headfirstdemopractice.touchevent;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.RelativeLayout;

/**
 * PackageName: com.example.demo.headfirstdemopractice.touchevent
 * ClassName: MyRelativeLayout
 * Author: chuyingen
 * Date: 2019-05-10 17:23
 * Description:
 */
public class MyRelativeLayout extends RelativeLayout {
    private static final String TAG = "MyRelativeLayout";
    public MyRelativeLayout(Context context) {
        super(context);
    }

    public MyRelativeLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        motionEventLog("dispatchTouchEvent",ev);
        return super.dispatchTouchEvent(ev);
    }

    /**
     * Implement this method to handle touch screen motion events.
     * <p>
     * If this method is used to detect click actions, it is recommended that
     * the actions be performed by implementing and calling
     * {@link #performClick()}. This will ensure consistent system behavior,
     * including:
     * <ul>
     * <li>obeying click sound preferences
     * <li>dispatching OnClickListener calls
     * <li>handling {@link AccessibilityNodeInfo#ACTION_CLICK ACTION_CLICK} when
     * accessibility features are enabled
     * </ul>
     *
     * @param event The motion event.
     * @return True if the event was handled, false otherwise.
     */
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        motionEventLog("onTouchEvent",event);
        return super.onTouchEvent(event);
    }

    /**
     * Implement this method to intercept all touch screen motion events.  This
     * allows you to watch events as they are dispatched to your children, and
     * take ownership of the current gesture at any point.
     *
     * <p>Using this function takes some care, as it has a fairly complicated
     * interaction with {@link View#onTouchEvent(MotionEvent)
     * View.onTouchEvent(MotionEvent)}, and using it requires implementing
     * that method as well as this one in the correct way.  Events will be
     * received in the following order:
     *
     * <ol>
     * <li> You will receive the down event here.
     * <li> The down event will be handled either by a child of this view
     * group, or given to your own onTouchEvent() method to handle; this means
     * you should implement onTouchEvent() to return true, so you will
     * continue to see the rest of the gesture (instead of looking for
     * a parent view to handle it).  Also, by returning true from
     * onTouchEvent(), you will not receive any following
     * events in onInterceptTouchEvent() and all touch processing must
     * happen in onTouchEvent() like normal.
     * <li> For as long as you return false from this function, each following
     * event (up to and including the final up) will be delivered first here
     * and then to the target's onTouchEvent().
     * <li> If you return true from here, you will not receive any
     * following events: the target view will receive the same event but
     * with the action {@link MotionEvent#ACTION_CANCEL}, and all further
     * events will be delivered to your onTouchEvent() method and no longer
     * appear here.
     * </ol>
     *
     * @param ev The motion event being dispatched down the hierarchy.
     * @return Return true to steal motion events from the children and have
     * them dispatched to this ViewGroup through onTouchEvent().
     * The current target will receive an ACTION_CANCEL event, and no further
     * messages will be delivered here.
     */
    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        motionEventLog("onInterceptTouchEvent",ev);
        return super.onInterceptTouchEvent(ev);
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
