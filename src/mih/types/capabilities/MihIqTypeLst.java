//==============================================================================
// Brief   : MIH_IQ_TYPE_LST Data Type
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

package mih.types.capabilities;

import mih.types.Serializeable;
import mih.types.basic.Bitmap;

public class MihIqTypeLst extends Bitmap implements Serializeable {

	public enum MihIqTypeLstEnum {
		 BinaryData(0),
		 RdfData(1),
		 RdfSchemaUrl(2),
		 RdfSchema(3),
		 IeNetworkType(4),
		 IeOperatorId(5),
		 IeServiceProviderId(6),
		 IeCountryCode(7),
		 IeNetworkId(8),
		 IeNetworkAuxId(9),
		 IeRoamingPartners(10),
		 IeCost(11),
		 IeNetworkQos(12),
		 IeNetworkDataRate(13),
		 IeNetRegultDomain(14),
		 IeNetFrequencyBands(15),
		 IeNetIpCgfMethods(16),
		 IeNetCapabilities(17),
		 IeNetSupportedLcp(18),
		 IeNetMobMgmtProt(19),
		 IeNetEmservProxy(20),
		 IeNetImsProxyCscf(21),
		 IeNetMobileNetwork(22),
		 IePoaLinkAddr(23),
		 IePoaLocation(24),
		 IePoaChannelRange(25),
		 IePoaSystemInfo(26),
		 IePoaSubnetInfo(27),
		 IePoaIpAddr(28);

		 private MihIqTypeLstEnum(int id) {
			 this.id = id;
		 }

		 public final int id;
	}

	public MihIqTypeLst(MihIqTypeLstEnum value) {
		super(64);
		set(value.id);
	}

	public MihIqTypeLst(MihIqTypeLst value) {
		super(value);
	}

	public MihIqTypeLst() {
		super(64);
	}
}