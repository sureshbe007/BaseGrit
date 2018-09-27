package com.example.ideaplunge.basegrit.ui.Users;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.ideaplunge.basegrit.R;
import com.example.ideaplunge.basegrit.data.network.model.UserList;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class UserlistAdapter extends RecyclerView.Adapter<UserlistAdapter.UserViewHolder> {


    private static final String TAG=UserlistAdapter.class.getSimpleName();
    private ArrayList<UserList> userList;
    private  Context context;
    LayoutInflater layoutInflater;


     public UserlistAdapter(Context context, ArrayList<UserList> userList)

     {
         this.context=context;
         this.userList=userList;
         Log.d("TAGSSSS","userList====>>>>"+userList.size());
     }
    @NonNull
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

         layoutInflater = LayoutInflater.from(viewGroup.getContext());
        View view = layoutInflater.inflate(R.layout.item_users_list, viewGroup, false);
        return new UserViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull UserViewHolder userViewHolder, int position) {

         userViewHolder.txtNoticeTitle.setText(userList.get(position).getName());
         userViewHolder.txtNoticeBrief.setText(userList.get(position).getAge());
         userViewHolder.txtNoticeFilePath.setText(userList.get(position).getEmail());

    }

    @Override
    public int getItemCount() {
        return userList.size();
    }

    class UserViewHolder extends RecyclerView.ViewHolder {

         @BindView(R.id.txt_notice_title)
        TextView txtNoticeTitle ;

        @BindView(R.id.txt_notice_brief)
        TextView txtNoticeBrief ;

        @BindView(R.id.txt_notice_file_path)
        TextView txtNoticeFilePath;

        UserViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);


        }
    }
}
