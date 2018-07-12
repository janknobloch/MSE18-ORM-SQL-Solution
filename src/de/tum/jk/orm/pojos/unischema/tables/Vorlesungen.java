/*
 * This file is generated by jOOQ.
 */
package de.tum.jk.orm.pojos.unischema.tables;


import de.tum.jk.orm.pojos.unischema.Indexes;
import de.tum.jk.orm.pojos.unischema.Keys;
import de.tum.jk.orm.pojos.unischema.Unischema;
import de.tum.jk.orm.pojos.unischema.tables.records.VorlesungenRecord;

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
public class Vorlesungen extends TableImpl<VorlesungenRecord> {

    private static final long serialVersionUID = 1766932227;

    /**
     * The reference instance of <code>unischema.Vorlesungen</code>
     */
    public static final Vorlesungen VORLESUNGEN = new Vorlesungen();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<VorlesungenRecord> getRecordType() {
        return VorlesungenRecord.class;
    }

    /**
     * The column <code>unischema.Vorlesungen.VorlNr</code>.
     */
    public final TableField<VorlesungenRecord, Integer> VORLNR = createField("VorlNr", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>unischema.Vorlesungen.Titel</code>.
     */
    public final TableField<VorlesungenRecord, String> TITEL = createField("Titel", org.jooq.impl.SQLDataType.VARCHAR(30), this, "");

    /**
     * The column <code>unischema.Vorlesungen.SWS</code>.
     */
    public final TableField<VorlesungenRecord, Integer> SWS = createField("SWS", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>unischema.Vorlesungen.gelesenVon</code>.
     */
    public final TableField<VorlesungenRecord, Integer> GELESENVON = createField("gelesenVon", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * Create a <code>unischema.Vorlesungen</code> table reference
     */
    public Vorlesungen() {
        this(DSL.name("Vorlesungen"), null);
    }

    /**
     * Create an aliased <code>unischema.Vorlesungen</code> table reference
     */
    public Vorlesungen(String alias) {
        this(DSL.name(alias), VORLESUNGEN);
    }

    /**
     * Create an aliased <code>unischema.Vorlesungen</code> table reference
     */
    public Vorlesungen(Name alias) {
        this(alias, VORLESUNGEN);
    }

    private Vorlesungen(Name alias, Table<VorlesungenRecord> aliased) {
        this(alias, aliased, null);
    }

    private Vorlesungen(Name alias, Table<VorlesungenRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Vorlesungen(Table<O> child, ForeignKey<O, VorlesungenRecord> key) {
        super(child, key, VORLESUNGEN);
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
        return Arrays.<Index>asList(Indexes.VORLESUNGEN_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<VorlesungenRecord> getPrimaryKey() {
        return Keys.KEY_VORLESUNGEN_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<VorlesungenRecord>> getKeys() {
        return Arrays.<UniqueKey<VorlesungenRecord>>asList(Keys.KEY_VORLESUNGEN_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Vorlesungen as(String alias) {
        return new Vorlesungen(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Vorlesungen as(Name alias) {
        return new Vorlesungen(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Vorlesungen rename(String name) {
        return new Vorlesungen(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Vorlesungen rename(Name name) {
        return new Vorlesungen(name, null);
    }
}
