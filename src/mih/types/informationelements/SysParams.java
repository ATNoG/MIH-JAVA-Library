//==============================================================================
// Brief   : SYS_PARAMS Data Type
// Authors : Carlos Guimarães <cguimaraes@av.it.pt>
//------------------------------------------------------------------------------
// ODTONE - Open Dot Twenty One
//
// Copyright (C) 2013 Universidade Aveiro
// Copyright (C) 2013 Instituto de Telecomunicações - Pólo Aveiro
//
// This file is part of MIH-JAVA-Library.
//
// MIH-JAVA-Library is free software: you can redistribute it and/or modify
// it under the terms of the GNU Lesser General Public License as published by
// the Free Software Foundation, either version 2.1 of the License, or
// (at your option) any later version.
//
// MIH-JAVA-Library is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
// GNU Lesser General Public License for more details.
//
// You should have received a copy of the GNU Lesser General Public License
// along with MIH-JAVA-Library. If not, write to the Free Software
// Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA
//==============================================================================

package mih.types.informationelements;

import mih.types.Serializeable;
import mih.types.basic.Sequence;

public class SysParams
		extends
		Sequence<BaseId, PilotPn, FreqId, BandClass, Sequence.ObjectNull, Sequence.ObjectNull, Sequence.ObjectNull, Sequence.ObjectNull, Sequence.ObjectNull, Sequence.ObjectNull, Sequence.ObjectNull>
		implements Serializeable {

	public SysParams(BaseId baseId, PilotPn pilotPn, FreqId freqId, BandClass bandClass) {
		super(baseId, pilotPn, freqId, bandClass);
	}

	public SysParams(SysParams value) {
		super(value.getBaseId(), value.getPilotPn(), value.getFreqId(), value.getBandClass());
	}

	public SysParams() {
		super(new BaseId(), new PilotPn(), new FreqId(), new BandClass());
	}

	public BaseId getBaseId() {
		return getA();
	}

	public void setBaseId(BaseId baseId) {
		setA(baseId);
	}

	public PilotPn getPilotPn() {
		return getB();
	}

	public void setPilotPn(PilotPn pilotPn) {
		setB(pilotPn);
	}

	public FreqId getFreqId() {
		return getC();
	}

	public void setFreqId(FreqId freqId) {
		setC(freqId);
	}

	public BandClass getBandClass() {
		return getD();
	}

	public void setBandClass(BandClass bandClass) {
		setD(bandClass);
	}
}
