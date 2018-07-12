/*
 * This file is generated by jOOQ.
 */
package de.tum.jk.orm.pojos.unischema.tables.records;


import de.tum.jk.orm.pojos.unischema.tables.Professoren;

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
public class ProfessorenRecord extends UpdatableRecordImpl<ProfessorenRecord> implements Record4<Integer, String, String, Integer> {

    private static final long serialVersionUID = -1370651108;

    /**
     * Setter for <code>unischema.Professoren.PersNr</code>.
     */
    public void setPersnr(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>unischema.Professoren.PersNr</code>.
     */
    public Integer getPersnr() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>unischema.Professoren.Name</code>.
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>unischema.Professoren.Name</code>.
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>unischema.Professoren.Rang</code>.
     */
    public void setRang(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>unischema.Professoren.Rang</code>.
     */
    public String getRang() {
        return (String) get(2);
    }

    /**
     * Setter for <code>unischema.Professoren.Raum</code>.
     */
    public void setRaum(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>unischema.Professoren.Raum</code>.
     */
    public Integer getRaum() {
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
        return Professoren.PROFESSOREN.PERSNR;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Professoren.PROFESSOREN.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Professoren.PROFESSOREN.RANG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return Professoren.PROFESSOREN.RAUM;
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
        return getRang();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component4() {
        return getRaum();
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
        return getRang();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getRaum();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProfessorenRecord value1(Integer value) {
        setPersnr(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProfessorenRecord value2(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProfessorenRecord value3(String value) {
        setRang(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProfessorenRecord value4(Integer value) {
        setRaum(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProfessorenRecord values(Integer value1, String value2, String value3, Integer value4) {
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
     * Create a detached ProfessorenRecord
     */
    public ProfessorenRecord() {
        super(Professoren.PROFESSOREN);
    }

    /**
     * Create a detached, initialised ProfessorenRecord
     */
    public ProfessorenRecord(Integer persnr, String name, String rang, Integer raum) {
        super(Professoren.PROFESSOREN);

        set(0, persnr);
        set(1, name);
        set(2, rang);
        set(3, raum);
    }
}
