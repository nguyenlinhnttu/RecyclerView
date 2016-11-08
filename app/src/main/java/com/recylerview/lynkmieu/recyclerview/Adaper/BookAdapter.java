package com.recylerview.lynkmieu.recyclerview.Adaper;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.recylerview.lynkmieu.recyclerview.R;
import com.recylerview.lynkmieu.recyclerview.model.Book;

import java.util.List;

/**
 * Created by LynkMieu on 2016/11/08.
 */

public class BookAdapter extends RecyclerView.Adapter<BookAdapter.BookViewHolder> {
    private List<Book> bookList;

    /** Create ViewHolder*/
    public class BookViewHolder extends  RecyclerView.ViewHolder {
        private TextView title;
        private TextView author;
        private TextView price;

        public BookViewHolder(View itemView) {
            super(itemView);
            title = (TextView) itemView.findViewById(R.id.title);
            author = (TextView) itemView.findViewById(R.id.author);
            price = (TextView) itemView.findViewById(R.id.price);
        }
    }

    public BookAdapter(List<Book> bookList) {
        this.bookList = bookList;
    }
    @Override
    public BookViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        /** Get layout */
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item,parent,false);
        return new BookViewHolder(view);
    }

    @Override
    public void onBindViewHolder(BookViewHolder holder, int position) {
        /** Set Value*/
        Book book = bookList.get(position);
        holder.title.setText(book.getTitle());
        holder.author.setText(book.getAuthor());
        holder.price.setText(book.getPrice());
    }

    @Override
    public int getItemCount() {
        return bookList.size();
    }
}