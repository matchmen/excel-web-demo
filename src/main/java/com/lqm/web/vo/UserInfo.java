package com.lqm.web.vo;


import com.alibaba.excel.annotation.ExcelProperty;

public class UserInfo {

    @ExcelProperty(index = 0,value = "账号")
    private String employeeAccount;

    @ExcelProperty(index = 1,value = "姓名")
    private String employeeName;

    @ExcelProperty(index = 2,value = "机构")
    private String institutionName;

    @ExcelProperty(index = 3,value = "部门")
    private String departmentName;

    @ExcelProperty(index =4,value = "涉密等级")
    private String secretLevel;

    @ExcelProperty(index = 5,value = "关联角色")
    private String roleName;

    @ExcelProperty(index = 6,value = "状态")
    private String status;

    public String getInstitutionName() {
        return institutionName;
    }

    public void setInstitutionName(String institutionName) {
        this.institutionName = institutionName;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getSecretLevel() {
        return secretLevel;
    }

    public void setSecretLevel(String secretLevel) {
        this.secretLevel = secretLevel;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "institutionName='" + institutionName + '\'' +
                ", departmentName='" + departmentName + '\'' +
                ", employeeName='" + employeeName + '\'' +
                ", secretLevel='" + secretLevel + '\'' +
                ", roleName='" + roleName + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
