/*
 * This file is generated by jOOQ.
 */
package de.tum.jk.orm.pojos.unischema.tables.records;


import de.tum.jk.orm.pojos.unischema.tables.Assistenten;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;


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
public class AssistentenRecord extends UpdatableRecordImpl<AssistentenRecord> implements Record4<Integer, String, String, Integer> {

    private static final long serialVersionUID = -519060282;

    /**
     * Setter for <code>unischema.Assistenten.PersNr</code>.
     */
    public void setPersnr(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>unischema.Assistenten.PersNr</code>.
     */
    public Integer getPersnr() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>unischema.Assistenten.Name</code>.
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>unischema.Assistenten.Name</code>.
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>unischema.Assistenten.Fachgebiet</code>.
     */
    public void setFachgebiet(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>unischema.Assistenten.Fachgebiet</code>.
     */
    public String getFachgebiet() {
        return (String) get(2);
    }

    /**
     * Setter for <code>unischema.Assistenten.Boss</code>.
     */
    public void setBoss(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>unischema.Assistenten.Boss</code>.
     */
    public Integer getBoss() {
        return (Integer) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, String, String, Integer> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, String, String, Integer> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Assistenten.ASSISTENTEN.PERSNR;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Assistenten.ASSISTENTEN.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Assistenten.ASSISTENTEN.FACHGEBIET;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return Assistenten.ASSISTENTEN.BOSS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getPersnr();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getFachgebiet();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component4() {
        return getBoss();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getPersnr();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getFachgebiet();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getBoss();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AssistentenRecord value1(Integer value) {
        setPersnr(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AssistentenRecord value2(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AssistentenRecord value3(String value) {
        setFachgebiet(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AssistentenRecord value4(Integer value) {
        setBoss(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AssistentenRecord values(Integer value1, String value2, String value3, Integer value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached AssistentenRecord
     */
    public AssistentenRecord() {
        super(Assistenten.ASSISTENTEN);
    }

    /**
     * Create a detached, initialised AssistentenRecord
     */
    public AssistentenRecord(Integer persnr, String name, String fachgebiet, Integer boss) {
        super(Assistenten.ASSISTENTEN);

        set(0, persnr);
        set(1, name);
        set(2, fachgebiet);
        set(3, boss);
    }
}
