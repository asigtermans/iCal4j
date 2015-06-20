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
 * Defines a DTEND iCalendar component property.
 * 
 * <pre>
 *     4.8.2.2 Date/Time End
 *     
 *        Property Name: DTEND
 *     
 *        Purpose: This property specifies the date and time that a calendar
 *        component ends.
 *     
 *        Value Type: The default value type is DATE-TIME. The value type can
 *        be set to a DATE value type.
 *     
 *        Property Parameters: Non-standard, value data type, time zone
 *        identifier property parameters can be specified on this property.
 *     
 *        Conformance: This property can be specified in &quot;VEVENT&quot; or
 *        &quot;VFREEBUSY&quot; calendar components.
 *     
 *        Description: Within the &quot;VEVENT&quot; calendar component, this property
 *        defines the date and time by which the event ends. The value MUST be
 *        later in time than the value of the &quot;DtEnd&quot; property.
 *     
 *        Within the &quot;VFREEBUSY&quot; calendar component, this property defines the
 *        end date and time for the free or busy time information. The time
 *        MUST be specified in the UTC time format. The value MUST be later in
 *        time than the value of the &quot;DtEnd&quot; property.
 *     
 *        Format Definition: The property is defined by the following notation:
 *     
 *          dtend      = &quot;DTEND&quot; dtendparam&quot;:&quot; dtendval CRLF
 *     
 *          dtendparam = *(
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
 *                     (&quot;;&quot; xparam)
 *     
 *                     )
 *     
 *     
 *     
 *          dtendval   = date-time / date
 *          ;Value MUST match value type
 * </pre>
 * 
 * Examples:
 * 
 * <pre>
 *      // construct an end date from a start date and a duration..
 *      DtEnd start = ...
 *      Dur oneWeek = new Dur(&quot;1W&quot;);
 *      DtEnd end = new DtEnd(oneWeek.getTime(start.getDate());
 * </pre>
 * 
 * @author Ben Fortuna
 */
public class DtEnd extends DtStartEnd {
	
	private static final long serialVersionUID = -5707097476081111815L;
	private static final String property = DTEND;

    public DtEnd() {
		super(property);
	}

	public DtEnd(Date time, boolean utc) {
		super(property, time, utc);
	}

	public DtEnd(Date aDate) {
		super(property, aDate);
	}

	public DtEnd(ParameterList aList, Date aDate) {
		super(property, aList, aDate);
	}

	public DtEnd(ParameterList aList, String aValue)
			throws ParseException {
		super(property, aList, aValue);
	}

	public DtEnd(String value, TimeZone timezone)
			throws ParseException {
		super(property, value, timezone);
	}

	public DtEnd(String aValue) throws ParseException {
		super(property, aValue);
	}

	public DtEnd(TimeZone timezone) {
		super(property, timezone);
	}   
}
