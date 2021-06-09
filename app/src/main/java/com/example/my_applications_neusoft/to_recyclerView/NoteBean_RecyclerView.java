package com.example.my_applications_neusoft.to_recyclerView;

import android.widget.TextView;

/**
 * 作为ListView的泛型，表示的每一个item_note的对象
 */
public class NoteBean_RecyclerView {
    private TextView textView;//单页记事本内容

    public NoteBean_RecyclerView() {
    }

    public NoteBean_RecyclerView(TextView textView) {
        this.textView = textView;
    }

    public TextView getTextView() {
        return textView;
    }

    public void setTextView(TextView textView) {
        this.textView = textView;
    }
}
