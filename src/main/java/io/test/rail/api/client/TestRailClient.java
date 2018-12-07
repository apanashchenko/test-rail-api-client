package io.test.rail.api.client;

import io.test.rail.api.client.models.*;
import okhttp3.ResponseBody;
import retrofit2.http.*;

import java.util.List;

/**
 * Created by alpa on 2018-12-06
 */
public interface TestRailClient {

    /**
     * ======================== Cases API Requests ================================================
     * See {@link <a href="http://docs.gurock.com/testrail-api2/reference-cases">Cases</a>}.
     */
    @GET("/index.php%3F/api/v2/get_cases/{projectId}")
    List<TestCase> getTestCases(@Path("projectId") int projectId);

    @GET("/index.php%3F/api/v2/get_cases/{projectId}&suite_id={suite_id}")
    List<TestCase> getTestCases(@Path("projectId") int projectId, @Path("suite_id") int suiteId);

    @GET("/index.php%3F/api/v2/get_cases/{projectId}&suite_id={suite_id}&section_id={section_id}")
    List<TestCase> getTestCases(@Path("projectId") int projectId, @Path("suite_id") int suiteId,
                                @Path("section_id") int sectionId);

    @GET("/index.php%3F/api/v2/get_case/{caseId}")
    TestCase getTestCase(@Path("caseId") int caseId);

    @POST("/index.php%3F/api/v2/add_case/{sectionId}")
    TestCase addTestCase(@Path("sectionId") int sectionId, @Body TestCase testCase);

    @POST("/index.php%3F/api/v2/update_case/{caseId}")
    TestCase updateTestCase(@Path("caseId") int caseId, @Body TestCase testCase);

    @POST("/index.php%3F/api/v2/delete_case/{caseId}")
    ResponseBody deleteTestCase(@Path("caseId") int caseId);


    /**
     * ======================== Case Fields API Requests ============================================
     * See {@link <a href="http://docs.gurock.com/testrail-api2/reference-cases-fields">Case Fields</a>}.
     */
    @GET("/index.php%3F/api/v2/get_case_fields")
    List<CaseField> getCaseFields();

    @GET("/index.php%3F/api/v2/add_case_field")
    CaseField addCaseField(@Body CaseField caseField);


    /**
     * ======================== Case Types API Requests =============================================
     * See {@link <a href="http://docs.gurock.com/testrail-api2/reference-cases-types">Case Types</a>}.
     */
    @GET("/index.php%3F/api/v2/get_case_types")
    List<CaseType> getCaseTypes();


    /**
     * ======================== Configurations API Requests =========================================
     * See {@link <a href="http://docs.gurock.com/testrail-api2/reference-configs">Configurations</a>}.
     */
    @GET("/index.php%3F/api/v2/get_configs/{projectId}")
    List<Configs> getConfigs(@Path("projectId") int projectId);

    @POST("/index.php%3F/api/v2/add_config_group/{projectId}")
    Configs addConfigGroup(@Path("projectId") int projectId, @Body Config config);

    @POST("/index.php%3F/api/v2/update_config_group/{configGroupId}")
    Configs updateConfigGroup(@Path("configGroupId") int configGroupId, @Body Config config);

    @POST("/index.php%3F/api/v2/delete_config_group/{configGroupId}")
    ResponseBody deleteConfigGroup(@Path("configGroupId") int configGroupId);

    @POST("/index.php%3F/api/v2/add_config/{configId}")
    Configs addConfig(@Path("configId") int configId, @Body Configs config);

    @POST("/index.php%3F/api/v2/update_config/{configId}")
    Configs updateConfig(@Path("configId") int configId, @Body Configs config);

    @POST("/index.php%3F/api/v2/delete_config/{configId}")
    ResponseBody deleteConfig(@Path("configId") int configId);

    /**
     * ======================== Milestones API Requests ==============================================
     * See {@link <a href="http://docs.gurock.com/testrail-api2/reference-milestones">Milestones</a>}.
     */
    @GET("/index.php%3F/api/v2/get_milestones/{projectId}")
    List<Milestone> getMilestones(@Path("projectId") int projectId);

    @GET("/index.php%3F/api/v2/get_milestone/{milestoneId}")
    Milestone getMilestone(@Path("milestoneId") int milestoneId);

    @GET("/index.php%3F/api/v2/add_milestone/{projectId}")
    Milestone addMilestone(@Path("projectId") int projectId, @Body Milestone milestone);

