/*
 * This file is generated by jOOQ.
 */
package de.tum.jk.orm.pojos.unischema.tables;


import de.tum.jk.orm.pojos.unischema.Indexes;
import de.tum.jk.orm.pojos.unischema.Keys;
import de.tum.jk.orm.pojos.unischema.Unischema;
import de.tum.jk.orm.pojos.unischema.tables.records.HoerenRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.2"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Hoeren extends TableImpl<HoerenRecord> {

    private static final long serialVersionUID = -24397548;

    /**
     * The reference instance of <code>unischema.hoeren</code>
     */
    public static final Hoeren HOEREN = new Hoeren();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<HoerenRecord> getRecordType() {
        return HoerenRecord.class;
    }

    /**
     * The column <code>unischema.hoeren.MatrNr</code>.
     */
    public final TableField<HoerenRecord, Integer> MATRNR = createField("MatrNr", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>unischema.hoeren.VorlNr</code>.
     */
    public final TableField<HoerenRecord, Integer> VORLNR = createField("VorlNr", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * Create a <code>unischema.hoeren</code> table reference
     */
    public Hoeren() {
        this(DSL.name("hoeren"), null);
    }

    /**
     * Create an aliased <code>unischema.hoeren</code> table reference
     */
    public Hoeren(String alias) {
        this(DSL.name(alias), HOEREN);
    }

    /**
     * Create an aliased <code>unischema.hoeren</code> table reference
     */
    public Hoeren(Name alias) {
        this(alias, HOEREN);
    }

    private Hoeren(Name alias, Table<HoerenRecord> aliased) {
        this(alias, aliased, null);
    }

    private Hoeren(Name alias, Table<HoerenRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Hoeren(Table<O> child, ForeignKey<O, HoerenRecord> key) {
        super(child, key, HOEREN);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Unischema.UNISCHEMA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.HOEREN_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<HoerenRecord> getPrimaryKey() {
        return Keys.KEY_HOEREN_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<HoerenRecord>> getKeys() {
        return Arrays.<UniqueKey<HoerenRecord>>asList(Keys.KEY_HOEREN_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Hoeren as(String alias) {
        return new Hoeren(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Hoeren as(Name alias) {
        return new Hoeren(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Hoeren rename(String name) {
        return new Hoeren(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Hoeren rename(Name name) {
        return new Hoeren(name, null);
    }
}
