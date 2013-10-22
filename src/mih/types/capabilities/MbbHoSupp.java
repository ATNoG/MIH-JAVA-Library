//==============================================================================
// Brief   : MBB_HO_SUPP Data Type
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
import mih.types.informationelements.NetworkType;
import mih.types.general.Boolean;

public class MbbHoSupp
		extends
		Sequence<NetworkType, NetworkType, Boolean, Sequence.ObjectNull, Sequence.ObjectNull, Sequence.ObjectNull, Sequence.ObjectNull, Sequence.ObjectNull, Sequence.ObjectNull, Sequence.ObjectNull, Sequence.ObjectNull>
		implements Serializeable {

	public MbbHoSupp(NetworkType first, NetworkType second, Boolean mbb) {
		super(first, second, mbb);
	}

	public MbbHoSupp(MbbHoSupp value) {
		super(value.getFirstNetworkType(), value.getSecondNetworkType(), value.getMbbSupport());
	}

	public MbbHoSupp() {
		super(new NetworkType(), new NetworkType(), new Boolean());
	}

	public NetworkType getFirstNetworkType() {
		return getA();
	}

	public void setFirstNetworkType(NetworkType type) {
		setA(type);
	}

	public NetworkType getSecondNetworkType() {
		return getB();
	}

	public void setSecondNetworkType(NetworkType type) {
		setB(type);
	}

	public Boolean getMbbSupport() {
		return getC();
	}

	public void setMbbSupport(Boolean mbb) {
		setC(mbb);
	}
}
