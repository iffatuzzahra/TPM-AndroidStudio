package com.example.proyektpmsportapi.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.proyektpmsportapi.R;
import com.example.proyektpmsportapi.model.league.LeagueItem;
import com.example.proyektpmsportapi.model.standingteam.StandingTeamItem;

import java.util.ArrayList;

public class StandingteamAdapter extends RecyclerView.Adapter<StandingteamAdapter.ViewHolder> {
    private ArrayList<StandingTeamItem> standingItem = new ArrayList<>();
    private Context context;

    public void setData(ArrayList<StandingTeamItem> items) {
        standingItem.clear();
        standingItem.addAll(items);
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_standingteam,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.bind(standingItem.get(position));
    }

    @Override
    public int getItemCount() {
        return standingItem.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView img_content;
        TextView rank, title_content, played, point, win, loss, draw, updated;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            img_content = itemView.findViewById(R.id.img_rank);
            rank = itemView.findViewById(R.id.tv_d_rank);
            title_content = itemView.findViewById(R.id.tv_d_rank_title);
            played = itemView.findViewById(R.id.tv_d_played);
            point = itemView.findViewById(R.id.tv_d_point);
            win = itemView.findViewById(R.id.tv_d_win);
            loss = itemView.findViewById(R.id.tv_d_loss);
            draw = itemView.findViewById(R.id.tv_d_draw);
            updated = itemView.findViewById(R.id.tv_d_update);
        }
        public void bind(StandingTeamItem standingItem) {
            Glide.with(itemView.getContext()).load(standingItem.getStrTeamBadge()).into(img_content);
            rank.setText(standingItem.getIntRank());
            title_content.setText(standingItem.getStrTeam());
            played.setText(standingItem.getIntPlayed());
            point.setText(standingItem.getIntPoints());
            win.setText(standingItem.getIntWin());
            loss.setText(standingItem.getIntLoss());
            draw.setText(standingItem.getIntDraw());
            updated.setText(standingItem.getDateUpdated());
        }
    }
}
