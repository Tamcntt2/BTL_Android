package com.example.sieuthi.homefragment;

import static java.lang.Math.min;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.sieuthi.R;

import org.w3c.dom.Text;

import java.util.List;
import java.util.Locale;

public class NewsfeedAdapter extends RecyclerView.Adapter<NewsfeedAdapter.NewsfeedViewHolder> {

    Context context;
    List<Newsfeed> listNews;

    public NewsfeedAdapter(Context context, List<Newsfeed> listNews) {
        this.context = context;
        this.listNews = listNews;
    }

    @NonNull
    @Override
    public NewsfeedViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_recyclerview_newsfeed, parent, false);

        return new NewsfeedViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NewsfeedViewHolder holder, int position) {
        Newsfeed newsfeed = (Newsfeed) listNews.get(position);
        if(newsfeed != null) {
            holder.imgPhoto.setImageResource(newsfeed.getImgPhoto());
            holder.tvName.setText(newsfeed.getTitle().toUpperCase(Locale.ROOT));
            holder.tvCalender.setText(newsfeed.getTime());
            holder.tvShortContent.setText(newsfeed.getShortContent());

        }
    }

    @Override
    public int getItemCount() {
        return min(5, listNews.size());
    }

    public class NewsfeedViewHolder extends RecyclerView.ViewHolder {

        ImageView imgPhoto;
        TextView tvName;
        TextView tvCalender;
        TextView tvShortContent;

        public NewsfeedViewHolder(@NonNull View itemView) {
            super(itemView);

            imgPhoto = (ImageView) itemView.findViewById(R.id.imageViewNews);
            tvName = (TextView) itemView.findViewById(R.id.textViewNewsName);
            tvCalender = (TextView) itemView.findViewById(R.id.textViewNewsCalendar);
            tvShortContent = (TextView) itemView.findViewById(R.id.textViewShortContent);
        }
    }
}
