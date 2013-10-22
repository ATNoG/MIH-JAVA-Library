//==============================================================================
// Brief   : PARAMETERS Data Type
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

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

import mih.types.Serializeable;
import mih.types.basic.UnsignedInteger8;

public class Parameters implements Serializeable {

	public Parameters(DcdUcd value) {
		selector = new UnsignedInteger8(0);
		object = value;
	}

	public Parameters(Sib value) {
		selector = new UnsignedInteger8(1);
		object = value;
	}

	public Parameters(SysParams value) {
		selector = new UnsignedInteger8(2);
		object = value;
	}

	public Parameters(Parameters value) {
		selector = value.selector;
		object = value.object;
	}

	public Parameters() {
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
			((DcdUcd)object).toBytes(stream);
			break;

		case 1:
			((Sib)object).toBytes(stream);
			break;

		case 2:
			((SysParams)object).toBytes(stream);
			break;
		}
	}

	public void fromBytes(ByteArrayInputStream stream) throws Exception {
		selector.fromBytes(stream);

		switch(selector.getValue()) {
		case 0:
			object = new DcdUcd();
			((DcdUcd)object).fromBytes(stream);
			break;

		case 1:
			object = new Sib();
			((Sib)object).fromBytes(stream);
			break;

		case 2:
			object = new SysParams();
			((SysParams)object).fromBytes(stream);
			break;
		}
	}

	UnsignedInteger8 selector;
	Object object;
}