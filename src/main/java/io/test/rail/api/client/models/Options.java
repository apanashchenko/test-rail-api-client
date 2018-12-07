package io.test.rail.api.client.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

/**
 * Created by alpa on 2018-12-06
 */
@Data
public class Options {

    @SerializedName("default_value")
    @Expose
    private String defaultValue;
    @SerializedName("format")
    @Expose
    private String format;
    @SerializedName("is_required")
    @Expose
    private Boolean isRequired;
    @SerializedName("has_actual")
    @Expose
    private Boolean hasActual;
    @SerializedName("has_expected")
    @Expose
    private Boolean hasExpected;
    @SerializedName("rows")
    @Expose
    private String rows;
    @SerializedName("items")
    @Expose
    private String items;
}
