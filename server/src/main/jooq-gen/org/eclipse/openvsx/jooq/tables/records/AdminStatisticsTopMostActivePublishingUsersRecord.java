/*
 * This file is generated by jOOQ.
 */
package org.eclipse.openvsx.jooq.tables.records;


import org.eclipse.openvsx.jooq.tables.AdminStatisticsTopMostActivePublishingUsers;
import org.jooq.Field;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AdminStatisticsTopMostActivePublishingUsersRecord extends TableRecordImpl<AdminStatisticsTopMostActivePublishingUsersRecord> implements Record3<Long, String, Integer> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>public.admin_statistics_top_most_active_publishing_users.admin_statistics_id</code>.
     */
    public void setAdminStatisticsId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.admin_statistics_top_most_active_publishing_users.admin_statistics_id</code>.
     */
    public Long getAdminStatisticsId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.admin_statistics_top_most_active_publishing_users.login_name</code>.
     */
    public void setLoginName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.admin_statistics_top_most_active_publishing_users.login_name</code>.
     */
    public String getLoginName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.admin_statistics_top_most_active_publishing_users.extension_version_count</code>.
     */
    public void setExtensionVersionCount(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.admin_statistics_top_most_active_publishing_users.extension_version_count</code>.
     */
    public Integer getExtensionVersionCount() {
        return (Integer) get(2);
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row3<Long, String, Integer> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    @Override
    public Row3<Long, String, Integer> valuesRow() {
        return (Row3) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return AdminStatisticsTopMostActivePublishingUsers.ADMIN_STATISTICS_TOP_MOST_ACTIVE_PUBLISHING_USERS.ADMIN_STATISTICS_ID;
    }

    @Override
    public Field<String> field2() {
        return AdminStatisticsTopMostActivePublishingUsers.ADMIN_STATISTICS_TOP_MOST_ACTIVE_PUBLISHING_USERS.LOGIN_NAME;
    }

    @Override
    public Field<Integer> field3() {
        return AdminStatisticsTopMostActivePublishingUsers.ADMIN_STATISTICS_TOP_MOST_ACTIVE_PUBLISHING_USERS.EXTENSION_VERSION_COUNT;
    }

    @Override
    public Long component1() {
        return getAdminStatisticsId();
    }

    @Override
    public String component2() {
        return getLoginName();
    }

    @Override
    public Integer component3() {
        return getExtensionVersionCount();
    }

    @Override
    public Long value1() {
        return getAdminStatisticsId();
    }

    @Override
    public String value2() {
        return getLoginName();
    }

    @Override
    public Integer value3() {
        return getExtensionVersionCount();
    }

    @Override
    public AdminStatisticsTopMostActivePublishingUsersRecord value1(Long value) {
        setAdminStatisticsId(value);
        return this;
    }

    @Override
    public AdminStatisticsTopMostActivePublishingUsersRecord value2(String value) {
        setLoginName(value);
        return this;
    }

    @Override
    public AdminStatisticsTopMostActivePublishingUsersRecord value3(Integer value) {
        setExtensionVersionCount(value);
        return this;
    }

    @Override
    public AdminStatisticsTopMostActivePublishingUsersRecord values(Long value1, String value2, Integer value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached AdminStatisticsTopMostActivePublishingUsersRecord
     */
    public AdminStatisticsTopMostActivePublishingUsersRecord() {
        super(AdminStatisticsTopMostActivePublishingUsers.ADMIN_STATISTICS_TOP_MOST_ACTIVE_PUBLISHING_USERS);
    }

    /**
     * Create a detached, initialised AdminStatisticsTopMostActivePublishingUsersRecord
     */
    public AdminStatisticsTopMostActivePublishingUsersRecord(Long adminStatisticsId, String loginName, Integer extensionVersionCount) {
        super(AdminStatisticsTopMostActivePublishingUsers.ADMIN_STATISTICS_TOP_MOST_ACTIVE_PUBLISHING_USERS);

        setAdminStatisticsId(adminStatisticsId);
        setLoginName(loginName);
        setExtensionVersionCount(extensionVersionCount);
    }
}
