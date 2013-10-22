//==============================================================================
// Brief   : IP_CONFIG Data Type
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
import mih.types.basic.Sequence;
import mih.types.informationelements.auxiliar.NullAccRtrChoice;
import mih.types.informationelements.auxiliar.NullDhcpServChoice;
import mih.types.informationelements.auxiliar.NullFnAgntChoice;
import mih.types.ipconfiguration.IpCfgMthds;

public class IpConfig
		extends
		Sequence<IpCfgMthds, NullDhcpServChoice, NullFnAgntChoice, NullAccRtrChoice, Sequence.ObjectNull, Sequence.ObjectNull, Sequence.ObjectNull, Sequence.ObjectNull, Sequence.ObjectNull, Sequence.ObjectNull, Sequence.ObjectNull>
		implements Serializeable {

	public IpConfig(IpCfgMthds ipCfgMthds, NullDhcpServChoice dhcpServ, NullFnAgntChoice fnAgnt, NullAccRtrChoice accRtr) {
		super(ipCfgMthds, dhcpServ, fnAgnt, accRtr);
	}

	public IpConfig(IpConfig value) {
		super(value.getIpCfgMthds(), value.getDhcpServ(), value.getFnAgnt(), value.getAccRtr());
	}

	public IpConfig() {
		super(new IpCfgMthds(), new NullDhcpServChoice(), new NullFnAgntChoice(), new NullAccRtrChoice());
	}

	public IpCfgMthds getIpCfgMthds() {
		return getA();
	}

	public void setIpCfgMthds(IpCfgMthds ipCfgMthds) {
		setA(ipCfgMthds);
	}

	public NullDhcpServChoice getDhcpServ() {
		return getB();
	}

	public void setDhcpServ(NullDhcpServChoice dhcpServ) {
		setB(dhcpServ);
	}

	public NullFnAgntChoice getFnAgnt() {
		return getC();
	}

	public void setFnAgnt(NullFnAgntChoice fnAgnt) {
		setC(fnAgnt);
	}

	public NullAccRtrChoice getAccRtr() {
		return getD();
	}

	public void setAccRtr(NullAccRtrChoice accRtr) {
		setD(accRtr);
	}
}
