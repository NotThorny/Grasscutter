package emu.grasscutter.data.common;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;

// Used in excels
public class ItemParamData {
    @SerializedName(
            value = "id",
            alternate = {"itemId"})
    private int id;

    @SerializedName(
            value = "count",
            alternate = {"itemCount"})
    private int count;

    @Getter @Setter
    private int min;
    @Getter @Setter
    private int max;

    public ItemParamData() {}

    public ItemParamData(int id, int count) {
        this.id = id;
        this.count = count;
    }

    public int getId() {
        return id;
    }

    public int getItemId() {
        return id;
    }

    public int getCount() {
        return count;
    }

    public int getItemCount() {
        return count;
    }
}
