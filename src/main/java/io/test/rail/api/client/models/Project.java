package io.test.rail.api.client.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

/**
 * Created by alpa on 2018-12-06
 */
@Data
public class Project {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("announcement")
    @Expose
    private Object announcement;
    @SerializedName("show_announcement")
    @Expose
    private Boolean showAnnouncement;
    @SerializedName("is_completed")
    @Expose
    private Boolean isCompleted;
    @SerializedName("completed_on")
    @Expose
    private Object completedOn;
    @SerializedName("suite_mode")
    @Expose
    private Integer suiteMode;
    @SerializedName("url")
    @Expose
    private String url;
}
