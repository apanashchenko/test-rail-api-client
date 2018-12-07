package io.test.rail.api.client.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.util.List;

/**
 * Created by alpa on 2018-12-07
 */
@Data
public class Entry {
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("runs")
    @Expose
    private List<Run> runs = null;
    @SerializedName("suite_id")
    @Expose
    private Integer suiteId;
}
