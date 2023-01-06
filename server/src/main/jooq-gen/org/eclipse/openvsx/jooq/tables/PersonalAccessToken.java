/*
 * This file is generated by jOOQ.
 */
package org.eclipse.openvsx.jooq.tables;


import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.eclipse.openvsx.jooq.Keys;
import org.eclipse.openvsx.jooq.Public;
import org.eclipse.openvsx.jooq.tables.records.PersonalAccessTokenRecord;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row7;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PersonalAccessToken extends TableImpl<PersonalAccessTokenRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public.personal_access_token</code>
     */
    public static final PersonalAccessToken PERSONAL_ACCESS_TOKEN = new PersonalAccessToken();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PersonalAccessTokenRecord> getRecordType() {
        return PersonalAccessTokenRecord.class;
    }

    /**
     * The column <code>public.personal_access_token.id</code>.
     */
    public final TableField<PersonalAccessTokenRecord, Long> ID = createField(DSL.name("id"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>public.personal_access_token.accessed_timestamp</code>.
     */
    public final TableField<PersonalAccessTokenRecord, LocalDateTime> ACCESSED_TIMESTAMP = createField(DSL.name("accessed_timestamp"), SQLDataType.LOCALDATETIME(6), this, "");

    /**
     * The column <code>public.personal_access_token.active</code>.
     */
    public final TableField<PersonalAccessTokenRecord, Boolean> ACTIVE = createField(DSL.name("active"), SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * The column <code>public.personal_access_token.created_timestamp</code>.
     */
    public final TableField<PersonalAccessTokenRecord, LocalDateTime> CREATED_TIMESTAMP = createField(DSL.name("created_timestamp"), SQLDataType.LOCALDATETIME(6), this, "");

    /**
     * The column <code>public.personal_access_token.description</code>.
     */
    public final TableField<PersonalAccessTokenRecord, String> DESCRIPTION = createField(DSL.name("description"), SQLDataType.VARCHAR(2048), this, "");

    /**
     * The column <code>public.personal_access_token.value</code>.
     */
    public final TableField<PersonalAccessTokenRecord, String> VALUE = createField(DSL.name("value"), SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>public.personal_access_token.user_data</code>.
     */
    public final TableField<PersonalAccessTokenRecord, Long> USER_DATA = createField(DSL.name("user_data"), SQLDataType.BIGINT, this, "");

    private PersonalAccessToken(Name alias, Table<PersonalAccessTokenRecord> aliased) {
        this(alias, aliased, null);
    }

    private PersonalAccessToken(Name alias, Table<PersonalAccessTokenRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>public.personal_access_token</code> table reference
     */
    public PersonalAccessToken(String alias) {
        this(DSL.name(alias), PERSONAL_ACCESS_TOKEN);
    }

    /**
     * Create an aliased <code>public.personal_access_token</code> table reference
     */
    public PersonalAccessToken(Name alias) {
        this(alias, PERSONAL_ACCESS_TOKEN);
    }

    /**
     * Create a <code>public.personal_access_token</code> table reference
     */
    public PersonalAccessToken() {
        this(DSL.name("personal_access_token"), null);
    }

    public <O extends Record> PersonalAccessToken(Table<O> child, ForeignKey<O, PersonalAccessTokenRecord> key) {
        super(child, key, PERSONAL_ACCESS_TOKEN);
    }

    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    @Override
    public UniqueKey<PersonalAccessTokenRecord> getPrimaryKey() {
        return Keys.PERSONAL_ACCESS_TOKEN_PKEY;
    }

    @Override
    public List<UniqueKey<PersonalAccessTokenRecord>> getKeys() {
        return Arrays.<UniqueKey<PersonalAccessTokenRecord>>asList(Keys.PERSONAL_ACCESS_TOKEN_PKEY, Keys.UKJEUD5MSSQBQKID58RD2K1INOF);
    }

    @Override
    public List<ForeignKey<PersonalAccessTokenRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<PersonalAccessTokenRecord, ?>>asList(Keys.PERSONAL_ACCESS_TOKEN__FKTQJVMHOIG3WTTJ6DL1IBCAJ3L);
    }

    private transient UserData _userData;

    public UserData userData() {
        if (_userData == null)
            _userData = new UserData(this, Keys.PERSONAL_ACCESS_TOKEN__FKTQJVMHOIG3WTTJ6DL1IBCAJ3L);

        return _userData;
    }

    @Override
    public PersonalAccessToken as(String alias) {
        return new PersonalAccessToken(DSL.name(alias), this);
    }

    @Override
    public PersonalAccessToken as(Name alias) {
        return new PersonalAccessToken(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public PersonalAccessToken rename(String name) {
        return new PersonalAccessToken(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PersonalAccessToken rename(Name name) {
        return new PersonalAccessToken(name, null);
    }

    // -------------------------------------------------------------------------
    // Row7 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row7<Long, LocalDateTime, Boolean, LocalDateTime, String, String, Long> fieldsRow() {
        return (Row7) super.fieldsRow();
    }
}
