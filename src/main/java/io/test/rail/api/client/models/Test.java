package io.test.rail.api.client.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.util.List;

/**
 * Created by alpa on 2018-12-06
 */
@Data
public class Test {

    @SerializedName("assignedto_id")
    @Expose
    private Integer assignedtoId;
    @SerializedName("case_id")
    @Expose
    private Integer caseId;
    @SerializedName("custom_expected")
    @Expose
    private String customExpected;
    @SerializedName("custom_preconds")
    @Expose
    private String customPreconds;
    @SerializedName("custom_steps_separated")
    @Expose
    private List<CustomStepsSeparated> customStepsSeparated = null;
    @SerializedName("estimate")
    @Expose
    private String estimate;
    @SerializedName("estimate_forecast")
    @Expose
    private Object estimateForecast;
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("priority_id")
    @Expose
    private Integer priorityId;
    @SerializedName("run_id")
    @Expose
    private Integer runId;
    @SerializedName("status_id")
    @Expose
    private Integer statusId;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("type_id")
    @Expose
    private Integer typeId;
}
