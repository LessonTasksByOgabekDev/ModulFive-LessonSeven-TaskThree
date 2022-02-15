package dev.ogabek.java.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import dev.ogabek.java.R;
import dev.ogabek.java.model.Short;

public class ShortAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    List<Short> shorts;

    public ShortAdapter(List<Short> shorts) {
        this.shorts = shorts;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_short_view, parent, false);
        return new ShortViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        Short short_video = shorts.get(position);

        if (holder instanceof ShortViewHolder) {
            ((ShortViewHolder) holder).title.setText(short_video.getTitle());
            ((ShortViewHolder) holder).views.setText(short_video.getView() + " views");
            ((ShortViewHolder) holder).image.setImageResource(short_video.getPhoto());
        }
    }

    @Override
    public int getItemCount() {
        return shorts.size();
    }

    private static class ShortViewHolder extends RecyclerView.ViewHolder {

        ImageView image;
        TextView title, views;

        public ShortViewHolder(View view) {
            super(view);

            image = view.findViewById(R.id.iv_short_photo);
            title = view.findViewById(R.id.tv_short_title);
            views = view.findViewById(R.id.tv_short_view);
        }
    }
}
