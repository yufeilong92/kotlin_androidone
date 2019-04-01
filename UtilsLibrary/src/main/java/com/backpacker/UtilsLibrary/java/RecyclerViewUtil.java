package com.backpacker.UtilsLibrary.java;

import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

/**
 * @version V 1.0 xxxxxxxx
 * @Title: kotlin_androidone
 * @Package com.backpacker.UtilsLibrary.java
 * @Description: todo
 * @author: L-BackPacker
 * @date: 2019/4/1 22:28
 * @verdescript 版本号 修改时间  修改人 修改的概要说明
 * @Copyright: 2019
 */
public class RecyclerViewUtil {
    /**
     * RecyclerView 移动到当前位置，
     *
     * @param manager        设置RecyclerView对应的manager
     * @param recyclerView   当前的RecyclerView
     * @param selectPosition 要跳转的位置
     */
    public static  void MoveToPostion(GridLayoutManager manager, RecyclerView recyclerView, int selectPosition) {
        int firstVisibleItemPosition = manager.findFirstVisibleItemPosition();
        int lastVisibleItemPosition = manager.findLastVisibleItemPosition();
        if (selectPosition <= firstVisibleItemPosition) {
            recyclerView.scrollToPosition(selectPosition);
        } else if (lastVisibleItemPosition >= selectPosition) {
            int top = recyclerView.getChildAt(selectPosition - firstVisibleItemPosition).getTop();
            recyclerView.scrollBy(0, top);
        } else {
            recyclerView.smoothScrollToPosition(selectPosition);
        }
    }
}
