//==============================================================================
// Brief   : MAC_ADDR Data Type
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

import mih.types.Serializeable;
import mih.types.basic.OctetString;
import mih.types.basic.UnsignedInteger16;

public class MacAddr extends TransportAddress implements Serializeable {

	public MacAddr(OctetString address) {
		super(new UnsignedInteger16(6), new OctetString(""));
		setAddress(address);
	}

	public MacAddr(MacAddr address) {
		super(address);
	}

	public MacAddr() {
		super(new UnsignedInteger16(6), new OctetString(""));
	}

	public OctetString getAddress() {
		StringBuilder tmp = new StringBuilder();

		for(int i = 0; i < getB().getValue().toString().length(); ++i) {
			tmp.append(String.format("%02X", Integer.valueOf(getB().getValue().toString().charAt(i))));
			tmp.append(":");
		}
		tmp.deleteCharAt(tmp.length() - 1);

		return new OctetString(tmp.toString());
	}

	public void setAddress(OctetString address) {
		String[] substring = address.getValue().split(":");

		byte[] tmp = new byte[substring.length];

		for(int i = 0; i < substring.length; ++i) {
			tmp[i] = (byte) Integer.parseInt(substring[i], 16);
		}

		setB(new OctetString(new String(tmp)));
	}
}
