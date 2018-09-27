package com.example.ideaplunge.basegrit.ui.Users;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.ideaplunge.basegrit.R;
import com.example.ideaplunge.basegrit.data.network.model.UserResponse;

import java.util.ArrayList;

public class UserlistAdapter extends RecyclerView.Adapter<UserlistAdapter.UserViewHolder> {

    private ArrayList<UserResponse> userList;
    private  Context context;
    LayoutInflater layoutInflater;


     public UserlistAdapter(Context context, ArrayList<UserResponse> userList)

     {
         this.context=context;
         userList=userList;
     }
    @NonNull
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

         layoutInflater = LayoutInflater.from(viewGroup.getContext());
        View view = layoutInflater.inflate(R.layout.item_users_list, viewGroup, false);
        return new UserViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull UserViewHolder userViewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    class UserViewHolder extends RecyclerView.ViewHolder {

        TextView txtNoticeTitle, txtNoticeBrief, txtNoticeFilePath;

        UserViewHolder(View itemView) {
            super(itemView);
            txtNoticeTitle =  itemView.findViewById(R.id.txt_notice_title);
            txtNoticeBrief =  itemView.findViewById(R.id.txt_notice_brief);
            txtNoticeFilePath =  itemView.findViewById(R.id.txt_notice_file_path);

        }
    }
}
