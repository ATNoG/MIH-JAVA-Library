//==============================================================================
// Brief   : SUBTYPE Data Type
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
import mih.types.basic.Bitmap;

public class Subtype extends Bitmap implements Serializeable {

	public enum SubtypeEnum {
		 EthernetIEEE8023_10Mb(0),
		 EthernetIEEE8023_100Mb(1),
		 EthernetIEEE8023_1000Mb(2),
		 WirelessIEEE80211_2_4GHz(0),
		 WirelessIEEE80211_5GHz(1),
		 WirelessIEEE80211_4_9GHz(2),
		 WirelessIEEE80211_3_65GHz(3),
		 WirelessIEEE80211_316THz(4),
		 WirelessUMTS_Rel99(0),
		 WirelessUMTS_Rel4(1),
		 WirelessUMTS_Rel5(2),
		 WirelessUMTS_Rel6(3),
		 WirelessUMTS_Rel7(4),
		 WirelessUMTS_Rel8(5),
		 WirelessCDMA2000_HRPD_Rev0(0),
		 WirelessCDMA2000_HRPD_RevA(1),
		 WirelessCDMA2000_HRPD_RevB(2),
		 WirelessCDMA2000_HRPD_RevC(3);

		 private SubtypeEnum(int id) {
			 this.id = id;
		 }

		 public final int id;
	}

	public Subtype(Subtype value) {
		super(value);
	}

	public Subtype() {
		super(64);
	}
}