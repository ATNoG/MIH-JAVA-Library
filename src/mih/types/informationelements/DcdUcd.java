//==============================================================================
// Brief   : DCD_UCD Data Type
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

public class DcdUcd
		extends
		Sequence<BaseId, Bandwidth, DuCtrFreq, Eirp, Gap, BurstProf, CdmaCodes, Sequence.ObjectNull, Sequence.ObjectNull, Sequence.ObjectNull, Sequence.ObjectNull>
		implements Serializeable {

	public DcdUcd(BaseId baseId, Bandwidth bandwidth, DuCtrFreq duCtrFreq, Eirp eirp, Gap gap, BurstProf burstProf, CdmaCodes cdmaCodes) {
		super(baseId, bandwidth, duCtrFreq, eirp, gap, burstProf, cdmaCodes);
	}

	public DcdUcd(DcdUcd value) {
		super(value.getBaseId(), value.getBandwidth(), value.getDuCtrFreq(), value.getEirp(), value.getGap(), value.getBurstProf(), value.getCdmaCodes());
	}

	public DcdUcd() {
		super(new BaseId(), new Bandwidth(), new DuCtrFreq(), new Eirp(), new Gap(), new BurstProf(), new CdmaCodes());
	}

	public BaseId getBaseId() {
		return getA();
	}

	public void setBaseId(BaseId baseId) {
		setA(baseId);
	}

	public Bandwidth getBandwidth() {
		return getB();
	}

	public void setBandwidth(Bandwidth bandwidth) {
		setB(bandwidth);
	}

	public DuCtrFreq getDuCtrFreq() {
		return getC();
	}

	public void setDuCtrFreq(DuCtrFreq duCtrFreq) {
		setC(duCtrFreq);
	}

	public Eirp getEirp() {
		return getD();
	}

	public void setEirp(Eirp eirp) {
		setD(eirp);
	}

	public Gap getGap() {
		return getE();
	}

	public void setGap(Gap gap) {
		setE(gap);
	}

	public BurstProf getBurstProf() {
		return getF();
	}

	public void setBurstProf(BurstProf burstProf) {
		setF(burstProf);
	}

	public CdmaCodes getCdmaCodes() {
		return getG();
	}

	public void setCdmaCodes(CdmaCodes cdmaCodes) {
		setG(cdmaCodes);
	}
}
