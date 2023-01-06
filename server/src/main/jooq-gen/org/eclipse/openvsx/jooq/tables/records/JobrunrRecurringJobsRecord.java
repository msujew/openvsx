/*
 * This file is generated by jOOQ.
 */
package org.eclipse.openvsx.jooq.tables.records;


import org.eclipse.openvsx.jooq.tables.JobrunrRecurringJobs;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JobrunrRecurringJobsRecord extends UpdatableRecordImpl<JobrunrRecurringJobsRecord> implements Record3<String, Integer, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>public.jobrunr_recurring_jobs.id</code>.
     */
    public void setId(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.jobrunr_recurring_jobs.id</code>.
     */
    public String getId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>public.jobrunr_recurring_jobs.version</code>.
     */
    public void setVersion(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.jobrunr_recurring_jobs.version</code>.
     */
    public Integer getVersion() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>public.jobrunr_recurring_jobs.jobasjson</code>.
     */
    public void setJobasjson(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.jobrunr_recurring_jobs.jobasjson</code>.
     */
    public String getJobasjson() {
        return (String) get(2);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row3<String, Integer, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    @Override
    public Row3<String, Integer, String> valuesRow() {
        return (Row3) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return JobrunrRecurringJobs.JOBRUNR_RECURRING_JOBS.ID;
    }

    @Override
    public Field<Integer> field2() {
        return JobrunrRecurringJobs.JOBRUNR_RECURRING_JOBS.VERSION;
    }

    @Override
    public Field<String> field3() {
        return JobrunrRecurringJobs.JOBRUNR_RECURRING_JOBS.JOBASJSON;
    }

    @Override
    public String component1() {
        return getId();
    }

    @Override
    public Integer component2() {
        return getVersion();
    }

    @Override
    public String component3() {
        return getJobasjson();
    }

    @Override
    public String value1() {
        return getId();
    }

    @Override
    public Integer value2() {
        return getVersion();
    }

    @Override
    public String value3() {
        return getJobasjson();
    }

    @Override
    public JobrunrRecurringJobsRecord value1(String value) {
        setId(value);
        return this;
    }

    @Override
    public JobrunrRecurringJobsRecord value2(Integer value) {
        setVersion(value);
        return this;
    }

    @Override
    public JobrunrRecurringJobsRecord value3(String value) {
        setJobasjson(value);
        return this;
    }

    @Override
    public JobrunrRecurringJobsRecord values(String value1, Integer value2, String value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached JobrunrRecurringJobsRecord
     */
    public JobrunrRecurringJobsRecord() {
        super(JobrunrRecurringJobs.JOBRUNR_RECURRING_JOBS);
    }

    /**
     * Create a detached, initialised JobrunrRecurringJobsRecord
     */
    public JobrunrRecurringJobsRecord(String id, Integer version, String jobasjson) {
        super(JobrunrRecurringJobs.JOBRUNR_RECURRING_JOBS);

        setId(id);
        setVersion(version);
        setJobasjson(jobasjson);
    }
}
