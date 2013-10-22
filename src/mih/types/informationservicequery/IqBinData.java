//==============================================================================
// Brief   : IQ_BIN_DATA Data Type
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

package mih.types.informationservicequery;

import mih.types.Serializeable;
import mih.types.basic.Sequence;
import mih.types.informationservicequery.auxiliar.NullCurrPrefChoice;
import mih.types.informationservicequery.auxiliar.NullNetTypeIncChoice;
import mih.types.informationservicequery.auxiliar.NullNetwkIncChoice;
import mih.types.informationservicequery.auxiliar.NullQuerierLocChoice;
import mih.types.informationservicequery.auxiliar.NullRptLimitChoice;
import mih.types.informationservicequery.auxiliar.NullRptTemplChoice;

public class IqBinData
		extends
		Sequence<NullQuerierLocChoice, NullNetTypeIncChoice, NullNetwkIncChoice, NullRptTemplChoice, NullRptLimitChoice, NullCurrPrefChoice, Sequence.ObjectNull, Sequence.ObjectNull, Sequence.ObjectNull, Sequence.ObjectNull, Sequence.ObjectNull>
		implements Serializeable {

	public IqBinData(NullQuerierLocChoice querierLoc, NullNetTypeIncChoice netTypeInc, NullNetwkIncChoice netwkInc, NullRptTemplChoice rptTempl, NullRptLimitChoice rptLimit, NullCurrPrefChoice currPref) {
		super(querierLoc, netTypeInc, netwkInc, rptTempl, rptLimit, currPref);
	}

	public IqBinData(IqBinData value) {
		super(value.getQuerierLoc(), value.getNetTypeInc(), value.getNetwkInc(), value.getRptTempl(), value.getRptLimit(), value.getCurrPref());
	}

	public IqBinData() {
		super(new NullQuerierLocChoice(), new NullNetTypeIncChoice(), new NullNetwkIncChoice(), new NullRptTemplChoice(), new NullRptLimitChoice(), new NullCurrPrefChoice());
	}

	public NullQuerierLocChoice getQuerierLoc() {
		return getA();
	}

	public void setQuerierLoc(NullQuerierLocChoice querierLoc) {
		setA(querierLoc);
	}

	public NullNetTypeIncChoice getNetTypeInc() {
		return getB();
	}

	public void setNetTypeInc(NullNetTypeIncChoice netTypeInc) {
		setB(netTypeInc);
	}

	public NullNetwkIncChoice getNetwkInc() {
		return getC();
	}

	public void setNetwkInc(NullNetwkIncChoice netwkInc) {
		setC(netwkInc);
	}

	public NullRptTemplChoice getRptTempl() {
		return getD();
	}

	public void setRptTempl(NullRptTemplChoice rptTempl) {
		setD(rptTempl);
	}

	public NullRptLimitChoice getRptLimit() {
		return getE();
	}

	public void setRptLimit(NullRptLimitChoice rptLimit) {
		setE(rptLimit);
	}

	public NullCurrPrefChoice getCurrPref() {
		return getF();
	}

	public void setCurrPref(NullCurrPrefChoice currPref) {
		setF(currPref);
	}
}
