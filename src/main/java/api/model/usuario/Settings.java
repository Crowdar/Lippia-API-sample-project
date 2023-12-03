package api.model.usuario;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Settings {
    public String weekStart;
    public String timeZone;
    public String timeFormat;
    public String dateFormat;
    public boolean sendNewsletter;
    public boolean weeklyUpdates;
    public boolean longRunning;
    public boolean scheduledReports;
    public boolean approval;
    public boolean pto;
    public boolean alerts;
    public boolean reminders;
    public boolean timeTrackingManual;
    public SummaryReportSettings summaryReportSettings;
    public boolean isCompactViewOn;
    public String dashboardSelection;
    public String dashboardViewType;
    public boolean dashboardPinToTop;
    public int projectListCollapse;
    public boolean collapseAllProjectLists;
    public boolean groupSimilarEntriesDisabled;
    public String myStartOfDay;
    public boolean projectPickerTaskFilter;
    public String lang;
    public boolean multiFactorEnabled;
    public String theme;
    public boolean scheduling;
    public boolean onboarding;
    public boolean showOnlyWorkingDays;
}