package com.jingjiang.secondsuccesstest.data;

import java.util.List;

/**
 * Created by dllo on 16/7/15.
 */
public class Data {

    /**
     * cate_type : 1
     * catename : 热门
     * alias : Hot
     * tab : hot
     * icon : http://cs.vmoiver.com/Uploads/Activity/2016-04-26/571ed9b5d2e44.jpg
     */

    private List<DataBean> data;

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        private String cate_type;
        private String catename;
        private String alias;
        private String tab;
        private String icon;

        public String getCate_type() {
            return cate_type;
        }

        public void setCate_type(String cate_type) {
            this.cate_type = cate_type;
        }

        public String getCatename() {
            return catename;
        }

        public void setCatename(String catename) {
            this.catename = catename;
        }

        public String getAlias() {
            return alias;
        }

        public void setAlias(String alias) {
            this.alias = alias;
        }

        public String getTab() {
            return tab;
        }

        public void setTab(String tab) {
            this.tab = tab;
        }

        public String getIcon() {
            return icon;
        }

        public void setIcon(String icon) {
            this.icon = icon;
        }
    }
}
