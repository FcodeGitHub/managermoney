package com.hy.moneyplanning.pojo;

public class ControlInfo {
    private Integer id;

    private Integer basicInfo;

    private Integer money;

    private Integer manageState;

    private Integer repay;

    private Integer manager;

    private String guarantee;

    private Integer safetyId;

    private String guaranteeInfo;

    private String guaranteeIdea;

    private Integer riskcontrolId;

    private int projectId;

    private Safety safety;

    private RiskControl riskControl;

    private int grade;

    private String creditLevel;

    public ControlInfo() {
    }

    public ControlInfo(Integer id, Integer basicInfo, Integer money, Integer manageState, Integer repay, Integer manager, String guarantee, Integer safetyId, String guaranteeInfo, String guaranteeIdea, Integer riskcontrolId) {
        this.id = id;
        this.basicInfo = basicInfo;
        this.money = money;
        this.manageState = manageState;
        this.repay = repay;
        this.manager = manager;
        this.guarantee = guarantee;
        this.safetyId = safetyId;
        this.guaranteeInfo = guaranteeInfo;
        this.guaranteeIdea = guaranteeIdea;
        this.riskcontrolId = riskcontrolId;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getCreditLevel() {
        return creditLevel;
    }

    public void setCreditLevel(String creditLevel) {
        this.creditLevel = creditLevel;
    }

    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getBasicInfo() {
        return basicInfo;
    }

    public void setBasicInfo(Integer basicInfo) {
        this.basicInfo = basicInfo;
    }

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }

    public Integer getManageState() {
        return manageState;
    }

    public void setManageState(Integer manageState) {
        this.manageState = manageState;
    }

    public Integer getRepay() {
        return repay;
    }

    public void setRepay(Integer repay) {
        this.repay = repay;
    }

    public Integer getManager() {
        return manager;
    }

    public void setManager(Integer manager) {
        this.manager = manager;
    }

    public String getGuarantee() {
        return guarantee;
    }

    public void setGuarantee(String guarantee) {
        this.guarantee = guarantee;
    }

    public Integer getSafetyId() {
        return safetyId;
    }

    public void setSafetyId(Integer safetyId) {
        this.safetyId = safetyId;
    }

    public String getGuaranteeInfo() {
        return guaranteeInfo;
    }

    public void setGuaranteeInfo(String guaranteeInfo) {
        this.guaranteeInfo = guaranteeInfo;
    }

    public String getGuaranteeIdea() {
        return guaranteeIdea;
    }

    public void setGuaranteeIdea(String guaranteeIdea) {
        this.guaranteeIdea = guaranteeIdea;
    }

    public Integer getRiskcontrolId() {
        return riskcontrolId;
    }

    public void setRiskcontrolId(Integer riskcontrolId) {
        this.riskcontrolId = riskcontrolId;
    }

    public Safety getSafety() {
        return safety;
    }

    public void setSafety(Safety safety) {
        this.safety = safety;
    }

    public RiskControl getRiskControl() {
        return riskControl;
    }

    public void setRiskControl(RiskControl riskControl) {
        this.riskControl = riskControl;
    }

    @Override
    public String toString() {
        return "ControlInfo{" +
                "id=" + id +
                ", basicInfo=" + basicInfo +
                ", money=" + money +
                ", manageState=" + manageState +
                ", repay=" + repay +
                ", manager=" + manager +
                ", guarantee='" + guarantee + '\'' +
                ", safetyId=" + safetyId +
                ", guaranteeInfo='" + guaranteeInfo + '\'' +
                ", guaranteeIdea='" + guaranteeIdea + '\'' +
                ", riskcontrolId=" + riskcontrolId +
                '}';
    }
}