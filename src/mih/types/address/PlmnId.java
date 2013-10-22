//==============================================================================
// Brief   : PLMN_ID Data Type
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

package mih.types.address;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

import mih.types.Serializeable;
import mih.types.basic.UnsignedInteger8;

public class PlmnId implements Serializeable {

	public PlmnId(int[] value) {
		this.value = new UnsignedInteger8[3];

		for(int i = 0; i < value.length; ++i)
			this.value[i] = new UnsignedInteger8(value[i]);
	}

	public PlmnId(PlmnId value) {
		this.value = value.value;
	}

	public PlmnId() {
		this.value = new UnsignedInteger8[3];

		for(int i = 0; i < value.length; ++i)
			this.value[i] = new UnsignedInteger8(0);
	}

	public UnsignedInteger8[] getValue() {
		return value;
	}

	public void setValue(int[] value) {
		for(int i = 0; i < value.length; ++i)
			this.value[i] = new UnsignedInteger8(value[i]);
	}

	public void toBytes(ByteArrayOutputStream stream) {
		for(int i = value.length - 1; i >= 0; --i)
			value[i].toBytes(stream);
	}

	public void fromBytes(ByteArrayInputStream stream) {
		for(int i = value.length - 1; i >= 0; --i) {
			value[i] = new UnsignedInteger8(0);
			value[i].fromBytes(stream);
		}
	}

	private UnsignedInteger8[] value;
}