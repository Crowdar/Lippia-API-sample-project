package api.model.workspaces;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Setter
@Getter
public class WorkspaceSettings {
    private Boolean timeRoundingInReports;
    private Boolean onlyAdminsSeeBillableRates;
    private Boolean onlyAdminsCreateProject;
    private Boolean onlyAdminsSeeDashboard;
    private Boolean defaultBillableProjects;
    private Boolean lockTimeEntries;
    private Round round;
    private Boolean projectFavorites;
    private Boolean canSeeTimeSheet;
    private Boolean canSeeTracker;
    private Boolean projectPickerSpecialFilter;
    private Boolean forceProjects;
    private Boolean forceTasks;
    private Boolean forceTags;
    private Boolean forceDescription;
    private Boolean onlyAdminsSeeAllTimeEntries;
    private Boolean onlyAdminsSeePublicProjectsEntries;
    private Boolean trackTimeDownToSecond;
    private String projectGroupingLabel;
    private List<String> adminOnlyPages;
    private String automaticLock;
    private String onlyAdminsCreateTag;
    private String onlyAdminsCreateTask;
    private String timeTrackingMode;
    private Boolean isProjectPublicByDefault;

}
