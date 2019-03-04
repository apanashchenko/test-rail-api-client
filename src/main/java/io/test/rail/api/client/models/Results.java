package io.test.rail.api.client.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.util.List;

/**
 * Created by alpa on 2019-03-04
 */
@Data
public class Results {

    @SerializedName("results")
    @Expose
    private List<Result> results;
}
