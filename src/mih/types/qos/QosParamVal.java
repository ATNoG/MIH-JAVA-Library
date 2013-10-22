//==============================================================================
// Brief   : QOS_PARAM_VAL Data Type
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

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

import mih.types.Serializeable;
import mih.types.basic.UnsignedInteger8;
import mih.types.qos.auxiliar.ListAvgPkTxDelay;
import mih.types.qos.auxiliar.ListMaxPkTxDelay;
import mih.types.qos.auxiliar.ListMinPkTxDelay;
import mih.types.qos.auxiliar.ListPkDelayJitter;
import mih.types.qos.auxiliar.ListPkLossRate;

public class QosParamVal implements Serializeable {

	public QosParamVal(NumCosTypes numCosTypes) {
		selector = new UnsignedInteger8(0);
		object = numCosTypes;
	}

	public QosParamVal(ListMinPkTxDelay listMinPkTxDelay) {
		selector = new UnsignedInteger8(1);
		object = listMinPkTxDelay;
	}

	public QosParamVal(ListAvgPkTxDelay listAvgPkTxDelay) {
		selector = new UnsignedInteger8(2);
		object = listAvgPkTxDelay;
	}

	public QosParamVal(ListMaxPkTxDelay linkMaxPkTxDelay) {
		selector = new UnsignedInteger8(3);
		object = linkMaxPkTxDelay;
	}

	public QosParamVal(ListPkDelayJitter listPkDelayJitter) {
		selector = new UnsignedInteger8(4);
		object = listPkDelayJitter;
	}

	public QosParamVal(ListPkLossRate listPkLossRate) {
		selector = new UnsignedInteger8(5);
		object = listPkLossRate;
	}

	public QosParamVal(QosParamVal value) {
		this.selector = value.selector;
		this.object = value.object;
	}

	public QosParamVal() {
		selector = new UnsignedInteger8(0);
		object = new Object();
	}

	public UnsignedInteger8 getSelector() {
		return selector;
	}

	public void setSelector(UnsignedInteger8 selector) {
		this.selector = selector;
	}

	public Object getObject() {
		return object;
	}

	public void setObject(Object object) {
		this.object = object;
	}

	public void toBytes(ByteArrayOutputStream stream) throws Exception {
		selector.toBytes(stream);

		switch(selector.getValue()) {
		case 0:
			((NumCosTypes)object).toBytes(stream);
			break;

		case 1:
			((ListMinPkTxDelay)object).toBytes(stream);
			break;

		case 2:
			((ListAvgPkTxDelay)object).toBytes(stream);
			break;

		case 3:
			((ListMaxPkTxDelay)object).toBytes(stream);
			break;

		case 4:
			((ListPkDelayJitter)object).toBytes(stream);
			break;

		case 5:
			((ListPkLossRate)object).toBytes(stream);
			break;
		}
	}

	public void fromBytes(ByteArrayInputStream stream) throws Exception {
		selector.fromBytes(stream);

		switch(selector.getValue()) {
		case 0:
			object = new NumCosTypes();
			((NumCosTypes)object).fromBytes(stream);
			break;

		case 1:
			object = new ListMinPkTxDelay();
			((ListMinPkTxDelay)object).fromBytes(stream);
			break;

		case 2:
			object = new ListAvgPkTxDelay();
			((ListAvgPkTxDelay)object).fromBytes(stream);
			break;

		case 3:
			object = new ListMaxPkTxDelay();
			((ListMaxPkTxDelay)object).fromBytes(stream);
			break;

		case 4:
			object = new ListPkDelayJitter();
			((ListPkDelayJitter)object).fromBytes(stream);
			break;

		case 5:
			object = new ListPkLossRate();
			((ListPkLossRate)object).fromBytes(stream);
			break;
		}
	}

	UnsignedInteger8 selector;
	Object object;
}