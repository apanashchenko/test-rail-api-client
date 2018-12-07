package io.test.rail.api.client.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.util.List;

/**
 * Created by alpa on 2018-12-07
 */
@Data
public class Plan {

    @SerializedName("assignedto_id")
    @Expose
    private Object assignedtoId;
    @SerializedName("blocked_count")
    @Expose
    private Integer blockedCount;
    @SerializedName("completed_on")
    @Expose
    private Object completedOn;
    @SerializedName("created_by")
    @Expose
    private Integer createdBy;
    @SerializedName("created_on")
    @Expose
    private Integer createdOn;
    @SerializedName("custom_status1_count")
    @Expose
    private Integer customStatus1Count;
    @SerializedName("custom_status2_count")
    @Expose
    private Integer customStatus2Count;
    @SerializedName("custom_status3_count")
    @Expose
    private Integer customStatus3Count;
    @SerializedName("custom_status4_count")
    @Expose
    private Integer customStatus4Count;
    @SerializedName("custom_status5_count")
    @Expose
    private Integer customStatus5Count;
    @SerializedName("custom_status6_count")
    @Expose
    private Integer customStatus6Count;
    @SerializedName("custom_status7_count")
    @Expose
    private Integer customStatus7Count;
    @SerializedName("description")
    @Expose
    private Object description;
    @SerializedName("entries")
    @Expose
    private List<Entry> entries = null;
    @SerializedName("failed_count")
    @Expose
    private Integer failedCount;
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("is_completed")
    @Expose
    private Boolean isCompleted;
    @SerializedName("milestone_id")
    @Expose
    private Integer milestoneId;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("passed_count")
    @Expose
    private Integer passedCount;
    @SerializedName("project_id")
    @Expose
    private Integer projectId;
    @SerializedName("retest_count")
    @Expose
    private Integer retestCount;
    @SerializedName("untested_count")
    @Expose
    private Integer untestedCount;
    @SerializedName("url")
    @Expose
    private String url;

}