    @GET("/index.php%3F/api/v2/update_milestone/{milestoneId}")
    Milestone updateMilestone(@Path("milestoneId") int milestoneId, @Body Milestone milestone);

    @GET("/index.php%3F/api/v2/delete_milestone/{milestoneId}")
    ResponseBody feleteMilestone(@Path("milestoneId") int milestoneId, @Body Milestone milestone);


    /**
     * ======================== Plans API Requests ===================================================
     * See {@link <a href="http://docs.gurock.com/testrail-api2/reference-plans">Plans</a>}.
     */

    @GET("/index.php%3F/api/v2/get_plans/{projectId}")
    List<Plan> getPlans(@Path("projectId") int projectId);

    @GET("/index.php%3F/api/v2/get_plan/{planId}")
    Plan getPlan(@Path("planId") int planId);

    @POST("/index.php%3F/api/v2/add_plan/{projectId}")
    Plan addPlan(@Path("projectId") int projectId, @Body Plan plan);

    @POST("/index.php%3F/api/v2/update_plan/{planId}")
    Plan updatePlan(@Path("planId") int planId, @Body Plan plan);

    @POST("/index.php%3F/api/v2/add_plan_entry/{planId}")
    Plan addPlanEntry(@Path("planId") int planId, @Body Entry plan);

    @POST("/index.php%3F/api/v2/update_plan_entry/{planId}/{entryId}")
    Plan addPlanEntry(@Path("planId") int planId, @Path("entryId") int entryId, @Body Entry plan);

    @POST("/index.php%3F/api/v2/close_plan/{planId}")
    Plan closePlan(@Path("planId") int planId);

    @POST("/index.php%3F/api/v2/delete_plan/{planId}")
    ResponseBody deletePlan(@Path("planId") int planId);

    @POST("/index.php%3F/api/v2/delete_plan_entry/{planId}/{entryId}")
    ResponseBody deletePlan(@Path("planId") int planId, @Path("entryId") int entryId);


    /**
     * ======================== Priorities API Requests ==============================================
     * See {@link <a href="http://docs.gurock.com/testrail-api2/reference-priorities">Priorities</a>}.
     */
    @GET("/index.php%3F/api/v2/get_priorities")
    List<Priority> getPriorities();


    /**
     * ======================== Projects API Requests ================================================
     * See {@link <a href="http://docs.gurock.com/testrail-api2/reference-projects">Projects</a>}.
     */
    @GET("/index.php%3F/api/v2/get_projects")
    List<Project> getProjects();

    @GET("/index.php%3F/api/v2/get_project/{projectId}")
    Project getProject(@Path("projectId") int projectId);

    @POST("/index.php%3F/api/v2/add_project")
    Project addProject(@Body Project project);

    @POST("/index.php%3F/api/v2/update_project/{projectId}")
    Project updateProject(@Path("projectId") int projectId, @Body Project project);

    @POST("/index.php%3F/api/v2/delete_project/{projectId}")
    ResponseBody deleteProject(@Path("projectId") int projectId);


    /**
     * ======================== Results API Requests ==================================================
     * See {@link <a href="http://docs.gurock.com/testrail-api2/reference-results">Results</a>}.
     */
    @GET("/index.php%3F/api/v2/get_results/{testId}")
    List<Result> getResultsForTest(@Path("testId") int testId);

    @GET("/index.php%3F/api/v2/get_results_for_case/{runId}/{caseId}")
    List<Result> getResultsForCase(@Path("runId") int runId, @Path("caseId") int caseId);

    @GET("/index.php%3F/api/v2/get_results_for_run/{runId}")
    List<Result> getResultsForRun(@Path("runId") int runId);

    @POST("/index.php%3F/api/v2/add_result/{testId}")
    List<Result> addResultsForTest(@Path("testId") int testId, @Body Result result);

    @POST("/index.php%3F/api/v2/add_result_for_case/{runId}/{caseId}")
    List<Result> addResultsForCase(@Path("runId") int runId, @Path("caseId") int caseId, @Body Result result);

    @POST("/index.php%3F/api/v2/add_results_for_cases/{runId}")
    List<Result> addResultsForCase(@Path("runId") int runId, @Body Result result);

    @POST("/index.php%3F/api/v2/add_results/{runId}")
    List<Result> addResultsForRun(@Path("runId") int runId, @Body Result result);


    /**
     * ======================== Result Fields API Requests ==============================================
     * See {@link <a href="http://docs.gurock.com/testrail-api2/reference-results-fields">Result Fields</a>}.
     */
    @GET("/index.php%3F/api/v2/get_result_fields")
    List<ResultField> getResultFields();


