//==============================================================================
// Brief   : OCTET_STRING Data Type
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

package mih.types.basic;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

import mih.types.Serializeable;

public class OctetString implements Serializeable {

	public OctetString() {
		octet = "";
	}

	public OctetString(String octet) {
		this.octet = octet;
	}

	public OctetString(OctetString octet) {
		this.octet = octet.octet;
	}

	public String getValue() {
		return octet;
	}

	public void setValue(String octet) {
		this.octet = octet;
	}

	public void toBytes(ByteArrayOutputStream stream) {
		stream.write(octet.length());

		for (int i = 0; i < octet.length(); ++i) {
			stream.write(octet.charAt(i));
		}
	}

	public void fromBytes(ByteArrayInputStream stream) {
		int size = stream.read();

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < size; ++i) {
			sb.append((char)stream.read());
		}

		octet = sb.toString();
	}

	private String octet;

}