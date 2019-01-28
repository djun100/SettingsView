package com.cy.settingviewdemo;

import android.app.Activity;
import android.view.View;
import android.widget.Toast;

import com.cy.settings.DefaultGroupData;
import com.cy.settings.DefaultSettingAdapter;
import com.cy.settings.DefaultSubItemData;
import com.cy.settings.IGroupData;
import com.cy.settings.ISubItemData;

import java.util.ArrayList;
import java.util.List;

public class SettingsAdapter extends DefaultSettingAdapter {


    public SettingsAdapter(Activity activity) {
        super(activity);
    }

    @Override
    public List<IGroupData> getSettingsData() {
        List<IGroupData> data = new ArrayList<>();

        IGroupData groupData = new DefaultGroupData();
        groupData.addSubItem(DefaultSubItemData.create().setTitle("支付"));
        data.add(groupData);

        IGroupData groupData2 = new DefaultGroupData();
        groupData2
                .addSubItem(DefaultSubItemData.create().setTitle("收藏")
                .setShowSwitch(true))
                .addSubItem(DefaultSubItemData.create().setTitle("其他")
                        .setDrawableLeft(R.drawable.ic_launcher_background))
                .addSubItem(DefaultSubItemData.create().setTitle("相册")
                .setSubTitle("本地相册"));
        data.add(groupData2);

        return data;
    }


    @Override
    public void bindViewMore(int position, View itemView,
                         IGroupData groupData, ISubItemData subItemData) {

        if (((DefaultSubItemData) subItemData).title.equals("支付")){
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(mActivity,"支付中...",Toast.LENGTH_SHORT).show();
                }
            });
        }
    }

}
