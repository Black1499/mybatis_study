package com.lzx.generator.model;

public class EcsSupplierAdminUserWithBLOBs extends EcsSupplierAdminUser {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_supplier_admin_user.action_list
     *
     * @mbg.generated
     */
    private String actionList;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_supplier_admin_user.nav_list
     *
     * @mbg.generated
     */
    private String navList;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_supplier_admin_user.todolist
     *
     * @mbg.generated
     */
    private String todolist;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_supplier_admin_user.action_list
     *
     * @return the value of ecs_supplier_admin_user.action_list
     *
     * @mbg.generated
     */
    public String getActionList() {
        return actionList;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_supplier_admin_user.action_list
     *
     * @param actionList the value for ecs_supplier_admin_user.action_list
     *
     * @mbg.generated
     */
    public void setActionList(String actionList) {
        this.actionList = actionList == null ? null : actionList.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_supplier_admin_user.nav_list
     *
     * @return the value of ecs_supplier_admin_user.nav_list
     *
     * @mbg.generated
     */
    public String getNavList() {
        return navList;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_supplier_admin_user.nav_list
     *
     * @param navList the value for ecs_supplier_admin_user.nav_list
     *
     * @mbg.generated
     */
    public void setNavList(String navList) {
        this.navList = navList == null ? null : navList.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_supplier_admin_user.todolist
     *
     * @return the value of ecs_supplier_admin_user.todolist
     *
     * @mbg.generated
     */
    public String getTodolist() {
        return todolist;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_supplier_admin_user.todolist
     *
     * @param todolist the value for ecs_supplier_admin_user.todolist
     *
     * @mbg.generated
     */
    public void setTodolist(String todolist) {
        this.todolist = todolist == null ? null : todolist.trim();
    }
}