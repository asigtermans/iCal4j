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
import net.fortuna.ical4j.model.TimeZone;

/**
 * $Id$
 * 
 * Created: [Apr 6, 2004]
 *
 * Defines a DTSTART iCalendar component property.
 * 
 * <pre>
 *     4.8.2.4 Date/Time Start
 *     
 *        Property Name: DTSTART
 *     
 *        Purpose: This property specifies when the calendar component begins.
 *     
 *        Value Type: The default value type is DATE-TIME. The time value MUST
 *        be one of the forms defined for the DATE-TIME value type. The value
 *        type can be set to a DATE value type.
 *     
 *        Property Parameters: Non-standard, value data type, time zone
 *        identifier property parameters can be specified on this property.
 *     
 *        Conformance: This property can be specified in the &quot;VEVENT&quot;, &quot;VTODO&quot;,
 *        &quot;VFREEBUSY&quot;, or &quot;VTIMEZONE&quot; calendar components.
 *     
 *        Description: Within the &quot;VEVENT&quot; calendar component, this property
 *        defines the start date and time for the event. The property is
 *        REQUIRED in &quot;VEVENT&quot; calendar components. Events can have a start
 *        date/time but no end date/time. In that case, the event does not take
 *        up any time.
 *     
 *        Within the &quot;VFREEBUSY&quot; calendar component, this property defines the
 *        start date and time for the free or busy time information. The time
 *        MUST be specified in UTC time.
 *     
 *        Within the &quot;VTIMEZONE&quot; calendar component, this property defines the
 *        effective start date and time for a time zone specification. This
 *        property is REQUIRED within each STANDARD and DAYLIGHT part included
 *        in &quot;VTIMEZONE&quot; calendar components and MUST be specified as a local
 *        DATE-TIME without the &quot;TZID&quot; property parameter.
 *     
 *        Format Definition: The property is defined by the following notation:
 *     
 *          dtstart    = &quot;DTSTART&quot; dtstparam &quot;:&quot; dtstval CRLF
 *     
 *          dtstparam  = *(
 *     
 *                     ; the following are optional,
 *                     ; but MUST NOT occur more than once
 *     
 *                     (&quot;;&quot; &quot;VALUE&quot; &quot;=&quot; (&quot;DATE-TIME&quot; / &quot;DATE&quot;)) /
 *                     (&quot;;&quot; tzidparam) /
 *     
 *                     ; the following is optional,
 *                     ; and MAY occur more than once
 *     
 *                       *(&quot;;&quot; xparam)
 *     
 *                     )
 *     
 *     
 *     
 *          dtstval    = date-time / date
 *          ;Value MUST match value type
 * </pre>
 * 
 * @author Ben Fortuna
 */
public class DtStart extends DtStartEnd {
	
	private static final long serialVersionUID = -5707097476081111815L;
	private static final String property = DTSTART;

    public DtStart() {
		super(property);
	}

	public DtStart(Date time, boolean utc) {
		super(property, time, utc);
	}

	public DtStart(Date aDate) {
		super(property, aDate);
	}

	public DtStart(ParameterList aList, Date aDate) {
		super(property, aList, aDate);
	}

	public DtStart(ParameterList aList, String aValue)
			throws ParseException {
		super(property, aList, aValue);
	}

	public DtStart(String value, TimeZone timezone)
			throws ParseException {
		super(property, value, timezone);
	}

	public DtStart(String aValue) throws ParseException {
		super(property, aValue);
	}

	public DtStart(TimeZone timezone) {
		super(property, timezone);
	}   
}
