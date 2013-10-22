//==============================================================================
// Brief   : NET_TYPE_INC Data Type
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
import mih.types.basic.Bitmap;

public class NetTypeInc extends Bitmap implements Serializeable {

	public enum NetTypeIncEnum {
		 Wireless_GSM(0),
		 Wireless_GPRS(1),
		 Wireless_EDGE(2),
		 IEEE8023(3),
		 Wireless_Other(4),
		 Wireless_IEEE80211(5),
		 Wireless_CDMA2000(6),
		 Wireless_UMTS(7),
		 Wireless_CDMA2000_HRPD(8),
		 Wireless_IEEE80216(9),
		 Wireless_IEEE80220(10),
		 Wireless_IEEE80222(11);

		 private NetTypeIncEnum(int id) {
			 this.id = id;
		 }

		 public final int id;
	}

	public NetTypeInc(NetTypeInc value) {
		super(value);
	}

	public NetTypeInc() {
		super(64);
	}
}