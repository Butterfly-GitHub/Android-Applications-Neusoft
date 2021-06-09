package com.example.my_applications_neusoft;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.WindowManager;
import android.widget.Button;

import com.example.my_applications_neusoft.database.DBHelper;
import com.example.my_applications_neusoft.to_recyclerView.NoteAdapter_RecyclerView;
import com.example.my_applications_neusoft.to_recyclerView.NoteBean_RecyclerView;

import java.util.ArrayList;
import java.util.List;

/**
 * 记事本页面
 * （实现主功能）
 * 导航栏，菜单，切换背景，等等
 */
public class Notepad extends AppCompatActivity {
    private Button button;
    RecyclerView recyclerView_notepad;
    private DBHelper dbHelper;

    List<NoteBean_RecyclerView> datas_bean_recyclerView;/*数据源*/
    NoteAdapter_RecyclerView adapter;/*适配器*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //让虚拟键盘不会自动弹出，并且recyclerView组件不会上移
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_PAN);
        setContentView(R.layout.activity_notepad);

        button  = findViewById(R.id.button_save);
        //word.db是文件名
        dbHelper = new DBHelper(Notepad.this, "word.db", null, 1);
        getAllNotes();

        initView();
        datas_bean_recyclerView = new ArrayList<>();
        /*创建适配器*/
        adapter = new NoteAdapter_RecyclerView(this, datas_bean_recyclerView);
        recyclerView_notepad.setAdapter(adapter);/*设置 RecyclerView 适配器*/
        /*设置布局管理器。设置显示形式*/
        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerView_notepad.setLayoutManager(layoutManager);

//        loadLocalNoteData();
    }

    private void getAllNotes() {

    }

    /**
     * 加载本地的单个记事本文件😊😜到集合当中
     */
    private void loadLocalNoteData() {
        /*
        //1. 获取ContentResolver对象
        ContentResolver resolver = getContentResolver();
        //2. 获取本地存储的uri
        Uri uri = Media.;
        //3. 开始查询地址
        Cursor cursor =
        //4. 遍历Cursor
        while (cursor.moveToNext()) {

            //将一条note封装到bean对象中
            new NoteBean_RecyclerView(textView);
            datas_bean_recyclerView.add(bean);
        }
        */
        //数据源变化，提示adapter适配器更新
//        adapter.notifyDataSetChanged();
    }

    private void initView() {
        /*初始化控件的函数*/
        recyclerView_notepad = findViewById(R.id.recyclerView);
    }
}