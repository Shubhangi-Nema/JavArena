public class WMA implements  Comparable<WMA> {
    private String appName;
    private String superwiser;
    private int teamCount;

    public WMA(String appName, String superwiser, int teamCount) {
        this.appName = appName;
        this.superwiser = superwiser;
        this.teamCount = teamCount;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getSuperwiser() {
        return superwiser ;
    }

    public void setSuperwiser(String superwiser) {
        this. superwiser= superwiser;
    }

    public int getTeamCount() {
        return teamCount;
    }

    public void setTeamCount(int teamCount) {
        this.teamCount = teamCount;
    }

    @Override
    public String toString() {
        return "WMA{" +
                "appName='" + appName + '\'' +
                ", superwiser='" + superwiser + '\'' +
                ", teamCount=" + teamCount +
                '}';
    }

    @Override
    public int compareTo(WMA o) {
        return this.appName.compareTo(o.getAppName());
    }
}
