package com.cy.settings;

public class DefaultSubItemData implements ISubItemData {
    public String title;
    public String subTitle;
    public int drawableLeft;
    public boolean showSwitch;

    private DefaultSubItemData() {
    }

    public static DefaultSubItemData create(){
        return new DefaultSubItemData();
    }

    public String getTitle() {
        return title;
    }

    public DefaultSubItemData setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public DefaultSubItemData setSubTitle(String subTitle) {
        this.subTitle = subTitle;
        return this;
    }

    public int getDrawableLeft() {
        return drawableLeft;
    }

    public DefaultSubItemData setDrawableLeft(int drawableLeft) {
        this.drawableLeft = drawableLeft;
        return this;
    }

    public boolean getShowSwitch() {
        return showSwitch;
    }

    public DefaultSubItemData setShowSwitch(boolean showSwitch) {
        this.showSwitch = showSwitch;
        return this;
    }
}
