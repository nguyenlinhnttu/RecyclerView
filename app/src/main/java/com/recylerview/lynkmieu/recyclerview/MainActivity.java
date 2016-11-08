package com.recylerview.lynkmieu.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import com.recylerview.lynkmieu.recyclerview.Adaper.BookAdapter;
import com.recylerview.lynkmieu.recyclerview.Adaper.RecyclerTouchListener;
import com.recylerview.lynkmieu.recyclerview.model.Book;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Book> bookList;
    private RecyclerView recyclerView;
    private BookAdapter bookAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addControl();
        addEvent();
    }

    private void addControl() {
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        bookList = new ArrayList<>();
        bookAdapter = new BookAdapter(bookList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setAdapter(bookAdapter);
    }

    private void addEvent() {
        /** Call method add data*/
        createData();
        /** Set Event Onclick*/
        recyclerView.addOnItemTouchListener(new RecyclerTouchListener(getApplicationContext(), recyclerView, new ClickListener() {
            @Override
            public void onClick(View view, int position) {
                Book book = bookList.get(position);
                Toast.makeText(getApplicationContext(), book.getTitle() + " is selected!", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onLongClick(View view, int position) {

            }
        }));
    }

    /** Add data to bookList*/
    public void createData() {
        Book book = new Book("Kỳ Án Ánh Trăng","Xác treo trong nhà gỗ","100.000");
        bookList.add(book);
        book = new Book("Tuyết Đoạt Hồn","Qủy Cổ Nữ","100.000");
        bookList.add(book);
        book = new Book("Tơ Đòng Rỏ Máu","Xác treo trong nhà gỗ","100.000");
        bookList.add(book);
        book = new Book("Hồ Tuyệt Mệnh","Qủy Cổ Nữ","100.000");
        bookList.add(book);
        book = new Book("Nỗi Đau Của Đom Đóm","Qủy Cổ Nữ","100.000");
        bookList.add(book);
        bookAdapter.notifyDataSetChanged();
    }
    // Interface
    public interface ClickListener {
        void onClick(View view, int position);

        void onLongClick(View view, int position);
    }
}
