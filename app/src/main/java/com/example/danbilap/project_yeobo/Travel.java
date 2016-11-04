package com.example.danbilap.project_yeobo;

import android.os.Parcel;
import android.os.Parcelable;

public class Travel implements Parcelable {
    int t_flag;
    int t_id;
    String t_title;
    int n_id;
    String t_nation_en;
    String t_start;
    String t_end;

    Travel(int flag, int t_id, String title, int n_id, String t_nation_en, String start, String end){
        this.t_flag = flag;
        this.t_id = t_id;
        this.t_title = title;
        this.n_id = n_id;
        this.t_nation_en = t_nation_en;
        this.t_start = start;
        this.t_end = end;
    }

    protected Travel(Parcel in) {
        t_flag = in.readInt();
        t_id = in.readInt();
        t_title = in.readString();
        n_id = in.readInt();
        t_nation_en = in.readString();
        t_start = in.readString();
        t_end = in.readString();
    }

    public static final Creator<Travel> CREATOR = new Creator<Travel>() {
        @Override
        public Travel createFromParcel(Parcel in) {
            return new Travel(in);
        }

        @Override
        public Travel[] newArray(int size) {
            return new Travel[size];
        }
    };

    public int getT_flag() { return t_flag; }
    public String getT_title(){
        return t_title;
    }
    public String getT_start(){
        return t_start;
    }
    public int getT_id() {
        return t_id;
    }
    public String getT_end(){
        return t_end;
    }

    public String getT_nation_en() {
        return t_nation_en;
    }

    public int getN_id() {
        return n_id;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(t_flag);
        dest.writeInt(t_id);
        dest.writeString(t_title);
        dest.writeInt(n_id);
        dest.writeString(t_nation_en);
        dest.writeString(t_start);
        dest.writeString(t_end);
    }
}
