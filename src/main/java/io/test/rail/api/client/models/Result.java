package io.test.rail.api.client.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.util.List;

/**
 * Created by alpa on 2018-12-07
 */
@Data
public class Result {

    @SerializedName("assignedto_id")
    @Expose
    private Integer assignedtoId;

    @SerializedName("case_id")
    @Expose
    private Integer caseId;
    @SerializedName("comment")
    @Expose
    private String comment;
    @SerializedName("created_by")
    @Expose
    private Integer createdBy;
    @SerializedName("created_on")
    @Expose
    private Integer createdOn;
    @SerializedName("custom_step_results")
    @Expose
    private List<CustomStepResult> customStepResults = null;
    @SerializedName("defects")
    @Expose
    private String defects;
    @SerializedName("elapsed")
    @Expose
    private String elapsed;
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("status_id")
    @Expose
    private Integer statusId;
    @SerializedName("test_id")
    @Expose
    private Integer testId;
    @SerializedName("version")
    @Expose
    private String version;
}
