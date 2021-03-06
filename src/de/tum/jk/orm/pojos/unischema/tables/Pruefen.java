/*
 * This file is generated by jOOQ.
 */
package de.tum.jk.orm.pojos.unischema.tables;


import de.tum.jk.orm.pojos.unischema.Indexes;
import de.tum.jk.orm.pojos.unischema.Keys;
import de.tum.jk.orm.pojos.unischema.Unischema;
import de.tum.jk.orm.pojos.unischema.tables.records.PruefenRecord;

import java.math.BigDecimal;
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
public class Pruefen extends TableImpl<PruefenRecord> {

    private static final long serialVersionUID = -730429641;

    /**
     * The reference instance of <code>unischema.pruefen</code>
     */
    public static final Pruefen PRUEFEN = new Pruefen();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PruefenRecord> getRecordType() {
        return PruefenRecord.class;
    }

    /**
     * The column <code>unischema.pruefen.MatrNr</code>.
     */
    public final TableField<PruefenRecord, Integer> MATRNR = createField("MatrNr", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>unischema.pruefen.VorlNr</code>.
     */
    public final TableField<PruefenRecord, Integer> VORLNR = createField("VorlNr", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>unischema.pruefen.PersNr</code>.
     */
    public final TableField<PruefenRecord, Integer> PERSNR = createField("PersNr", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>unischema.pruefen.Note</code>.
     */
    public final TableField<PruefenRecord, BigDecimal> NOTE = createField("Note", org.jooq.impl.SQLDataType.DECIMAL(2, 1), this, "");

    /**
     * Create a <code>unischema.pruefen</code> table reference
     */
    public Pruefen() {
        this(DSL.name("pruefen"), null);
    }

    /**
     * Create an aliased <code>unischema.pruefen</code> table reference
     */
    public Pruefen(String alias) {
        this(DSL.name(alias), PRUEFEN);
    }

    /**
     * Create an aliased <code>unischema.pruefen</code> table reference
     */
    public Pruefen(Name alias) {
        this(alias, PRUEFEN);
    }

    private Pruefen(Name alias, Table<PruefenRecord> aliased) {
        this(alias, aliased, null);
    }

    private Pruefen(Name alias, Table<PruefenRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Pruefen(Table<O> child, ForeignKey<O, PruefenRecord> key) {
        super(child, key, PRUEFEN);
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
        return Arrays.<Index>asList(Indexes.PRUEFEN_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<PruefenRecord> getPrimaryKey() {
        return Keys.KEY_PRUEFEN_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<PruefenRecord>> getKeys() {
        return Arrays.<UniqueKey<PruefenRecord>>asList(Keys.KEY_PRUEFEN_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Pruefen as(String alias) {
        return new Pruefen(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Pruefen as(Name alias) {
        return new Pruefen(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Pruefen rename(String name) {
        return new Pruefen(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Pruefen rename(Name name) {
        return new Pruefen(name, null);
    }
}
