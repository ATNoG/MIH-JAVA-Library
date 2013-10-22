//==============================================================================
// Brief   : QOS_LIST Data Type
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

package mih.types.qos;

import mih.types.Serializeable;
import mih.types.basic.Sequence;
import mih.types.qos.auxiliar.ListAvgPkTxDelay;
import mih.types.qos.auxiliar.ListMaxPkTxDelay;
import mih.types.qos.auxiliar.ListMinPkTxDelay;
import mih.types.qos.auxiliar.ListPkDelayJitter;
import mih.types.qos.auxiliar.ListPkLossRate;

public class QosList
		extends
		Sequence<NumCosTypes, ListMinPkTxDelay, ListAvgPkTxDelay, ListMaxPkTxDelay, ListPkDelayJitter, ListPkLossRate, Sequence.ObjectNull, Sequence.ObjectNull, Sequence.ObjectNull, Sequence.ObjectNull, Sequence.ObjectNull>
		implements Serializeable {

	public QosList(NumCosTypes numCosTypes, ListMinPkTxDelay listMinPkTxDelay, ListAvgPkTxDelay listAvgPkTxDelay, ListMaxPkTxDelay listMaxPkTxDelay, ListPkDelayJitter listPkDelayJitter, ListPkLossRate listPkLossRate) {
		super(numCosTypes, listMinPkTxDelay, listAvgPkTxDelay, listMaxPkTxDelay, listPkDelayJitter, listPkLossRate);
	}

	public QosList(QosList value) {
		super(value.getNumCosTypes(), value.getListMinPkTxDelay(), value.getListAvgPkTxDelay(), value.getListMaxPkTxDelay(), value.getListPkDelayJitter(), value.getListPkLossRate());
	}

	public QosList() {
		super(new NumCosTypes(), new ListMinPkTxDelay(), new ListAvgPkTxDelay(), new ListMaxPkTxDelay(), new ListPkDelayJitter(), new ListPkLossRate());
	}

	public NumCosTypes getNumCosTypes() {
		return getA();
	}

	public void setNumCosTypes(NumCosTypes type) {
		setA(type);
	}

	public ListMinPkTxDelay getListMinPkTxDelay() {
		return getB();
	}

	public void setListMinPkTxDelay(ListMinPkTxDelay listMinPkTxDelay) {
		setB(listMinPkTxDelay);
	}

	public ListAvgPkTxDelay getListAvgPkTxDelay() {
		return getC();
	}

	public void setListAvgPkTxDelay(ListAvgPkTxDelay listAvgPkTxDelay) {
		setC(listAvgPkTxDelay);
	}

	public ListMaxPkTxDelay getListMaxPkTxDelay() {
		return getD();
	}

	public void setListMaxPkTxDelay(ListMaxPkTxDelay listMaxPkTxDelay) {
		setD(listMaxPkTxDelay);
	}

	public ListPkDelayJitter getListPkDelayJitter() {
		return getE();
	}

	public void setListPkDelayJitter(ListPkDelayJitter listPkDelayJitter) {
		setE(listPkDelayJitter);
	}

	public ListPkLossRate getListPkLossRate() {
		return getF();
	}

	public void setListPkLossRate(ListPkLossRate listPkLossRate) {
		setF(listPkLossRate);
	}
}
