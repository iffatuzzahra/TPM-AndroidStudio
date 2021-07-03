package com.example.proyektpmsportapi.adapter;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.proyektpmsportapi.R;
import com.example.proyektpmsportapi.model.league.LeagueItem;
import com.example.proyektpmsportapi.view.activity.DetailActivity;
import com.example.proyektpmsportapi.view.activity.StandingteamActivity;

import java.util.ArrayList;

public class LeagueAdapter extends RecyclerView.Adapter<LeagueAdapter.ViewHolder> {
    private ArrayList<LeagueItem> leagueItems = new ArrayList<>();
    private Context context;

    public void setData(ArrayList<LeagueItem> items) {
        leagueItems.clear();
        leagueItems.addAll(items);
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_main,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.bind(leagueItems.get(position));
    }

    @Override
    public int getItemCount() {
        return leagueItems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView img_content;
        TextView title_content, country, currsess;
        Button btnDetail, btnStandingTeam;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            img_content = itemView.findViewById(R.id.img_content);
            title_content = itemView.findViewById(R.id.t_title_content);
            country = itemView.findViewById(R.id.tv_d_country_main);
            currsess = itemView.findViewById(R.id.tv_d_currsess_main);
            btnDetail = itemView.findViewById(R.id.btn_detail);
            btnStandingTeam = itemView.findViewById(R.id.btn_standing_team);
        }

        public void bind(LeagueItem leagueItem) {
            Log.d("Detail","Masuk");

            Glide.with(itemView.getContext()).load(leagueItem.getStrBadge()).into(img_content);
            title_content.setText(leagueItem.getStrLeague());
            country.setText(leagueItem.getStrCountry());
            currsess.setText(leagueItem.getStrCurrentSeason());

            btnDetail.setOnClickListener(v -> {
                Intent detail = new Intent(itemView.getContext(), DetailActivity.class);

                detail.putExtra("image", leagueItem.getStrBadge());
                detail.putExtra("title", leagueItem.getStrLeague());
                detail.putExtra("country", leagueItem.getStrCountry());
                detail.putExtra("formed", leagueItem.getIntFormedYear());
                detail.putExtra("currsess", leagueItem.getStrCurrentSeason());
                detail.putExtra("lock", leagueItem.getStrLocked());
                detail.putExtra("desc", leagueItem.getStrDescriptionEN());

                itemView.getContext().startActivity(detail);
            });

            btnStandingTeam.setOnClickListener(v -> {
                Intent standing = new Intent(itemView.getContext(), StandingteamActivity.class);
                standing.putExtra("leagueId", leagueItem.getIdLeague());
                standing.putExtra("year", leagueItem.getStrCurrentSeason());

                itemView.getContext().startActivity(standing);
            });
        }
    }


}