    /**
     * ======================== Runs API Requests ===========================================
     * See {@link <a href="http://docs.gurock.com/testrail-api2/reference-runs">Runs</a>}.
     */
    @GET("/index.php%3F/api/v2/get_runs/{projectId}")
    List<Run> getRuns(@Path("projectId") int projectId);

    @GET("/index.php%3F/api/v2/get_run/{runId}")
    Run getRun(@Path("runId") int runId);

    @POST("/index.php%3F/api/v2/add_run/{projectId}")
    Run addRun(@Path("projectId") int projectId, @Body Run run);

    @POST("/index.php%3F/api/v2/update_run/{runId}")
    Run updateRun(@Path("runId") int runId, @Body Run run);

    @POST("/index.php%3F/api/v2/close_run/{runId}")
    Run closeRun(@Path("runId") int runId);

    @POST("/index.php%3F/api/v2/delete_run/{runId}")
    ResponseBody deleteRun(@Path("runId") int runId);


    /**
     * ======================== Sections API Requests ===========================================
     * See {@link <a href="http://docs.gurock.com/testrail-api2/reference-sections">Sections</a>}.
     */
    @GET("/index.php%3F/api/v2/get_sections/{projectId}")
    Section getSections(@Path("projectId") int projectId);

    @GET("/index.php%3F/api/v2/get_sections/")
    List<Section> getSections(@Query("project_id") int projectId, @Query("suite_id") int suiteId);

    @POST("/index.php%3F/api/v2/add_section/{projectId}")
    Section addSection(@Path("projectId") int projectId);

    @POST("/index.php%3F/api/v2/update_section/{sectionId}")
    Section updateSection(@Path("sectionId") int sectionId);

    @POST("/index.php%3F/api/v2/delete_section/{sectionId}")
    Section deleteSection(@Path("sectionId") int sectionId);


    /**
     * ======================== Statuses API Requests ===========================================
     * See {@link <a href="http://docs.gurock.com/testrail-api2/reference-statuses">Statuses</a>}.
     */
    @GET("/index.php%3F/api/v2/get_statuses")
    List<Status> getStatus();


    /**
     * ======================== Suites API Requests ===========================================
     * See {@link <a href="http://docs.gurock.com/testrail-api2/reference-suites">Suites</a>}.
     */
    @GET("/index.php%3F/api/v2/get_suites/{projectId}")
    List<Suite> getSuites(@Path(value = "projectId", encoded = true) int projectId);

    @GET("/index.php%3F/api/v2/get_suite/{suiteId}")
    Suite getSuite(@Path("suiteId") int suiteId);

    @POST("/index.php%3F/api/v2/add_suite/{projectId}")
    Suite addSuite(@Path("projectId") int projectId, @Body Suite suite);

    @POST("/index.php%3F/api/v2/update_suite/{suiteId}")
    Suite updateSuite(@Path("suiteId") int suiteId, @Body Suite suite);

    @POST("/index.php%3F/api/v2/delete_suite/{suiteId}")
    ResponseBody deleteSuite(@Path("suiteId") int suiteId);


    /**
     * ======================== Templates API Requests ===========================================
     * See {@link <a href="http://docs.gurock.com/testrail-api2/reference-templates">Templates</a>}.
     */
    @GET("/index.php%3F/api/v2/get_templates/{projectId}")
    List<Template> getTemplates(@Path("projectId") int projectId);


    /**
     * ======================== Tests API Requests ===========================================
     * See {@link <a href="http://docs.gurock.com/testrail-api2/reference-tests">Tests</a>}.
     */
    @GET("/index.php%3F/api/v2/get_tests/{runId}")
    List<Test> getTests(@Path("runId") int runId);

    @GET("/index.php%3F/api/v2/get_tests/{runId}")
    List<Test> getTests(@Path("runId") int runId, @Query("status_id") int statusId);

    @GET("/index.php%3F/api/v2/get_test/{testId}")
    Test getTest(@Path("testId") int testId);


    /**
     * ======================== Users API Requests ===========================================
     * See {@link <a href="http://docs.gurock.com/testrail-api2/reference-users">Users</a>}.
     */
    @GET("/index.php%3F/api/v2/get_users")
    List<User> getUsers();

    @GET("/index.php%3F/api/v2/get_user/{userId}")
    User getUser(@Path("userId") int userId);

    @GET("/index.php%3F/api/v2/get_user_by_email&email={email}")
    User getUserByEmail(@Path("email") String email);

}
