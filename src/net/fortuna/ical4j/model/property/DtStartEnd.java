/**
 * Copyright (c) 2012, Ben Fortuna
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 *  o Redistributions of source code must retain the above copyright
 * notice, this list of conditions and the following disclaimer.
 *
 *  o Redistributions in binary form must reproduce the above copyright
 * notice, this list of conditions and the following disclaimer in the
 * documentation and/or other materials provided with the distribution.
 *
 *  o Neither the name of Ben Fortuna nor the names of any other contributors
 * may be used to endorse or promote products derived from this software
 * without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
 * "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
 * LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR
 * A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
 * PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
 * LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package net.fortuna.ical4j.model.property;

import java.text.ParseException;

import net.fortuna.ical4j.model.Date;
import net.fortuna.ical4j.model.ParameterList;
import net.fortuna.ical4j.model.PropertyFactoryImpl;
import net.fortuna.ical4j.model.TimeZone;

/**
 * Abstract class to implement code that is both in DtStart as well as in DtEnd
 */
public class DtStartEnd extends DateProperty {

    private static final long serialVersionUID = -5707097476081111815L;

    /**
     * Default constructor. The time value is initialised to the time of instantiation.
     */
    public DtStartEnd(String property) {
        super(property, PropertyFactoryImpl.getInstance());
    }

    /**
     * Creates a new DTSTART property initialised with the specified timezone.
     * @param timezone initial timezone
     */
    public DtStartEnd(String property, TimeZone timezone) {
        super(property, timezone, PropertyFactoryImpl.getInstance());
    }

    /**
     * @param aValue a value string for this component
     * @throws ParseException where the specified value string is not a valid date-time/date representation
     */
    public DtStartEnd(String property, final String aValue) throws ParseException {
        super(property, PropertyFactoryImpl.getInstance());
        setValue(aValue);
    }

    /**
     * Creates a new DTSTART property initialised with the specified timezone and value.
     * @param value a string representation of a DTSTART value
     * @param timezone initial timezone
     * @throws ParseException where the specified value is not a valid string
     * representation
     */
    public DtStartEnd(String property, String value, TimeZone timezone) throws ParseException {
        super(property, timezone, PropertyFactoryImpl.getInstance());
        setValue(value);
    }

    /**
     * @param aList a list of parameters for this component
     * @param aValue a value string for this component
     * @throws ParseException where the specified value string is not a valid date-time/date representation
     */
    public DtStartEnd(String property, final ParameterList aList, final String aValue)
            throws ParseException {
        super(property, aList, PropertyFactoryImpl.getInstance());
        setValue(aValue);
    }

    /**
     * Constructor. Date or Date-Time format is determined based on the presence of a VALUE parameter.
     * @param aDate a date
     */
    public DtStartEnd(String property, final Date aDate) {
        super(property, PropertyFactoryImpl.getInstance());
        setDate(aDate);
    }

    /**
     * Constructs a new DtStart with the specified time.
     * @param time the time of the DtStart
     * @param utc specifies whether time is UTC
     */
    public DtStartEnd(String property, final Date time, final boolean utc) {
        super(property, PropertyFactoryImpl.getInstance());
        setDate(time);
        setUtc(utc);
    }

    /**
     * Constructor. Date or Date-Time format is determined based on the presence of a VALUE parameter.
     * @param aList a list of parameters for this component
     * @param aDate a date
     */
    public DtStartEnd(String property, final ParameterList aList, final Date aDate) {
        super(property, aList, PropertyFactoryImpl.getInstance());
        setDate(aDate);
    }

}
