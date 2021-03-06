//==============================================================================
// Brief   : IP_ADDR Data Type
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

public class IpAddr extends TransportAddress implements Serializeable {

	public enum IpAddrEnum {
		None(0),
		IPv4(1),
		IPv6(2);

		 private IpAddrEnum(int id) {
			 this.id = id;
		 }

		 public final int id;
	}


	public IpAddr(IpAddrEnum type, OctetString address) {
		super(new UnsignedInteger16(type.id), address);
	}

	public IpAddr(IpAddr address) {
		super(address);
	}

	public IpAddr() {
		super(new UnsignedInteger16(0), new OctetString(""));
	}
}
