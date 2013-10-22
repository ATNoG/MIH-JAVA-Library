//==============================================================================
// Brief   : LINK_DET_CFG Data Type
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
import mih.types.basic.Sequence;
import mih.types.capabilities.auxiliar.NullLinkDataRateChoice;
import mih.types.capabilities.auxiliar.NullNetworkIdChoice;
import mih.types.capabilities.auxiliar.NullSigStrengthChoice;

public class LinkDetCfg
		extends
		Sequence<NullNetworkIdChoice, NullSigStrengthChoice, NullLinkDataRateChoice, Sequence.ObjectNull, Sequence.ObjectNull, Sequence.ObjectNull, Sequence.ObjectNull, Sequence.ObjectNull, Sequence.ObjectNull, Sequence.ObjectNull, Sequence.ObjectNull>
		implements Serializeable {

	public LinkDetCfg(NullNetworkIdChoice networkId, NullSigStrengthChoice sigStrength, NullLinkDataRateChoice linkDataRate) {
		super(networkId, sigStrength, linkDataRate);
	}

	public LinkDetCfg(LinkDetCfg value) {
		super(value.getNetworkId(), value.getSigStrength(), value.getLinkDataRate());
	}

	public LinkDetCfg() {
		super(new NullNetworkIdChoice(), new NullSigStrengthChoice(), new NullLinkDataRateChoice());
	}

	public NullNetworkIdChoice getNetworkId() {
		return getA();
	}

	public void setNetworkId(NullNetworkIdChoice networkType) {
		setA(networkType);
	}

	public NullSigStrengthChoice getSigStrength() {
		return getB();
	}

	public void setSigStrength(NullSigStrengthChoice sigStrength) {
		setB(sigStrength);
	}

	public NullLinkDataRateChoice getLinkDataRate() {
		return getC();
	}

	public void setLinkDataRate(NullLinkDataRateChoice linkDataRate) {
		setC(linkDataRate);
	}
}
